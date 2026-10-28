package semester1.practice07;

public class Fraction
{
    private int numerator;
    private int denominator;

    Fraction(int numerator, int denominator)
    {
        if (denominator == 0)
        {
            System.out.println("Помилка: знаменник не може бути 0!");
            denominator = 1;
        }
        if (denominator < 0)
        {
            numerator = -numerator;
            denominator = -denominator;
        }
        int a = Math.abs(numerator);
        int b = denominator;
        while (b != 0)
        {
            int temp = a % b;
            a = b;
            b = temp;
        }
        this.numerator = numerator / a;
        this.denominator = denominator / a;
    }
    Fraction(int wholeNumber)
    {
        this(wholeNumber, 1);
    }
    Fraction()
    {
        this(0, 1);
    }
    public void print()
    {
        System.out.println((denominator == 1) ? "" + numerator : numerator + "/" + denominator);
    }
    public double toDouble()
    {
        return (double) numerator / denominator;
    }
}
