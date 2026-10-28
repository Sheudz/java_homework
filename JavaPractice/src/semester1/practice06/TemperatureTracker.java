package semester1.practice06;

public class TemperatureTracker
{
    private double[] dailyTemps = new double[7];

    public void setTemps(double[] temps)
    {
        if (temps == null || temps.length != 7)
        {
            System.out.println("Потрібно ввести температури за 7 днів");
            return;
        }
        for (int i = 0; i < dailyTemps.length; i++)
        {
            dailyTemps[i] = temps[i];
        }
    }
    public int countDaysAbove(double threshold)
    {
        int count = 0;
        for (double temperature : dailyTemps)
        {
            if (temperature > threshold)
            {
                count++;
            }
        }
        return count;
    }
    public void printWeeklyReport()
    {
        String[] days = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"};
        int maxIndex = 0;
        for (int i = 0; i < dailyTemps.length; i++)
        {
            System.out.println(days[i] + ": " + dailyTemps[i] + "°C");
            if (dailyTemps[i] > dailyTemps[maxIndex])
            {
                maxIndex = i;
            }
        }
        System.out.println("Найтепліший день: " + days[maxIndex] + " " + dailyTemps[maxIndex] + "°C");
    }
}
