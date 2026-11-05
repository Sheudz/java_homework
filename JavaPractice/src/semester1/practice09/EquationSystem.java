package semester1.practice09;

public class EquationSystem
{
    private final LinearEquation[] equations;
    private int count;

    public EquationSystem(int capacity)
    {
        equations = new LinearEquation[capacity];
    }
    public boolean addEquation(LinearEquation equation)
    {
        if (equation == null || count == equations.length)
        {
            return false;
        }
        equations[count++] = equation;
        return true;
    }
    public boolean checkSolution(double x, double y)
    {
        for (int i = 0; i < count; i++)
        {
            if (!equations[i].isSatisfiedBy(x, y))
            {
                return false;
            }
        }
        return true;
    }
    @Override
    public String toString()
    {
        String result = "Система рівнянь:";
        for (int i = 0; i < count; i++)
        {
            result += "\n" + equations[i];
        }
        return result;
    }
}

class LinearEquation
{
    private final double a;
    private final double b;
    private final double c;

    public LinearEquation(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean isSatisfiedBy(double x, double y)
    {
        return Math.abs(a * x + b * y - c) <= 1e-6;
    }
    @Override
    public String toString()
    {
        return a + "*x + " + b + "*y = " + c;
    }
}
