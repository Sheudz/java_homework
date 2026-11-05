package semester1.practice09;

public abstract class AbstractPowerPlant
{
    private final String stationName;
    protected double baseCapacityMw;

    public AbstractPowerPlant(String stationName, double baseCapacityMw)
    {
        this.stationName = stationName;
        this.baseCapacityMw = baseCapacityMw;
    }
    public abstract double generateMegawatts();

    public double calculateDailyProfit(double tariffPerMwh)
    {
        return generateMegawatts() * 24 * tariffPerMwh;
    }
    @Override
    public String toString()
    {
        return stationName + " generation=" + generateMegawatts() + " MW";
    }
}

class SolarPowerPlant extends AbstractPowerPlant
{
    private double sunIntensityFactor;

    public SolarPowerPlant(String name, double capacity, double sunIntensityFactor)
    {
        super(name, capacity);
        this.sunIntensityFactor = Math.max(0, Math.min(1, sunIntensityFactor));
    }
    @Override
    public double generateMegawatts()
    {
        return baseCapacityMw * sunIntensityFactor;
    }
}

class WindPowerPlant extends AbstractPowerPlant
{
    private double windSpeedMs;

    public WindPowerPlant(String name, double capacity, double windSpeedMs)
    {
        super(name, capacity);
        this.windSpeedMs = windSpeedMs;
    }
    @Override
    public double generateMegawatts()
    {
        if (windSpeedMs < 3 || windSpeedMs > 25)
        {
            return 0;
        }
        return baseCapacityMw * Math.min(1, Math.pow(windSpeedMs / 12, 3));
    }
}
