package semester1.practice08;

public class Circle
{
    private double radius;

    public Circle(double radius)
    {
        setRadius(radius);
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = (Double.isFinite(radius) && radius > 0) ? radius : 1.0;
    }
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    public double getCircumference()
    {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString()
    {
        return "Circle{radius=" + radius + ", area=" + getArea() + ", circumference=" + getCircumference() + "}";
    }
}
