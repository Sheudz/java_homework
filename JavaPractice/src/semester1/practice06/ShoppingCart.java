package semester1.practice06;

import java.util.Locale;

public class ShoppingCart
{
    private double[] itemPrices = new double[10];
    private int count;

    public void addItem(double price)
    {
        if (price < 0)
        {
            System.out.println("Некоректна ціна");
        }
        else if (count < itemPrices.length)
        {
            itemPrices[count] = price;
            count++;
        }
        else
        {
            System.out.println("Кошик заповнений");
        }
    }
    public double getTotalCost()
    {
        double total = 0;
        for (int i = 0; i < count; i++)
        {
            total += itemPrices[i];
        }
        return total;
    }
    public void applyDiscount(double percent)
    {
        if (percent >= 0 && percent <= 100)
        {
            for (int i = 0; i < count; i++)
            {
                itemPrices[i] -= itemPrices[i] * percent / 100;
            }
        }
    }
    public void printReceipt()
    {
        System.out.println("Чек:");
        for (int i = 0; i < count; i++)
        {
            System.out.printf(Locale.US, "%d. %.2f грн%n", i + 1, itemPrices[i]);
        }
        System.out.printf(Locale.US, "Разом: %.2f грн%n", getTotalCost());
    }
}
