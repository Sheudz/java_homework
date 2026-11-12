package semester1.practice10;

public class SmartGridController
{
    public static double updateAndCalculate(PowerProducer[] stations, double weatherFactor)
    {
        double total = 0;
        for (PowerProducer station : stations)
        {
            if (station instanceof WeatherDependent wd)
            {
                wd.updateWeatherCondition(weatherFactor);
            }
            if (station instanceof AbstractPowerStation powerStation)
            {
                total += powerStation.getNetOutputMw();
            }
            else
            {
                total += station.produceMw();
            }
        }
        return total;
    }
}

interface PowerProducer
{
    double produceMw();
}

interface WeatherDependent
{
    void updateWeatherCondition(double factor);
}

abstract class AbstractPowerStation implements PowerProducer
{
    private final String stationId;

    public AbstractPowerStation(String stationId)
    {
        this.stationId = stationId;
    }
    public final double getNetOutputMw()
    {
        return produceMw() * 0.95;
    }
    @Override
    public String toString()
    {
        return stationId + " gross=" + produceMw() + " net=" + getNetOutputMw();
    }
}

class NuclearStation extends AbstractPowerStation
{
    private final double capacity;

    public NuclearStation(String id, double capacity)
    {
        super(id);
        this.capacity = capacity;
    }
    @Override
    public double produceMw()
    {
        return capacity;
    }
}

class SolarFarmStation extends AbstractPowerStation implements WeatherDependent
{
    private final double capacity;
    private double weatherFactor = 1;

    public SolarFarmStation(String id, double capacity)
    {
        super(id);
        this.capacity = capacity;
    }
    @Override
    public void updateWeatherCondition(double factor)
    {
        weatherFactor = factor;
    }
    @Override
    public double produceMw()
    {
        return capacity * weatherFactor;
    }
}

class HydroDamStation extends AbstractPowerStation implements WeatherDependent
{
    private final double capacity;
    private double weatherFactor = 1;

    public HydroDamStation(String id, double capacity)
    {
        super(id);
        this.capacity = capacity;
    }
    @Override
    public void updateWeatherCondition(double factor)
    {
        weatherFactor = factor;
    }
    @Override
    public double produceMw()
    {
        return capacity * weatherFactor;
    }
}
