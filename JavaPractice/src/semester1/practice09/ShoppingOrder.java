package semester1.practice09;

public class ShoppingOrder
{
    private final OrderItem[] items;
    private int itemCount;

    public ShoppingOrder(int capacity)
    {
        items = new OrderItem[capacity];
    }
    public void addItem(String name, double price, int qty)
    {
        for (int i = 0; i < itemCount; i++)
        {
            if (items[i].getProductName().equalsIgnoreCase(name))
            {
                items[i].addQuantity(qty);
                return;
            }
        }
        if (itemCount < items.length)
        {
            items[itemCount++] = new OrderItem(name, price, qty);
        }
    }
    public double calculateGrandTotal()
    {
        double total = 0;
        for (int i = 0; i < itemCount; i++)
        {
            total += items[i].getItemTotal();
        }
        return total;
    }
    @Override
    public String toString()
    {
        String result = "Чек:\n";
        for (int i = 0; i < itemCount; i++)
        {
            result += items[i] + "\n";
        }
        return result + "Разом: " + calculateGrandTotal() + " грн";
    }
}

class OrderItem
{
    private final String productName;
    private final double unitPrice;
    private int quantity;

    public OrderItem(String productName, double unitPrice, int quantity)
    {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    public String getProductName()
    {
        return productName;
    }
    public void addQuantity(int amount)
    {
        quantity += amount;
    }
    public double getItemTotal()
    {
        return unitPrice * quantity;
    }
    @Override
    public String toString()
    {
        return productName + " " + quantity + " x " + unitPrice + " = " + getItemTotal();
    }
}
