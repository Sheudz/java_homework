package semester1.practice08;

public class Appliance
{
    private String model;
    private double powerWatts;

    public Appliance(String model, double powerWatts)
    {
        this.model = model;
        this.powerWatts = Math.max(0, powerWatts);
    }
    public double getDailyConsumptionKWh(int hours)
    {
        return powerWatts * Math.max(0, hours) / 1000.0;
    }
    @Override
    public String toString()
    {
        return "Appliance{model='" + model + "', watts=" + powerWatts + "}";
    }
}

class EcoHeater extends Appliance
{
    private boolean ecoModeActive;

    public EcoHeater(String model, double powerWatts, boolean ecoModeActive)
    {
        super(model, powerWatts);
        this.ecoModeActive = ecoModeActive;
    }
    @Override
    public double getDailyConsumptionKWh(int hours)
    {
        return super.getDailyConsumptionKWh(hours) * (ecoModeActive ? 0.75 : 1);
    }
    @Override
    public String toString()
    {
        return "EcoHeater{" + super.toString() + ", ecoMode=" + ecoModeActive + "}";
    }
}
