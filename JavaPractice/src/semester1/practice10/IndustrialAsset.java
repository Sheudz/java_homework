package semester1.practice10;

public abstract class IndustrialAsset
{
    private final String name;
    protected final double initialCost;
    protected final int usefulLifeYears;

    public IndustrialAsset(String name, double initialCost, int usefulLifeYears)
    {
        this.name = name;
        this.initialCost = initialCost;
        this.usefulLifeYears = usefulLifeYears;
    }
    public abstract double getBookValueAfterYears(int years);

    @Override
    public String toString()
    {
        return name;
    }
}

class LinearDepreciationAsset extends IndustrialAsset
{
    public LinearDepreciationAsset(String name, double cost, int life)
    {
        super(name, cost, life);
    }
    @Override
    public double getBookValueAfterYears(int years)
    {
        return Math.max(0, initialCost * (1 - (double) years / usefulLifeYears));
    }
}

class DecliningBalanceAsset extends IndustrialAsset
{
    private final double rate;

    public DecliningBalanceAsset(String name, double cost, int life, double rate)
    {
        super(name, cost, life);
        this.rate = rate;
    }
    @Override
    public double getBookValueAfterYears(int years)
    {
        return initialCost * Math.pow(1 - rate, years);
    }
}
