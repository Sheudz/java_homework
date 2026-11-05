package semester1.practice09;

import java.util.Arrays;

public class EncapsulatedPolynomial
{
    private final double[] coeffs;

    public EncapsulatedPolynomial(double[] coeffs)
    {
        this.coeffs = Arrays.copyOf(coeffs, coeffs.length);
    }
    public int getDegree()
    {
        int degree = coeffs.length - 1;
        while (degree > 0 && coeffs[degree] == 0)
        {
            degree--;
        }
        return Math.max(0, degree);
    }
    public double getCoefficient(int power)
    {
        return power >= 0 && power < coeffs.length ? coeffs[power] : 0;
    }
    public double evaluate(double x)
    {
        double result = 0;
        for (int i = coeffs.length - 1; i >= 0; i--)
        {
            result = result * x + coeffs[i];
        }
        return result;
    }
    @Override
    public String toString()
    {
        String result = "";
        for (int i = coeffs.length - 1; i >= 0; i--)
        {
            if (coeffs[i] != 0)
            {
                if (!result.isEmpty())
                {
                    result += coeffs[i] < 0 ? " - " : " + ";
                }
                else if (coeffs[i] < 0)
                {
                    result += "-";
                }
                result += Math.abs(coeffs[i]);
                if (i > 0)
                {
                    result += "*x";
                }
                if (i > 1)
                {
                    result += "^" + i;
                }
            }
        }
        return "P(x) = " + (result.isEmpty() ? "0" : result);
    }
}
