package semester1.practice10;

public interface Measurable
{
    double getMeasure();
}

class BankVault implements Measurable
{
    private final double goldKg;

    public BankVault(double goldKg)
    {
        this.goldKg = goldKg;
    }
    @Override
    public double getMeasure()
    {
        return goldKg;
    }
}

class HighwayRoute implements Measurable
{
    private final double lengthKm;

    public HighwayRoute(double lengthKm)
    {
        this.lengthKm = lengthKm;
    }
    @Override
    public double getMeasure()
    {
        return lengthKm;
    }
}

class CpuCore implements Measurable
{
    private final double frequencyGhz;

    public CpuCore(double frequencyGhz)
    {
        this.frequencyGhz = frequencyGhz;
    }
    @Override
    public double getMeasure()
    {
        return frequencyGhz;
    }
}
