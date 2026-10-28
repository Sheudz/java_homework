package semester1.practice07;

public class Car
{
    private String brand;
    private String model;
    private int year;
    private double mileage;
    private boolean engineStarted;

    Car(String brand, String model, int year, double mileage)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        engineStarted = false;
    }
    Car(String brand, String model, int year)
    {
        this(brand, model, year, 0.0);
    }
    Car()
    {
        this("Unknown", "Standard", 2024);
    }
    public void startEngine()
    {
        engineStarted = true;
    }
    public void stopEngine()
    {
        engineStarted = false;
    }
    public void drive(double distance)
    {
        if (!engineStarted)
        {
            System.out.println("Спершу заведіть двигун!");
        }
        else if (distance > 0)
        {
            mileage += distance;
            System.out.println(brand + " " + model + " " + year + " Пробіг: " + mileage);
        }
    }
}
