package semester1.practice10;

public abstract class AbstractVehicle
{
    private final String plateNumber;
    protected double mileageKm;

    public AbstractVehicle(String plateNumber, double mileageKm)
    {
        this.plateNumber = plateNumber;
        this.mileageKm = mileageKm;
    }
    @Override
    public String toString()
    {
        return plateNumber + " mileage=" + mileageKm;
    }
}

interface CargoCarrier
{
    double getMaxPayloadTons();
}

interface PassengerCarrier
{
    int getSeatCount();
}

interface ElectricPowered
{
    double getBatteryCapacityKwh();
}

class ElectricCityBus extends AbstractVehicle implements PassengerCarrier, ElectricPowered
{
    public ElectricCityBus(String plate, double mileage)
    {
        super(plate, mileage);
    }
    @Override
    public int getSeatCount()
    {
        return 40;
    }
    @Override
    public double getBatteryCapacityKwh()
    {
        return 300;
    }
}

class DieselDumpTruck extends AbstractVehicle implements CargoCarrier
{
    public DieselDumpTruck(String plate, double mileage)
    {
        super(plate, mileage);
    }
    @Override
    public double getMaxPayloadTons()
    {
        return 20;
    }
}

class CargoPassengerVan extends AbstractVehicle implements CargoCarrier, PassengerCarrier
{
    public CargoPassengerVan(String plate, double mileage)
    {
        super(plate, mileage);
    }
    @Override
    public double getMaxPayloadTons()
    {
        return 1.5;
    }
    @Override
    public int getSeatCount()
    {
        return 8;
    }
}
