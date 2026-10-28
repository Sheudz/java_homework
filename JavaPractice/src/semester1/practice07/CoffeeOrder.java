package semester1.practice07;

public class CoffeeOrder
{
    private String type;
    private String size;
    private int sugarCount;
    private boolean withSyrup;
    private double finalPrice;

    CoffeeOrder(String type, String size, int sugarCount, boolean withSyrup)
    {
        this.type = type;
        this.size = size;
        this.sugarCount = sugarCount;
        this.withSyrup = withSyrup;
        finalPrice = calculatePrice();
    }
    CoffeeOrder(String type, String size)
    {
        this(type, size, 0, false);
    }
    CoffeeOrder(String type)
    {
        this(type, "Medium");
    }
    private double calculatePrice()
    {
        double price = 40;
        if (type.equals("Капучино"))
        {
            price = 55;
        }
        else if (type.equals("Лате"))
        {
            price = 60;
        }
        if (size.equals("Medium"))
        {
            price *= 1.3;
        }
        else if (size.equals("Large"))
        {
            price *= 1.6;
        }
        if (withSyrup)
        {
            price += 15;
        }
        return price;
    }
    public void printReceipt()
    {
        System.out.println(type + " " + size + " Цукор: " + sugarCount + " Сироп: " + withSyrup + " До сплати: " + finalPrice);
    }
}
