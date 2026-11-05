package semester1.practice09;

import java.util.Arrays;

public class LabMeasurement
{
    private final String experimentName;
    private final double[] samples;

    public LabMeasurement(String experimentName, double[] samples)
    {
        this.experimentName = experimentName;
        this.samples = samples == null ? new double[0] : Arrays.copyOf(samples, samples.length);
    }
    public double[] getSamples()
    {
        return Arrays.copyOf(samples, samples.length);
    }
    @Override
    public String toString()
    {
        return experimentName + ": " + Arrays.toString(samples);
    }
}
