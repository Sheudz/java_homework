package semester1.practice07;

public class Product
{
    private String name;
    private double price;
    private int quantity;
    private String category;
    private int id;
    private String title;

    Product(String name, double price, int quantity, String category)
    {
        this.name = name;
        this.title = name;
        this.price = (price < 0) ? 0 : price;
        this.quantity = (quantity < 0) ? 0 : quantity;
        this.category = category;
    }
    Product(int id, String title, double price)
    {
        this(title, price, 1, "Без категорії");
        this.id = id;
    }
    public double getTotalValue()
    {
        return price * quantity;
    }
    public void applyDiscount(double percent)
    {
        if (percent >= 0 && percent <= 100)
        {
            price -= price * percent / 100;
        }
    }
    public double getPrice()
    {
        return price;
    }
    public String getTitle()
    {
        return title;
    }
    public void printProduct()
    {
        System.out.println("Товар: " + name + " Ціна: " + price + " Кількість: " + quantity + " Категорія: " + category);
    }
}
