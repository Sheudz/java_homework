package semester1.practice09;

public class ClosedInterval
{
    private double start;
    private double end;

    public ClosedInterval(double start, double end)
    {
        resize(start, end);
    }
    public void resize(double newStart, double newEnd)
    {
        start = Math.min(newStart, newEnd);
        end = Math.max(newStart, newEnd);
    }
    public double getLength()
    {
        return end - start;
    }
    public double getMidpoint()
    {
        return start / 2 + end / 2;
    }
    public boolean overlaps(ClosedInterval other)
    {
        return start <= other.end && other.start <= end;
    }
    @Override
    public String toString()
    {
        return "[" + start + "; " + end + "] (центр: " + getMidpoint() + ", довжина: " + getLength() + ")";
    }
}
