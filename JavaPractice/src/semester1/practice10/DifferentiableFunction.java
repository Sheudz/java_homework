package semester1.practice10;

public abstract class DifferentiableFunction
{
    public abstract double f(double x);

    public double derivativeAt(double x)
    {
        double h = 1e-5;
        return (f(x + h) - f(x - h)) / (2 * h);
    }
}

class QuadraticParabola extends DifferentiableFunction
{
    private final double a;
    private final double b;
    private final double c;

    public QuadraticParabola(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double f(double x)
    {
        return a * x * x + b * x + c;
    }
}

class NaturalLogFunction extends DifferentiableFunction
{
    private final double k;

    public NaturalLogFunction(double k)
    {
        this.k = k;
    }
    @Override
    public double f(double x)
    {
        return k * Math.log(x);
    }
}

class ExponentialGrowth extends DifferentiableFunction
{
    private final double amplitude;
    private final double lambda;

    public ExponentialGrowth(double amplitude, double lambda)
    {
        this.amplitude = amplitude;
        this.lambda = lambda;
    }
    @Override
    public double f(double x)
    {
        return amplitude * Math.exp(lambda * x);
    }
}
