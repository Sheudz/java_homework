package semester1.practice10;

public abstract class AbstractLabDevice
{
    private final String inventoryCode;

    public AbstractLabDevice(String inventoryCode)
    {
        this.inventoryCode = inventoryCode;
    }
    public abstract void performMeasurement();

    @Override
    public String toString()
    {
        return inventoryCode;
    }
}

interface Calibratable
{
    void calibrate(double referenceValue);
}

interface SelfDiagnostic
{
    boolean runSelfCheck();
}

class ElectronicScale extends AbstractLabDevice implements Calibratable, SelfDiagnostic
{
    private final double rawValue;
    private double offset;

    public ElectronicScale(String code, double rawValue)
    {
        super(code);
        this.rawValue = rawValue;
    }
    @Override
    public void calibrate(double referenceValue)
    {
        offset = referenceValue - rawValue;
    }
    @Override
    public boolean runSelfCheck()
    {
        return rawValue + offset >= 0;
    }
    @Override
    public void performMeasurement()
    {
        System.out.println(this + " Маса: " + (rawValue + offset) + " г");
    }
}

class GlassThermometer extends AbstractLabDevice
{
    private final double temperature;

    public GlassThermometer(String code, double temperature)
    {
        super(code);
        this.temperature = temperature;
    }
    @Override
    public void performMeasurement()
    {
        System.out.println(this + " Температура: " + temperature + " C");
    }
}
