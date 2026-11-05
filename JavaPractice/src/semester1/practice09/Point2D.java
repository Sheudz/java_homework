package semester1.practice09;

public class Point2D
{
    private double x;
    private double y;

    public Point2D(double x, double y)
    {
        this.x = x;
        this.y = y;
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
        return "(" + x + "; " + y + ")";
    }
}
