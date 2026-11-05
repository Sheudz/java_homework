package semester1.practice09;

public abstract class AbstractShape
{
    private String color;

    public AbstractShape(String color)
    {
        this.color = color;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString()
    {
        return getClass().getSimpleName() + "{color='" + color + "', area=" + getArea() + ", perimeter=" + getPerimeter() + "}";
    }
}

class CircleShape extends AbstractShape
{
    private final double radius;

    public CircleShape(String color, double radius)
    {
        super(color);
        this.radius = radius;
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
}

class RectangleShape extends AbstractShape
{
    private final double width;
    private final double height;

    public RectangleShape(String color, double width, double height)
    {
        super(color);
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
}
