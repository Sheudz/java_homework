package semester1.practice06;

public class Triangle
{
    public double a;
    public double b;
    public double c;

    public boolean isValid()
    {
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }
    public double getPerimeter()
    {
        return a + b + c;
    }
    public double getArea()
    {
        if (!isValid())
        {
            return 0.0;
        }
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
