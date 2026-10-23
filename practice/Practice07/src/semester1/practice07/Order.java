package semester1.practice07;

public class Order
{
    private Customer customer;
    private Product[] items;
    private int itemCount;
    private boolean isPaid;

    Order(Customer customer, int maxItems)
    {
        this.customer = customer;
        items = new Product[maxItems];
        itemCount = 0;
        isPaid = false;
    }
    public void addProduct(Product p)
    {
        if (p != null && itemCount < items.length && !isPaid)
        {
            items[itemCount++] = p;
        }
    }
    public double calculateTotal()
    {
        double total = 0;
        for (int i = 0; i < itemCount; i++)
        {
            total += items[i].getPrice();
        }
        return total;
    }
    public boolean checkout()
    {
        if (isPaid)
        {
            System.out.println("Замовлення вже оплачене!");
            return false;
        }
        double total = calculateTotal();
        if (this.customer.pay(total))
        {
            isPaid = true;
            System.out.println("Чек:");
            for (int i = 0; i < itemCount; i++)
            {
                System.out.println(items[i].getTitle() + " - " + items[i].getPrice());
            }
            System.out.println("Оплачено: " + total);
            return true;
        }
        System.out.println("Недостатньо коштів!");
        return false;
    }
}
