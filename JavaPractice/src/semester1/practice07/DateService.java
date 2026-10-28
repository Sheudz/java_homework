package semester1.practice07;

public class DateService
{
    private int day;
    private int month;
    private int year;

    DateService(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void add(int days)
    {
        add(days, 0, 0);
    }
    public void add(int days, int months)
    {
        add(days, months, 0);
    }
    public void add(int days, int months, int years)
    {
        day += days;
        month += months;
        year += years;
        while (day > 30)
        {
            day -= 30;
            month++;
        }
        while (day < 1)
        {
            day += 30;
            month--;
        }
        while (month > 12)
        {
            month -= 12;
            year++;
        }
        while (month < 1)
        {
            month += 12;
            year--;
        }
    }
    public void printDate()
    {
        System.out.println(String.format("%02d.%02d.%04d", day, month, year));
    }
}
