package semester1.practice07;

public class Time
{
    private int hours;
    private int minutes;
    private int seconds;

    Time(int hours, int minutes, int seconds)
    {
        this.hours = (hours < 0 || hours > 23) ? 0 : hours;
        this.minutes = (minutes < 0 || minutes > 59) ? 0 : minutes;
        this.seconds = (seconds < 0 || seconds > 59) ? 0 : seconds;
    }
    public void tick()
    {
        seconds++;
        if (seconds == 60)
        {
            seconds = 0;
            minutes++;
        }
        if (minutes == 60)
        {
            minutes = 0;
            hours++;
        }
        if (hours == 24)
        {
            hours = 0;
        }
    }
    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
    public String toStandardString()
    {
        int hour = hours % 12;
        if (hour == 0)
        {
            hour = 12;
        }
        return String.format("%d:%02d:%02d %s", hour, minutes, seconds, (hours < 12) ? "AM" : "PM");
    }
}
