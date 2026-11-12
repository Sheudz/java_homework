package semester1.practice10;

public abstract class ShipModule
{
    protected String name;
    protected boolean damaged;

    public ShipModule(String name, boolean damaged)
    {
        this.name = name;
        this.damaged = damaged;
    }
    @Override
    public String toString()
    {
        return name + " damaged=" + damaged;
    }
}

class ShieldGenerator extends ShipModule
{
    private int energyMj;

    public ShieldGenerator(boolean damaged)
    {
        super("Генератор щита", damaged);
    }
    public void rechargeShields(int megajoules)
    {
        energyMj += megajoules;
        System.out.println("Енергія щита: " + energyMj + " MJ");
    }
}

class WarpDrive extends ShipModule
{
    public WarpDrive(boolean damaged)
    {
        super("Варп-двигун", damaged);
    }
    public boolean checkAntimatterContainment()
    {
        return !damaged;
    }
}

class LifeSupportModule extends ShipModule
{
    private final double oxygenPercent;

    public LifeSupportModule(boolean damaged, double oxygenPercent)
    {
        super("Життєзабезпечення", damaged);
        this.oxygenPercent = oxygenPercent;
    }
    public double getOxygenPercent()
    {
        return oxygenPercent;
    }
}
