package semester1.practice06;

public class CarSpeedometer
{
    private int speed = 0;

    public void accelerate(int delta)
    {
        if (delta > 0)
        {
            speed += Math.min(delta, 240 - speed);
        }
    }
    public void brake(int delta)
    {
        if (delta > 0)
        {
            speed -= Math.min(delta, speed);
        }
    }
    public int getSpeed()
    {
        return speed;
    }
}
