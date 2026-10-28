package semester1.practice08;

public class Vehicle
{
    protected String brand;
    protected int maxSpeed;
    protected double fuelTankCapacity;

    public Vehicle(String brand, int maxSpeed, double fuelTankCapacity)
    {
        this.brand = brand;
        this.maxSpeed = Math.max(0, maxSpeed);
        this.fuelTankCapacity = Math.max(0, fuelTankCapacity);
    }
    @Override
    public String toString()
    {
        return "Vehicle{brand='" + brand + "', maxSpeed=" + maxSpeed + ", tank=" + fuelTankCapacity + "}";
    }
}

class PassengerCar extends Vehicle
{
    private int passengerSeats;

    public PassengerCar(String brand, int maxSpeed, double fuelTankCapacity, int passengerSeats)
    {
        super(brand, maxSpeed, fuelTankCapacity);
        this.passengerSeats = Math.max(1, passengerSeats);
    }
    @Override
    public String toString()
    {
        return "PassengerCar{" + super.toString() + ", seats=" + passengerSeats + "}";
    }
}

class CargoTruck extends Vehicle
{
    private double maxLoadTons;

    public CargoTruck(String brand, int maxSpeed, double fuelTankCapacity, double maxLoadTons)
    {
        super(brand, maxSpeed, fuelTankCapacity);
        this.maxLoadTons = Math.max(0, maxLoadTons);
    }
    public double getFullLoadConsumption(double baseLitersPer100Km)
    {
        return Math.max(0, baseLitersPer100Km) * (1 + maxLoadTons * 0.05);
    }
    @Override
    public String toString()
    {
        return "CargoTruck{" + super.toString() + ", maxLoadTons=" + maxLoadTons + "}";
    }
}
