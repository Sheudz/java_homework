package semester1.practice09;

import java.util.Arrays;

public class SignalProcessor
{
    private final AbstractFilter[] pipeline;
    private int count;

    public SignalProcessor(int capacity)
    {
        pipeline = new AbstractFilter[capacity];
    }
    public boolean addFilter(AbstractFilter filter)
    {
        if (filter == null || count == pipeline.length)
        {
            return false;
        }
        pipeline[count++] = filter;
        return true;
    }
    public double[] process(double[] signal)
    {
        double[] result = Arrays.copyOf(signal, signal.length);
        for (int i = 0; i < count; i++)
        {
            for (int j = 0; j < result.length; j++)
            {
                result[j] = pipeline[i].processSample(result[j]);
            }
        }
        return result;
    }
    @Override
    public String toString()
    {
        String result = "SignalProcessor:";
        for (int i = 0; i < count; i++)
        {
            result += " " + pipeline[i];
        }
        return result;
    }
}

abstract class AbstractFilter
{
    private final String filterName;

    public AbstractFilter(String filterName)
    {
        this.filterName = filterName;
    }
    public abstract double processSample(double x);

    @Override
    public String toString()
    {
        return filterName;
    }
}

class AmplifierFilter extends AbstractFilter
{
    private final double gain;

    public AmplifierFilter(double gain)
    {
        super("Amplifier");
        this.gain = gain;
    }
    @Override
    public double processSample(double x)
    {
        return x * gain;
    }
}

class ClippingFilter extends AbstractFilter
{
    private final double threshold;

    public ClippingFilter(double threshold)
    {
        super("Clipping");
        this.threshold = threshold;
    }
    @Override
    public double processSample(double x)
    {
        return Math.max(-threshold, Math.min(threshold, x));
    }
}
