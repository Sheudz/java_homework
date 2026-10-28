package semester1.practice08;

public class BaseVehicle
{
    private String brand;
    private int year;

    public BaseVehicle(String brand, int year)
    {
        this.brand = brand;
        this.year = Math.max(0, year);
    }
    @Override
    public String toString()
    {
        return "BaseVehicle{brand='" + brand + "', year=" + year + "}";
    }
}

class MotorCar extends BaseVehicle
{
    private int horsePower;
    private int doorsCount;

    public MotorCar(String brand, int year, int horsePower, int doorsCount)
    {
        super(brand, year);
        this.horsePower = Math.max(0, horsePower);
        this.doorsCount = Math.max(1, doorsCount);
    }
    @Override
    public String toString()
    {
        return "MotorCar{" + super.toString() + ", horsePower=" + horsePower + ", doors=" + doorsCount + "}";
    }
}

class ElectricCar extends MotorCar
{
    private double batteryCapacityKWh;
    private int rangeKm;

    public ElectricCar(String brand, int year, int horsePower, int doorsCount, double batteryCapacityKWh, int rangeKm)
    {
        super(brand, year, horsePower, doorsCount);
        this.batteryCapacityKWh = Math.max(0, batteryCapacityKWh);
        this.rangeKm = Math.max(0, rangeKm);
    }
    @Override
    public String toString()
    {
        return "ElectricCar{" + super.toString() + ", batteryKWh=" + batteryCapacityKWh + ", rangeKm=" + rangeKm + "}";
    }
}
