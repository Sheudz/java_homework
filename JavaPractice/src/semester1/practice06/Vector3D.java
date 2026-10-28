package semester1.practice06;

public class Vector3D
{
    private double[] coords = new double[3];

    public void setCoords(double x, double y, double z)
    {
        coords[0] = x;
        coords[1] = y;
        coords[2] = z;
    }
    public double getMagnitude()
    {
        double sum = 0;
        for (double coordinate : coords)
        {
            sum += coordinate * coordinate;
        }
        return Math.sqrt(sum);
    }
    public void multiplyByScalar(double scalar)
    {
        for (int i = 0; i < coords.length; i++)
        {
            coords[i] *= scalar;
        }
    }
    public void printVector()
    {
        System.out.println("(" + coords[0] + ", " + coords[1] + ", " + coords[2] + ")");
    }
}
