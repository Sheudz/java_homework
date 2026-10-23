package semester1.practice07;

public class LineSegment
{
    private Point start;
    private Point end;

    public LineSegment(Point start, Point end)
    {
        this.start = start;
        this.end = end;
    }
    public LineSegment(double x1, double y1, double x2, double y2)
    {
        this(new Point(x1, y1), new Point(x2, y2));
    }
    public double getLength()
    {
        double x = end.getX() - start.getX();
        double y = end.getY() - start.getY();
        return Math.sqrt(x * x + y * y);
    }
    public Point getMidPoint()
    {
        return new Point((start.getX() + end.getX()) / 2, (start.getY() + end.getY()) / 2);
    }
    public void printSegment()
    {
        System.out.println("Відрізок: (" + start.getX() + "; " + start.getY() + ") -> (" + end.getX() + "; " + end.getY() + ")");
    }
}
