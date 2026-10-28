package semester1.practice08;

import java.util.Arrays;

public class WeatherDay
{
    private String date;
    private double[] hourlyTemps;

    public WeatherDay(String date, double[] hourlyTemps)
    {
        this.date = date;
        int length = (hourlyTemps == null) ? 0 : hourlyTemps.length;
        this.hourlyTemps = new double[length];
        for (int i = 0; i < length; i++)
        {
            this.hourlyTemps[i] = hourlyTemps[i];
        }
    }
    public double getMinTemp()
    {
        if (hourlyTemps.length == 0)
        {
            return 0;
        }
        double min = hourlyTemps[0];
        for (double temp : hourlyTemps)
        {
            if (temp < min)
            {
                min = temp;
            }
        }
        return min;
    }
    public double getMaxTemp()
    {
        if (hourlyTemps.length == 0)
        {
            return 0;
        }
        double max = hourlyTemps[0];
        for (double temp : hourlyTemps)
        {
            if (temp > max)
            {
                max = temp;
            }
        }
        return max;
    }
    public double getAverageTemp()
    {
        double sum = 0;
        for (double temp : hourlyTemps)
        {
            sum += temp;
        }
        return (hourlyTemps.length == 0) ? 0 : sum / hourlyTemps.length;
    }
    @Override
    public String toString()
    {
        return "WeatherDay{date='" + date + "', temps=" + Arrays.toString(hourlyTemps) + ", average=" + getAverageTemp() + "}";
    }
}
