package semester1.practice07;

public class SmartBulb
{
    private int brightness;
    private int colorTemp;
    private boolean isOn;

    SmartBulb(int brightness, int colorTemp, boolean isOn)
    {
        this.brightness = (brightness < 0 || brightness > 100) ? 50 : brightness;
        this.colorTemp = (colorTemp < 2700 || colorTemp > 6500) ? 4000 : colorTemp;
        this.isOn = isOn;
    }
    SmartBulb(int brightness)
    {
        this(brightness, 4000, true);
    }
    SmartBulb()
    {
        this(50);
    }
    public void printStatus()
    {
        System.out.println("Яскравість: " + brightness + "% Температура: " + colorTemp + " K Увімкнена: " + isOn);
    }
}
