package semester1.practice09.homework;

import java.util.Locale;

public class Task1CompositeShapesCanvas {
    public static void main(String args[])
    {
        // TASK 1
        Point2D center = new Point2D(0, 0);
        Circle2D circle = new Circle2D("Коло-А", center, 5);
        GeometryCanvas canvas = new GeometryCanvas("Інженерне креслення №1", 5);
        canvas.addShape(circle);
        canvas.addShape(new Rectangle2D("Плита-Б", new Point2D(10, 5), 4, 6));
        canvas.addShape(new RightTriangle2D("Клин-В", new Point2D(-3, 2), 3, 4));

        center.translate(100, 100);
        Point2D copy = circle.getAnchorPoint();
        copy.translate(200, 200);
        System.out.println("Центр кола після зміни зовнішньої точки та копії: " + circle.getAnchorPoint());
        System.out.println(canvas);
        System.out.printf(Locale.US, "Сумарна площа: %.2f\n", canvas.getTotalArea());
        System.out.printf(Locale.US, "Сумарний периметр: %.2f\n", canvas.getTotalPerimeter());
        System.out.println("Найбільша фігура: " + canvas.findLargestShape());
        canvas.moveAllShapes(5, -2);
        System.out.println("Після зсуву (+5; -2):");
        System.out.println(canvas);
    }
}

class Point2D
{
    private double x;
    private double y;

    public Point2D(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public Point2D(Point2D other)
    {
        this(other.x, other.y);
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public void translate(double dx, double dy)
    {
        x += dx;
        y += dy;
    }
    public double distanceTo(Point2D other)
    {
        return Math.hypot(x - other.x, y - other.y);
    }
    @Override
    public String toString()
    {
        return String.format(Locale.US, "(%.2f; %.2f)", x, y);
    }
}

abstract class AbstractShape2D
{
    private final String name;
    private final Point2D anchorPoint;

    public AbstractShape2D(String name, Point2D anchorPoint)
    {
        this.name = name;
        this.anchorPoint = anchorPoint != null ? new Point2D(anchorPoint) : new Point2D(0, 0);
    }
    public String getName()
    {
        return name;
    }
    public Point2D getAnchorPoint()
    {
        return new Point2D(anchorPoint);
    }
    public void moveBy(double dx, double dy)
    {
        anchorPoint.translate(dx, dy);
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString()
    {
        return String.format(Locale.US, "name='%s', center=%s, S=%.2f, P=%.2f", name, anchorPoint, getArea(), getPerimeter());
    }
}

class Circle2D extends AbstractShape2D
{
    private double radius;

    public Circle2D(String name, Point2D center, double radius)
    {
        super(name, center);
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
    public String toString()
    {
        return String.format(Locale.US, "Circle2D[r=%.2f, %s]", radius, super.toString());
    }
}

class Rectangle2D extends AbstractShape2D
{
    private double width;
    private double height;

    public Rectangle2D(String name, Point2D center, double width, double height)
    {
        super(name, center);
        this.width = width > 0 ? width : 1;
        this.height = height > 0 ? height : 1;
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
    public String toString()
    {
        return String.format(Locale.US, "Rectangle2D[%.2fx%.2f, %s]", width, height, super.toString());
    }
}

class RightTriangle2D extends AbstractShape2D
{
    private double legA;
    private double legB;

    public RightTriangle2D(String name, Point2D center, double legA, double legB)
    {
        super(name, center);
        this.legA = legA > 0 ? legA : 1;
        this.legB = legB > 0 ? legB : 1;
    }
    public double getHypotenuse()
    {
        return Math.hypot(legA, legB);
    }
    @Override
    public double getArea()
    {
        return legA * legB / 2;
    }
    @Override
    public double getPerimeter()
    {
        return legA + legB + getHypotenuse();
    }
    @Override
    public String toString()
    {
        return String.format(Locale.US, "RightTriangle2D[a=%.2f, b=%.2f, c=%.2f, %s]", legA, legB, getHypotenuse(), super.toString());
    }
}

class GeometryCanvas
{
    private final String title;
    private final AbstractShape2D[] shapes;
    private int count;

    public GeometryCanvas(String title, int capacity)
    {
        this.title = title;
        shapes = new AbstractShape2D[capacity];
    }
    public boolean addShape(AbstractShape2D shape)
    {
        if (shape == null || count == shapes.length)
        {
            return false;
        }
        shapes[count++] = shape;
        return true;
    }
    public double getTotalArea()
    {
        double total = 0;
        for (int i = 0; i < count; i++)
        {
            total += shapes[i].getArea();
        }
        return total;
    }
    public double getTotalPerimeter()
    {
        double total = 0;
        for (int i = 0; i < count; i++)
        {
            total += shapes[i].getPerimeter();
        }
        return total;
    }
    public AbstractShape2D findLargestShape()
    {
        AbstractShape2D largest = null;
        for (int i = 0; i < count; i++)
        {
            if (largest == null || shapes[i].getArea() > largest.getArea())
            {
                largest = shapes[i];
            }
        }
        return largest;
    }
    public void moveAllShapes(double dx, double dy)
    {
        for (int i = 0; i < count; i++)
        {
            shapes[i].moveBy(dx, dy);
        }
    }
    @Override
    public String toString()
    {
        String result = "Полотно: '" + title + "' (Фігур: " + count + "/" + shapes.length + ")";
        for (int i = 0; i < count; i++)
        {
            result += "\n" + (i + 1) + ". " + shapes[i];
        }
        return result;
    }
}
