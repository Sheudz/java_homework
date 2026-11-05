package semester1.practice09;

public abstract class AbstractSensor
{
    private final String location;
    private final double minSafe;
    private final double maxSafe;

    public AbstractSensor(String location, double minSafe, double maxSafe)
    {
        this.location = location;
        this.minSafe = minSafe;
        this.maxSafe = maxSafe;
    }
    public abstract double readValue();
    public abstract String getUnit();

    public final boolean isAlarmTriggered()
    {
        double value = readValue();
        return value < minSafe || value > maxSafe;
    }
    @Override
    public String toString()
    {
        return location + " value=" + readValue() + " " + getUnit() + " alarm=" + isAlarmTriggered();
    }
}

class PressureSensor extends AbstractSensor
{
    private final double rawValue;
    private final double calibrationFactor;

    public PressureSensor(String location, double minSafe, double maxSafe, double rawValue, double calibrationFactor)
    {
        super(location, minSafe, maxSafe);
        this.rawValue = rawValue;
        this.calibrationFactor = calibrationFactor;
    }
    @Override
    public double readValue()
    {
        return rawValue * calibrationFactor;
    }
    @Override
    public String getUnit()
    {
        return "бар";
    }
}

class RadiationSensor extends AbstractSensor
{
    private final double background;

    public RadiationSensor(String location, double minSafe, double maxSafe, double background)
    {
        super(location, minSafe, maxSafe);
        this.background = background;
    }
    @Override
    public double readValue()
    {
        return background;
    }
    @Override
    public String getUnit()
    {
        return "мкЗв/год";
    }
}
