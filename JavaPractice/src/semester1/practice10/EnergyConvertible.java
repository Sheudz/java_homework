package semester1.practice10;

public interface EnergyConvertible
{
    double SPEED_OF_LIGHT = 299_792_458.0;
    double JOULES_PER_KWH = 3_600_000.0;

    double getEnergyJoules();

    default double getEnergyKwh()
    {
        return getEnergyJoules() / JOULES_PER_KWH;
    }
}

class KineticBody implements EnergyConvertible
{
    private final double massKg;
    private final double speedMs;

    public KineticBody(double massKg, double speedMs)
    {
        this.massKg = massKg;
        this.speedMs = speedMs;
    }
    @Override
    public double getEnergyJoules()
    {
        return massKg * speedMs * speedMs / 2;
    }
}

class BatteryCell implements EnergyConvertible
{
    private final double capacityWh;

    public BatteryCell(double capacityWh)
    {
        this.capacityWh = capacityWh;
    }
    @Override
    public double getEnergyJoules()
    {
        return capacityWh * 3600;
    }
}
