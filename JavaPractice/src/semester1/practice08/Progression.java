package semester1.practice08;

import java.util.Arrays;

public class Progression
{
    protected double firstTerm;
    protected double step;

    public Progression(double firstTerm, double step)
    {
        this.firstTerm = firstTerm;
        this.step = step;
    }
    public double getTerm(int index)
    {
        return firstTerm;
    }
    public double[] generateFirstN(int n)
    {
        double[] result = new double[Math.max(0, n)];
        for (int i = 0; i < result.length; i++)
        {
            result[i] = getTerm(i + 1);
        }
        return result;
    }
    @Override
    public String toString()
    {
        return "Progression{first=" + firstTerm + ", step=" + step + ", terms=" + Arrays.toString(generateFirstN(5)) + "}";
    }
}

class ArithmeticProgression extends Progression
{
    public ArithmeticProgression(double firstTerm, double step)
    {
        super(firstTerm, step);
    }
    @Override
    public double getTerm(int n)
    {
        return firstTerm + (n - 1) * step;
    }
    @Override
    public String toString()
    {
        return "a(n) = " + firstTerm + " + (n - 1) * " + step + " | " + super.toString();
    }
}

class GeometricProgression extends Progression
{
    public GeometricProgression(double firstTerm, double step)
    {
        super(firstTerm, step);
    }
    @Override
    public double getTerm(int n)
    {
        return firstTerm * Math.pow(step, n - 1);
    }
    @Override
    public String toString()
    {
        return "b(n) = " + firstTerm + " * " + step + "^(n - 1) | " + super.toString();
    }
}
