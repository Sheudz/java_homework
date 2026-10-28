package semester1.practice08;

import java.util.Arrays;

public class WarehouseItem
{
    private String name;
    private int quantity;
    private double[] priceHistory;

    public WarehouseItem(String name, int quantity, double[] priceHistory)
    {
        this.name = name;
        this.quantity = Math.max(0, quantity);
        this.priceHistory = (priceHistory == null) ? new double[0] : Arrays.copyOf(priceHistory, priceHistory.length);
        for (int i = 0; i < this.priceHistory.length; i++)
        {
            if (!Double.isFinite(this.priceHistory[i]) || this.priceHistory[i] < 0)
            {
                this.priceHistory[i] = 0;
            }
        }
    }
    public int getQuantity()
    {
        return quantity;
    }
    public double getAveragePurchasePrice()
    {
        double sum = 0;
        for (double price : priceHistory)
        {
            sum += price;
        }
        return (priceHistory.length == 0) ? 0 : sum / priceHistory.length;
    }
    @Override
    public String toString()
    {
        return "WarehouseItem{name='" + name + "', quantity=" + quantity + ", history=" + Arrays.toString(priceHistory) + ", averagePrice=" + getAveragePurchasePrice() + "}";
    }
}

class DiscountedWarehouseItem extends WarehouseItem
{
    private String markdownReason;
    private double discountPercent;

    public DiscountedWarehouseItem(String name, int quantity, double[] priceHistory, String markdownReason, double discountPercent)
    {
        super(name, quantity, priceHistory);
        this.markdownReason = markdownReason;
        this.discountPercent = (discountPercent >= 0 && discountPercent <= 100) ? discountPercent : 0;
    }
    public double getSalePrice()
    {
        return getAveragePurchasePrice() * (1 - discountPercent / 100);
    }
    public double getTotalSaleValue()
    {
        return getSalePrice() * getQuantity();
    }
    @Override
    public String toString()
    {
        return "DiscountedWarehouseItem{" + super.toString() + ", reason='" + markdownReason + "', discount=" + discountPercent + ", salePrice=" + getSalePrice() + ", total=" + getTotalSaleValue() + "}";
    }
}
