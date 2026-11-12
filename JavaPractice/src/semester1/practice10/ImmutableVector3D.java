package semester1.practice10;

public final class ImmutableVector3D implements MetricSpaceElement
{
    private final double x;
    private final double y;
    private final double z;

    public ImmutableVector3D(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    public double distanceTo(MetricSpaceElement other)
    {
        if (other instanceof ImmutableVector3D v)
        {
            return Math.sqrt(Math.pow(x - v.x, 2) + Math.pow(y - v.y, 2) + Math.pow(z - v.z, 2));
        }
        throw new IllegalArgumentException("Потрібен тривимірний вектор");
    }
    @Override
    public double getNorm()
    {
        return Math.sqrt(x * x + y * y + z * z);
    }
    @Override
    public String toString()
    {
        return "(" + x + "; " + y + "; " + z + ")";
    }
}

interface MetricSpaceElement
{
    double distanceTo(MetricSpaceElement other);
    double getNorm();
}
