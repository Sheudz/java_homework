package semester1.practice07;

public class Engine
{
    private String serialNumber;
    private int horsePower;
    private boolean isRunning;

    Engine(String serialNumber, int horsePower)
    {
        this.serialNumber = serialNumber;
        this.horsePower = horsePower;
        isRunning = false;
    }
    public void start()
    {
        isRunning = true;
    }
    public void stop()
    {
        isRunning = false;
    }
    public boolean isRunning()
    {
        return isRunning;
    }
    public int getHorsePower()
    {
        return horsePower;
    }
}
