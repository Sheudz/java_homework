package semester1.practice08;

public class Gadget
{
    private String brand;
    private double price;

    public Gadget(String brand, double price)
    {
        this.brand = brand;
        this.price = Math.max(0, price);
    }
    @Override
    public String toString()
    {
        return "Gadget{brand='" + brand + "', price=" + price + "}";
    }
}

class Smartphone extends Gadget
{
    private int memoryGb;
    private boolean has5G;

    public Smartphone(String brand, double price, int memoryGb, boolean has5G)
    {
        super(brand, price);
        this.memoryGb = Math.max(1, memoryGb);
        this.has5G = has5G;
    }
    public Smartphone(String brand, double price, int memoryGb)
    {
        this(brand, price, memoryGb, true);
    }
    public Smartphone(String brand)
    {
        this(brand, 9999.0, 128, false);
    }
    @Override
    public String toString()
    {
        return "Smartphone{" + super.toString() + ", memoryGb=" + memoryGb + ", has5G=" + has5G + "}";
    }
}
