package semester1.practice09;

public class ClimateController
{
    private final TemperatureSensor sensor;
    private final HeatingUnit heatingUnit;
    private double targetTemp;

    public ClimateController(double currentTemp, double targetTemp, double powerKw)
    {
        sensor = new TemperatureSensor(currentTemp);
        heatingUnit = new HeatingUnit(powerKw);
        this.targetTemp = targetTemp;
    }
    public void updateTemperature(double value)
    {
        sensor.updateTemperature(value);
    }
    public void regulate()
    {
        if (sensor.getCurrentTemp() < targetTemp - 0.5)
        {
            heatingUnit.turnOn();
        }
        else if (sensor.getCurrentTemp() >= targetTemp)
        {
            heatingUnit.turnOff();
        }
    }
    @Override
    public String toString()
    {
        return "Climate{target=" + targetTemp + ", " + sensor + ", " + heatingUnit + "}";
    }
}

class TemperatureSensor
{
    private double currentTemp;

    public TemperatureSensor(double currentTemp)
    {
        updateTemperature(currentTemp);
    }
    public void updateTemperature(double value)
    {
        currentTemp = value;
    }
    public double getCurrentTemp()
    {
        return currentTemp;
    }
    @Override
    public String toString()
    {
        return "Temperature=" + currentTemp;
    }
}

class HeatingUnit
{
    private boolean heatingOn;
    private double powerKw;

    public HeatingUnit(double powerKw)
    {
        this.powerKw = powerKw;
    }
    public void turnOn()
    {
        heatingOn = true;
    }
    public void turnOff()
    {
        heatingOn = false;
    }
    @Override
    public String toString()
    {
        return "Heater{on=" + heatingOn + ", powerKw=" + powerKw + "}";
    }
}
