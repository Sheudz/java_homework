package semester1.practice09;

public class SmartLab
{
    private final EmergencySiren siren;
    private final AbstractSensor[] sensors;
    private int count;

    public SmartLab(int capacity)
    {
        siren = new EmergencySiren();
        sensors = new AbstractSensor[capacity];
    }
    public boolean addSensor(AbstractSensor sensor)
    {
        if (sensor == null || count == sensors.length)
        {
            return false;
        }
        sensors[count++] = sensor;
        return true;
    }
    public void runDiagnostics()
    {
        for (int i = 0; i < count; i++)
        {
            if (sensors[i].isAlarmTriggered())
            {
                siren.activate();
            }
            System.out.println(sensors[i]);
        }
        System.out.println(siren);
    }
    public boolean isSirenSounding()
    {
        return siren.isSounding();
    }
}

class EmergencySiren
{
    private boolean sounding;

    public void activate()
    {
        sounding = true;
    }
    public boolean isSounding()
    {
        return sounding;
    }
    @Override
    public String toString()
    {
        return "Siren{sounding=" + sounding + "}";
    }
}
