package semester1.practice08;

public class Rectangle
{
    private double width;
    private double height;

    public Rectangle(double width, double height)
    {
        this.width = (width > 0) ? width : 1;
        this.height = (height > 0) ? height : 1;
    }
    public double getWidth()
    {
        return width;
    }
    public double getHeight()
    {
        return height;
    }
    public double getArea()
    {
        return width * height;
    }
    @Override
    public String toString()
    {
        return "Rectangle{width=" + width + ", height=" + height + ", area=" + getArea() + "}";
    }
}

class Box3D extends Rectangle
{
    private double depth;

    public Box3D(double width, double height, double depth)
    {
        super(width, height);
        this.depth = (depth > 0) ? depth : 1;
    }
    public double getVolume()
    {
        return super.getArea() * depth;
    }
    @Override
    public String toString()
    {
        return "Box3D{" + super.toString() + ", depth=" + depth + ", volume=" + getVolume() + "}";
    }
}
