package semester1.practice10.homework;

import java.util.Locale;

public class Task1PolymorphicShapesAndTransforms {
    public static void main(String args[])
    {
        // TASK 1
        AbstractShape2D[] shapes = {
                new CircleShape("Коло-Лінза", 0, 0, 5),
                new RectangleShape("Рамка-А", 2, 3, 4, 6),
                new ImmutableReferenceSquare("Еталон-Квадрат", 10, 10, 5)
        };
        System.out.println("До трансформації:");
        double[] originalAreas = new double[shapes.length];
        for (int i = 0; i < shapes.length; i++)
        {
            originalAreas[i] = shapes[i].getArea();
            System.out.println(shapes[i]);
        }
        System.out.printf(Locale.US, "Сумарна площа: %.2f\n", calculateTotalArea(shapes));
        transformScene(shapes, 2, 45);
        System.out.println("Після масштабування x2 та повороту на 45 градусів:");
        for (int i = 0; i < shapes.length; i++)
        {
            System.out.println(shapes[i]);
            System.out.printf(Locale.US, "Відношення площ після/до: %.1f\n", shapes[i].getArea() / originalAreas[i]);
        }
        System.out.printf(Locale.US, "Сумарна площа: %.2f\n", calculateTotalArea(shapes));
    }

    public static double calculateTotalArea(AbstractShape2D[] shapes)
    {
        double sum = 0;
        for (AbstractShape2D shape : shapes)
        {
            sum += shape.getArea();
        }
        return sum;
    }
    public static void transformScene(AbstractShape2D[] shapes, double scaleFactor, double rotateDeg)
    {
        for (AbstractShape2D shape : shapes)
        {
            if (shape instanceof Scalable2D s)
            {
                s.scale(scaleFactor);
            }
            if (shape instanceof Rotatable2D r)
            {
                r.rotate(rotateDeg);
            }
        }
    }
}

interface Scalable2D
{
    double MIN_SCALE_FACTOR = 0.1;
    void scale(double factor);
}

interface Rotatable2D
{
    void rotate(double deltaDegrees);
    double getRotationAngle();
}

abstract class AbstractShape2D
{
    private final String name;
    private double centerX;
    private double centerY;

    public AbstractShape2D(String name, double centerX, double centerY)
    {
        this.name = name;
        this.centerX = centerX;
        this.centerY = centerY;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    public final double getIsoperimetricQuotient()
    {
        double perimeter = getPerimeter();
        return 4 * Math.PI * getArea() / (perimeter * perimeter);
    }
    @Override
    public String toString()
    {
        return String.format(Locale.US, "'%s', center=(%.1f; %.1f), S=%.2f, P=%.2f, Q=%.4f", name, centerX, centerY, getArea(), getPerimeter(), getIsoperimetricQuotient());
    }
}

class CircleShape extends AbstractShape2D implements Scalable2D
{
    private double radius;

    public CircleShape(String name, double x, double y, double radius)
    {
        super(name, x, y);
        this.radius = radius > 0 ? radius : 1;
    }
    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
    @Override
    public void scale(double factor)
    {
        radius *= Math.max(MIN_SCALE_FACTOR, factor);
    }
    @Override
    public String toString()
    {
        return String.format(Locale.US, "CircleShape[r=%.2f, %s]", radius, super.toString());
    }
}

class RectangleShape extends AbstractShape2D implements Scalable2D, Rotatable2D
{
    private double width;
    private double height;
    private double rotationAngle;

    public RectangleShape(String name, double x, double y, double width, double height)
    {
        super(name, x, y);
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea()
    {
        return width * height;
    }
    @Override
    public double getPerimeter()
    {
        return 2 * (width + height);
    }
    @Override
    public void scale(double factor)
    {
        factor = Math.max(MIN_SCALE_FACTOR, factor);
        width *= factor;
        height *= factor;
    }
    @Override
    public void rotate(double deltaDegrees)
    {
        rotationAngle = ((rotationAngle + deltaDegrees) % 360 + 360) % 360;
    }
    @Override
    public double getRotationAngle()
    {
        return rotationAngle;
    }
    @Override
    public String toString()
    {
        return String.format(Locale.US, "RectangleShape[%.2fx%.2f, angle=%.1f, %s]", width, height, rotationAngle, super.toString());
    }
}

final class ImmutableReferenceSquare extends AbstractShape2D
{
    private final double side;

    public ImmutableReferenceSquare(String name, double x, double y, double side)
    {
        super(name, x, y);
        this.side = side;
    }
    @Override
    public double getArea()
    {
        return side * side;
    }
    @Override
    public double getPerimeter()
    {
        return 4 * side;
    }
    @Override
    public String toString()
    {
        return String.format(Locale.US, "ImmutableReferenceSquare[side=%.2f, %s]", side, super.toString());
    }
}
