package semester1.practice10;

public abstract class AbstractVectorOperator
{
    private final String name;

    public AbstractVectorOperator(String name)
    {
        this.name = name;
    }
    public abstract Vec2D transform(Vec2D v);

    @Override
    public String toString()
    {
        return name;
    }
}

class Vec2D
{
    final double x;
    final double y;

    public Vec2D(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString()
    {
        return "(" + x + "; " + y + ")";
    }
}

interface InvertibleOperator
{
    Vec2D inverseTransform(Vec2D v);
}

class Rotation2DOperator extends AbstractVectorOperator implements InvertibleOperator
{
    private final double angle;

    public Rotation2DOperator(double angle)
    {
        super("Поворот");
        this.angle = angle;
    }
    @Override
    public Vec2D transform(Vec2D v)
    {
        return new Vec2D(v.x * Math.cos(angle) - v.y * Math.sin(angle), v.x * Math.sin(angle) + v.y * Math.cos(angle));
    }
    @Override
    public Vec2D inverseTransform(Vec2D v)
    {
        return new Vec2D(v.x * Math.cos(angle) + v.y * Math.sin(angle), -v.x * Math.sin(angle) + v.y * Math.cos(angle));
    }
}

class ProjectionXOperator extends AbstractVectorOperator
{
    public ProjectionXOperator()
    {
        super("Проєкція OX");
    }
    @Override
    public Vec2D transform(Vec2D v)
    {
        return new Vec2D(v.x, 0);
    }
}
