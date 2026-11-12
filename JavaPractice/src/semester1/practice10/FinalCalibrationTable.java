package semester1.practice10;

import java.util.Arrays;

public class FinalCalibrationTable
{
    public static final double GRAVITY_G = 9.80665;
    private final String sensorSerial;
    private final double[] coefficients;

    public FinalCalibrationTable(String sensorSerial, double[] coefficients)
    {
        this.sensorSerial = sensorSerial;
        this.coefficients = Arrays.copyOf(coefficients, coefficients.length);
    }
    public double[] getCoefficients()
    {
        return Arrays.copyOf(coefficients, coefficients.length);
    }
    @Override
    public String toString()
    {
        return sensorSerial + " coefficients=" + Arrays.toString(coefficients);
    }
}
