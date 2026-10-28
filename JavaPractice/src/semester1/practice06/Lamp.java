package semester1.practice06;

public class Lamp
{
    public boolean isOn;

    public void turnOn()
    {
        isOn = true;
    }
    public void turnOff()
    {
        isOn = false;
    }
    public void toggle()
    {
        isOn = !isOn;
    }
    public void status()
    {
        System.out.println(isOn ? "Лампа світить" : "Лампа вимкнена");
    }
}
