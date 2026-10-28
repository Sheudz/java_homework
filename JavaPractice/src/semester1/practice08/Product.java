package semester1.practice08;

import java.util.Locale;

public class Product
{
    private String sku;
    private String title;
    private double price;
    private int stock;

    public Product(String sku, String title, double price, int stock)
    {
        this.sku = sku;
        this.title = title;
        setPrice(price);
        setStock(stock);
    }
    public double getPrice()
    {
        return price;
    }
    public int getStock()
    {
        return stock;
    }
    public void setPrice(double price)
    {
        this.price = (Double.isFinite(price) && price >= 0) ? price : 0;
    }
    public void setStock(int stock)
    {
        this.stock = (stock >= 0) ? stock : 0;
    }
    public double getTotalCost()
    {
        return price * stock;
    }
    @Override
    public String toString()
    {
        return String.format(Locale.US, "[SKU: %s] %s | Ціна: %.2f грн | Залишок: %d шт. | Разом: %.2f грн", sku, title, price, stock, getTotalCost());
    }
}
