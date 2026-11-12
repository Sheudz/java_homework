package semester1.practice10;

public abstract class AbstractSmartAppliance
{
    private final String room;
    private final String model;
    protected boolean poweredOn;

    public AbstractSmartAppliance(String room, String model)
    {
        this.room = room;
        this.model = model;
    }
    public void turnOn()
    {
        poweredOn = true;
    }
    public void turnOff()
    {
        poweredOn = false;
    }
    public abstract double getCurrentWatts();

    @Override
    public String toString()
    {
        return room + " " + model + " watts=" + getCurrentWatts();
    }
}

interface Dimmable
{
    void setBrightness(int percent);
}

interface HeatingCapable
{
    void setTargetTemperature(double celsius);
}

class SmartLedChandelier extends AbstractSmartAppliance implements Dimmable
{
    private int brightness = 100;

    public SmartLedChandelier(String room, String model)
    {
        super(room, model);
    }
    @Override
    public void setBrightness(int percent)
    {
        brightness = percent;
    }
    @Override
    public double getCurrentWatts()
    {
        return poweredOn ? 60 * brightness / 100.0 : 0;
    }
}

class SmartUnderfloorHeating extends AbstractSmartAppliance implements HeatingCapable
{
    private double targetTemperature;

    public SmartUnderfloorHeating(String room, String model)
    {
        super(room, model);
    }
    @Override
    public void setTargetTemperature(double celsius)
    {
        targetTemperature = celsius;
    }
    @Override
    public double getCurrentWatts()
    {
        return poweredOn ? 1500 : 0;
    }
    @Override
    public String toString()
    {
        return super.toString() + " target=" + targetTemperature;
    }
}
