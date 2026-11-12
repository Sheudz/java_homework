package semester1.practice10;

public class FunctionAnalyzer
{
    public static void analyze(AbstractAnalyticFunction[] functions)
    {
        for (AbstractAnalyticFunction function : functions)
        {
            System.out.println("Інтеграл [0; 3]: " + function.integrateTrapezoid(0, 3, 10000));
            if (function instanceof RootFindable root)
            {
                System.out.println("Корінь [2; 3]: " + root.findRootBisection(2, 3, 1e-6));
            }
        }
    }
}

interface Integrable1D
{
    double evaluate(double x);

    default double integrateTrapezoid(double a, double b, int n)
    {
        double step = (b - a) / n;
        double sum = (evaluate(a) + evaluate(b)) / 2;
        for (int i = 1; i < n; i++)
        {
            sum += evaluate(a + i * step);
        }
        return sum * step;
    }
}

interface RootFindable
{
    double findRootBisection(double left, double right, double eps);
}

abstract class AbstractAnalyticFunction implements Integrable1D
{
}

class CubicFunction extends AbstractAnalyticFunction implements RootFindable
{
    @Override
    public double evaluate(double x)
    {
        return x * x * x - 2 * x - 5;
    }
    @Override
    public double findRootBisection(double left, double right, double eps)
    {
        while (right - left > eps)
        {
            double middle = (left + right) / 2;
            if (evaluate(middle) == 0)
            {
                return middle;
            }
            if (evaluate(left) * evaluate(middle) < 0)
            {
                right = middle;
            }
            else
            {
                left = middle;
            }
        }
        return (left + right) / 2;
    }
}
