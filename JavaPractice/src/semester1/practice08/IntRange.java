package semester1.practice08;

public class IntRange
{
    private int min;
    private int max;

    public IntRange(int min, int max)
    {
        setBounds(min, max);
    }
    public void setBounds(int min, int max)
    {
        this.min = Math.min(min, max);
        this.max = Math.max(min, max);
    }
    public boolean contains(int value)
    {
        return value >= min && value <= max;
    }
    public int getLength()
    {
        return max - min;
    }
    @Override
    public String toString()
    {
        return "[" + min + " .. " + max + "] (довжина: " + getLength() + ")";
    }
}
