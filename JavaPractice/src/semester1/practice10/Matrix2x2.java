package semester1.practice10;

public class Matrix2x2
{
    protected final double a11;
    protected final double a12;
    protected final double a21;
    protected final double a22;

    public Matrix2x2(double a11, double a12, double a21, double a22)
    {
        this.a11 = a11;
        this.a12 = a12;
        this.a21 = a21;
        this.a22 = a22;
    }
    public double determinant()
    {
        return a11 * a22 - a12 * a21;
    }
    @Override
    public String toString()
    {
        return "[[" + a11 + ", " + a12 + "], [" + a21 + ", " + a22 + "]] det=" + determinant();
    }
}

interface InvertibleMatrix
{
    Matrix2x2 inverse();
}

interface OrthogonalMatrix
{
    boolean checkOrthogonality();
}

class RotationMatrix2x2 extends Matrix2x2 implements InvertibleMatrix, OrthogonalMatrix
{
    public RotationMatrix2x2(double angle)
    {
        super(Math.cos(angle), -Math.sin(angle), Math.sin(angle), Math.cos(angle));
    }
    @Override
    public Matrix2x2 inverse()
    {
        return new Matrix2x2(a11, a21, a12, a22);
    }
    @Override
    public boolean checkOrthogonality()
    {
        return Math.abs(a11 * a11 + a21 * a21 - 1) < 1e-6
                && Math.abs(a12 * a12 + a22 * a22 - 1) < 1e-6
                && Math.abs(a11 * a12 + a21 * a22) < 1e-6;
    }
}

class SingularMatrix2x2 extends Matrix2x2
{
    public SingularMatrix2x2(double a, double b)
    {
        super(a, b, 2 * a, 2 * b);
    }
}
