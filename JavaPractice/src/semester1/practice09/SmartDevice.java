package semester1.practice09;

public class SmartDevice
{
    private final Battery battery;
    private final Display display;
    private boolean on = true;

    public SmartDevice(int capacityMah, double diagonalInches, int brightnessPercent)
    {
        battery = new Battery(capacityMah);
        display = new Display(diagonalInches, brightnessPercent);
    }
    public void watchVideo(int minutes)
    {
        if (on && minutes > 0)
        {
            int rate = display.getBrightnessPercent() > 70 ? 2 : 1;
            int drain = (int) Math.ceil(minutes * rate / 10.0);
            battery.drain(drain);
            on = battery.getChargePercent() > 0;
        }
    }
    @Override
    public String toString()
    {
        return "SmartDevice{on=" + on + ", " + battery + ", " + display + "}";
    }
}

class Battery
{
    private int capacityMah;
    private int chargePercent = 100;

    public Battery(int capacityMah)
    {
        this.capacityMah = capacityMah;
    }
    public void drain(int percent)
    {
        if (percent > 0)
        {
            chargePercent = Math.max(0, chargePercent - percent);
        }
    }
    public void charge(int percent)
    {
        if (percent > 0)
        {
            chargePercent += Math.min(100 - chargePercent, percent);
        }
    }
    public int getChargePercent()
    {
        return chargePercent;
    }
    @Override
    public String toString()
    {
        return "Battery{capacity=" + capacityMah + ", charge=" + chargePercent + "%}";
    }
}

class Display
{
    private double diagonalInches;
    private int brightnessPercent;

    public Display(double diagonalInches, int brightnessPercent)
    {
        this.diagonalInches = diagonalInches;
        this.brightnessPercent = Math.max(10, Math.min(100, brightnessPercent));
    }
    public int getBrightnessPercent()
    {
        return brightnessPercent;
    }
    @Override
    public String toString()
    {
        return "Display{diagonal=" + diagonalInches + ", brightness=" + brightnessPercent + "%}";
    }
}
