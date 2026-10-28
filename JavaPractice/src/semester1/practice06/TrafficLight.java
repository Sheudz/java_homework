package semester1.practice06;

public class TrafficLight
{
    public String currentColor;

    public void changeColor(String newColor)
    {
        currentColor = newColor;
    }
    public void showSignal()
    {
        if ("Червоний".equals(currentColor))
        {
            System.out.println("Стій!");
        }
        else if ("Жовтий".equals(currentColor))
        {
            System.out.println("Увага!");
        }
        else if ("Зелений".equals(currentColor))
        {
            System.out.println("Їдь!");
        }
        else
        {
            System.out.println("Невідомий сигнал");
        }
    }
}
