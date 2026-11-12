package semester1.practice10;

public interface Rechargeable
{
    void chargeToFull();
}

class Laptop implements Rechargeable
{
    private int batteryPercent;

    @Override
    public void chargeToFull()
    {
        batteryPercent = 100;
    }
    @Override
    public String toString()
    {
        return "Laptop battery=" + batteryPercent;
    }
}

class ElectricScooter implements Rechargeable
{
    private int batteryPercent;

    @Override
    public void chargeToFull()
    {
        batteryPercent = 100;
    }
    @Override
    public String toString()
    {
        return "ElectricScooter battery=" + batteryPercent;
    }
}

class SmartWatch implements Rechargeable
{
    private int batteryPercent;

    @Override
    public void chargeToFull()
    {
        batteryPercent = 100;
    }
    @Override
    public String toString()
    {
        return "SmartWatch battery=" + batteryPercent;
    }
}

class DesktopMonitor
{
}

class WiredPrinter
{
}
