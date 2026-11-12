package semester1.practice10;

public class VectorMathOverload
{
    public double norm(double x)
    {
        return Math.abs(x);
    }
    public double norm(double x, double y)
    {
        return Math.hypot(x, y);
    }
    public double norm(double[] v)
    {
        double sum = 0;
        for (double value : v)
        {
            sum += value * value;
        }
        return Math.sqrt(sum);
    }
}

abstract class BinaryOperation
{
    public abstract double apply(double a, double b);
}

class AddOp extends BinaryOperation
{
    @Override
    public double apply(double a, double b)
    {
        return a + b;
    }
}

class MultiplyOp extends BinaryOperation
{
    @Override
    public double apply(double a, double b)
    {
        return a * b;
    }
}

class HypotenuseOp extends BinaryOperation
{
    @Override
    public double apply(double a, double b)
    {
        return Math.hypot(a, b);
    }
}
