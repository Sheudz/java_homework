package semester1.practice08;

public class Segment1D
{
    protected double length;

    public Segment1D(double length)
    {
        this.length = (length > 0) ? length : 1;
    }
    @Override
    public String toString()
    {
        return "Segment1D{length=" + length + "}";
    }
}

class Square2D extends Segment1D
{
    public Square2D(double length)
    {
        super(length);
    }
    public double getPerimeter()
    {
        return 4 * length;
    }
    public double getArea()
    {
        return length * length;
    }
    @Override
    public String toString()
    {
        return "Square2D{" + super.toString() + ", perimeter=" + getPerimeter() + ", area=" + getArea() + "}";
    }
}

class Cube3D extends Square2D
{
    public Cube3D(double length)
    {
        super(length);
    }
    @Override
    public double getArea()
    {
        return 6 * super.getArea();
    }
    public double getVolume()
    {
        return super.getArea() * length;
    }
    @Override
    public String toString()
    {
        return "Cube3D{side=" + length + ", surfaceArea=" + getArea() + ", volume=" + getVolume() + "}";
    }
}
