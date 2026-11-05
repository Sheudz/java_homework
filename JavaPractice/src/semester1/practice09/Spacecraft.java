package semester1.practice09;

public class Spacecraft
{
    private final String shipName;
    private final double dryMassTons;
    private final AbstractThruster[] thrusters;
    private int count;

    public Spacecraft(String shipName, double dryMassTons, int capacity)
    {
        this.shipName = shipName;
        this.dryMassTons = dryMassTons;
        thrusters = new AbstractThruster[capacity];
    }
    public boolean addThruster(AbstractThruster thruster)
    {
        if (thruster == null || count == thrusters.length)
        {
            return false;
        }
        thrusters[count++] = thruster;
        return true;
    }
    public double getTotalThrustKn()
    {
        double total = 0;
        for (int i = 0; i < count; i++)
        {
            total += thrusters[i].getThrustKn();
        }
        return total;
    }
    public double getInitialAcceleration()
    {
        return getTotalThrustKn() / dryMassTons;
    }
    @Override
    public String toString()
    {
        String result = shipName + " thrust=" + getTotalThrustKn() + " kN acceleration=" + getInitialAcceleration() + " m/s^2";
        for (int i = 0; i < count; i++)
        {
            result += "\n" + thrusters[i];
        }
        return result;
    }
}

abstract class AbstractThruster
{
    private final String thrusterId;

    public AbstractThruster(String thrusterId)
    {
        this.thrusterId = thrusterId;
    }
    public abstract double getThrustKn();
    public abstract double getFuelBurnRate();

    @Override
    public String toString()
    {
        return thrusterId + " thrust=" + getThrustKn() + " kN fuel=" + getFuelBurnRate() + " kg/s";
    }
}

class ChemicalThruster extends AbstractThruster
{
    private final double thrustKn;
    private final double fuelBurnRate;

    public ChemicalThruster(String id, double thrustKn, double fuelBurnRate)
    {
        super(id);
        this.thrustKn = thrustKn;
        this.fuelBurnRate = fuelBurnRate;
    }
    @Override
    public double getThrustKn()
    {
        return thrustKn;
    }
    @Override
    public double getFuelBurnRate()
    {
        return fuelBurnRate;
    }
}

class IonThruster extends AbstractThruster
{
    private final double thrustKn;
    private final double fuelBurnRate;

    public IonThruster(String id, double thrustKn, double fuelBurnRate)
    {
        super(id);
        this.thrustKn = thrustKn;
        this.fuelBurnRate = fuelBurnRate;
    }
    @Override
    public double getThrustKn()
    {
        return thrustKn;
    }
    @Override
    public double getFuelBurnRate()
    {
        return fuelBurnRate;
    }
}
