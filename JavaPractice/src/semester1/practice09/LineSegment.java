package semester1.practice09;

public class LineSegment
{
    private final Point2D start;
    private final Point2D end;

    public LineSegment(Point2D start, Point2D end)
    {
        this.start = new Point2D(start.getX(), start.getY());
        this.end = new Point2D(end.getX(), end.getY());
    }
    public double getLength()
    {
        return start.distanceTo(end);
    }
    public Point2D getMidpoint()
    {
        return new Point2D(start.getX() / 2 + end.getX() / 2, start.getY() / 2 + end.getY() / 2);
    }
    @Override
    public String toString()
    {
        return start + " -> " + end + " Довжина: " + getLength() + " Середина: " + getMidpoint();
    }
}
