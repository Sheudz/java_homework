package semester1.practice08;

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
    public double distanceToOrigin()
    {
        return Math.sqrt(x * x + y * y);
    }
    @Override
    public String toString()
    {
        return "(" + x + "; " + y + ")";
    }
}

class Point3D extends Point2D
{
    private double z;

    public Point3D(double x, double y, double z)
    {
        super(x, y);
        this.z = z;
    }
    @Override
    public double distanceToOrigin()
    {
        return Math.sqrt(Math.pow(super.distanceToOrigin(), 2) + z * z);
    }
    @Override
    public String toString()
    {
        return "(" + getX() + "; " + getY() + "; " + z + ")";
    }
}
