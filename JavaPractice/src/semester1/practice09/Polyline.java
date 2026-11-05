package semester1.practice09;

public class Polyline
{
    private final Point2D[] vertices;
    private int count;

    public Polyline(int capacity)
    {
        vertices = new Point2D[capacity];
    }
    public void addVertex(double x, double y)
    {
        if (count < vertices.length)
        {
            vertices[count++] = new Point2D(x, y);
        }
    }
    public double getTotalLength()
    {
        double length = 0;
        for (int i = 1; i < count; i++)
        {
            length += vertices[i - 1].distanceTo(vertices[i]);
        }
        return length;
    }
    public double getClosedPerimeter()
    {
        return getTotalLength() + (count < 2 ? 0 : vertices[count - 1].distanceTo(vertices[0]));
    }
    @Override
    public String toString()
    {
        String result = "Polyline:";
        for (int i = 0; i < count; i++)
        {
            result += " " + vertices[i];
        }
        return result + " length=" + getTotalLength() + " perimeter=" + getClosedPerimeter();
    }
}
