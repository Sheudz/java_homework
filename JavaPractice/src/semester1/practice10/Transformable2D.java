package semester1.practice10;

public interface Transformable2D
{
    void translate(double dx, double dy);
    void scale(double factor);
}

class BoundingBox implements Transformable2D
{
    private double x;
    private double y;
    private double width;
    private double height;

    public BoundingBox(double x, double y, double width, double height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    @Override
    public void translate(double dx, double dy)
    {
        x += dx;
        y += dy;
    }
    @Override
    public void scale(double factor)
    {
        width *= factor;
        height *= factor;
    }
    @Override
    public String toString()
    {
        return "Box{position=(" + x + "; " + y + "), size=" + width + "x" + height + "}";
    }
}

class CircleRegion implements Transformable2D
{
    private double x;
    private double y;
    private double radius;

    public CircleRegion(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    @Override
    public void translate(double dx, double dy)
    {
        x += dx;
        y += dy;
    }
    @Override
    public void scale(double factor)
    {
        radius *= factor;
    }
    @Override
    public String toString()
    {
        return "Circle{center=(" + x + "; " + y + "), radius=" + radius + "}";
    }
}
