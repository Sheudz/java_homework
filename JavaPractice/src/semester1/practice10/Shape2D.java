package semester1.practice10;

public abstract class Shape2D
{
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString()
    {
        return getClass().getSimpleName() + " S=" + getArea() + " P=" + getPerimeter();
    }
}

class CircleShape extends Shape2D
{
    private final double radius;

    public CircleShape(double radius)
    {
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
    public double getDiameter()
    {
        return 2 * radius;
    }
}

class RectangleShape extends Shape2D
{
    private final double width;
    private final double height;

    public RectangleShape(double width, double height)
    {
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
    public double getDiagonal()
    {
        return Math.hypot(width, height);
    }
    public boolean isSquare()
    {
        return width == height;
    }
}

class EquilateralTriangleShape extends Shape2D
{
    private final double side;

    public EquilateralTriangleShape(double side)
    {
        this.side = side;
    }
    @Override
    public double getArea()
    {
        return Math.sqrt(3) / 4 * side * side;
    }
    @Override
    public double getPerimeter()
    {
        return 3 * side;
    }
}
