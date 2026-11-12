package semester1.practice10;

public class AmphibiousRescueDrone implements Flyable, Swimmable, GpsTrackable
{
    private final double latitude;
    private final double longitude;
    private double depth;

    public AmphibiousRescueDrone(double latitude, double longitude)
    {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    @Override
    public void takeOff()
    {
        depth = 0;
        System.out.println("Дрон злетів");
    }
    @Override
    public double getMaxAltitude()
    {
        return 120;
    }
    @Override
    public void dive(double depthMeters)
    {
        depth = depthMeters;
        System.out.println("Глибина дрона: " + depth);
    }
    @Override
    public double getMaxDepth()
    {
        return 20;
    }
    @Override
    public String getCoordinates()
    {
        return latitude + "; " + longitude;
    }
}

interface Flyable
{
    void takeOff();
    double getMaxAltitude();
}

interface Swimmable
{
    void dive(double depthMeters);
    double getMaxDepth();
}

interface GpsTrackable
{
    String getCoordinates();
}
