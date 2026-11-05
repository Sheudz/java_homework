package semester1.practice09;

public abstract class AbstractSequence
{
    private final String title;

    public AbstractSequence(String title)
    {
        this.title = title;
    }
    public abstract double getTerm(int index);

    public double sumFirstN(int n)
    {
        double sum = 0;
        for (int i = 1; i <= n; i++)
        {
            sum += getTerm(i);
        }
        return sum;
    }
    @Override
    public String toString()
    {
        return title;
    }
}

class HarmonicSequence extends AbstractSequence
{
    public HarmonicSequence()
    {
        super("a(n) = 1/n");
    }
    @Override
    public double getTerm(int index)
    {
        return index >= 1 ? 1.0 / index : 0;
    }
}

class SquareNumbersSequence extends AbstractSequence
{
    public SquareNumbersSequence()
    {
        super("a(n) = n^2");
    }
    @Override
    public double getTerm(int index)
    {
        return index >= 1 ? (double) index * index : 0;
    }
}
