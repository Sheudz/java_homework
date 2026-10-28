package semester1.practice08;

public class SensorNode
{
    private String sensorId;
    protected double calibrationOffset;
    private double rawValue;

    public SensorNode(String sensorId, double calibrationOffset, double rawValue)
    {
        this.sensorId = sensorId;
        this.calibrationOffset = calibrationOffset;
        this.rawValue = rawValue;
    }
    public String getSensorId()
    {
        return sensorId;
    }
    public double getCalibratedValue()
    {
        return rawValue + calibrationOffset;
    }
    @Override
    public String toString()
    {
        return "SensorNode{id='" + sensorId + "', raw=" + rawValue + ", calibrated=" + getCalibratedValue() + "}";
    }
}
