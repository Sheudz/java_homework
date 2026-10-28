package semester1.practice06;

public class Counter
{
    public int count;

    public void increment()
    {
        count++;
    }
    public void decrement()
    {
        count--;
    }
    public void reset()
    {
        count = 0;
    }
    public void printCount()
    {
        System.out.println("Лічильник: " + count);
    }
}
