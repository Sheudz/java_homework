package semester1.practice08;

public class LinearFunction
{
    protected double k;
    protected double b;

    public LinearFunction(double k, double b)
    {
        this.k = k;
        this.b = b;
    }
    public double evaluate(double x)
    {
        return k * x + b;
    }
    @Override
    public String toString()
    {
        return "f(x) = " + k + "x + " + b;
    }
}

class QuadraticFunction extends LinearFunction
{
    private double a;

    public QuadraticFunction(double a, double k, double b)
    {
        super(k, b);
        this.a = (Double.isFinite(a) && a != 0) ? a : 1;
    }
    @Override
    public double evaluate(double x)
    {
        return a * x * x + super.evaluate(x);
    }
    public double getVertexX()
    {
        return -k / (2 * a);
    }
    @Override
    public String toString()
    {
        return "f(x) = " + a + "x^2 + " + k + "x + " + b + " Вершина: (" + getVertexX() + "; " + evaluate(getVertexX()) + ")";
    }
}
