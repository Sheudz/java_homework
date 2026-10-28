package semester1.practice06;

public class Thermometer
{
    private double temperature;

    public void setTemperature(double t)
    {
        if (t < -273.15)
        {
            System.out.println("Помилка: температура нижча за абсолютний нуль");
        }
        else
        {
            temperature = t;
        }
    }
    public double getTemperature()
    {
        return temperature;
    }
}
