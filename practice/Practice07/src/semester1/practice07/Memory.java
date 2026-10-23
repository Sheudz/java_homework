package semester1.practice07;

public class Memory
{
    private int sizeGB;
    private int frequencyMHz;
    private double price;

    Memory(int sizeGB, int frequencyMHz, double price)
    {
        this.sizeGB = sizeGB;
        this.frequencyMHz = frequencyMHz;
        this.price = price;
    }
    public double getPrice()
    {
        return price;
    }
    public void printSpecs()
    {
        System.out.println("Пам'ять: " + sizeGB + " GB Частота: " + frequencyMHz + " MHz");
    }
}
