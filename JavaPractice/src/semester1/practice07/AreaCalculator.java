package semester1.practice07;

public class AreaCalculator
{
    public double calculateArea(double side)
    {
        return side * side;
    }
    public double calculateArea(double width, double height)
    {
        return width * height;
    }
    public double calculateArea(double radius, boolean isCircle)
    {
        return isCircle ? Math.PI * radius * radius : radius * radius;
    }
    public double calculateArea(double a, double b, double c)
    {
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a)
        {
            return 0;
        }
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    // У ТЗ для трапеції та трикутника однакові сигнатури, тому тут інша назва.
    public double calculateTrapezoidArea(double base1, double base2, double height)
    {
        return (base1 + base2) / 2 * height;
    }
}
