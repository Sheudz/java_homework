package semester1.practice06;

public class Stopwatch
{
    public int seconds;

    public void tick()
    {
        seconds++;
    }
    public void addSeconds(int s)
    {
        if (s > 0)
        {
            seconds += s;
        }
    }
    public void displayTime()
    {
        System.out.println(String.format("%02d:%02d", seconds / 60, seconds % 60));
    }
}
