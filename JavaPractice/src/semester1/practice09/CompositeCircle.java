package semester1.practice09;

public class CompositeCircle
{
    private double radius;
    private final Point2D center;

    public CompositeCircle(double centerX, double centerY, double radius)
    {
        center = new Point2D(centerX, centerY);
        this.radius = radius;
    }
    public boolean containsPoint(Point2D p)
    {
        return center.distanceTo(p) <= radius;
    }
    @Override
    public String toString()
    {
        return "Circle{center=" + center + ", radius=" + radius + "}";
    }
}
