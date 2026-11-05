package semester1.practice09;

public class Automobile
{
    private final String model;
    private double speed;
    private final Engine engine;

    public Automobile(String model, String fuelType, int volumeCc)
    {
        this.model = model;
        engine = new Engine(fuelType, volumeCc);
    }
    public void start()
    {
        engine.start();
    }
    public void stop()
    {
        speed = 0;
        engine.stop();
    }
    public void accelerate(double deltaSpeed)
    {
        if (engine.isStarted())
        {
            speed += deltaSpeed;
            engine.setRpm(800 + (int) (speed * 30));
        }
    }
    @Override
    public String toString()
    {
        return model + " speed=" + speed + " " + engine;
    }
}

class Engine
{
    private final String fuelType;
    private final int volumeCc;
    private int rpm;
    private boolean started;

    public Engine(String fuelType, int volumeCc)
    {
        this.fuelType = fuelType;
        this.volumeCc = volumeCc;
    }
    public void start()
    {
        started = true;
        rpm = 800;
    }
    public void stop()
    {
        started = false;
        rpm = 0;
    }
    public boolean isStarted()
    {
        return started;
    }
    public void setRpm(int rpm)
    {
        this.rpm = rpm;
    }
    @Override
    public String toString()
    {
        return "Engine{fuel='" + fuelType + "', volumeCc=" + volumeCc + ", rpm=" + rpm + ", started=" + started + "}";
    }
}
