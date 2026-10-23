package semester1.practice07;

public class MathUtils
{
    public static final double PI = 3.1415926535;
    public static final double E = 2.7182818284;

    private MathUtils() {}

    public static long factorial(int n)
    {
        if (n < 0 || n > 20)
        {
            System.out.println("Факторіал можна обчислити для чисел 0..20");
            return -1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++)
        {
            result *= i;
        }
        return result;
    }
    public static double power(double base, int exp)
    {
        double result = 1;
        long count = Math.abs((long) exp);
        for (long i = 0; i < count; i++)
        {
            result *= base;
        }
        return (exp < 0) ? 1 / result : result;
    }
    public static int gcd(int a, int b)
    {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0)
        {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static int clamp(int val, int min, int max)
    {
        if (val < min)
        {
            return min;
        }
        if (val > max)
        {
            return max;
        }
        return val;
    }
}
