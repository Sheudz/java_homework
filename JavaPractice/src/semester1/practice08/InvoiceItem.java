package semester1.practice08;

public class InvoiceItem
{
    private String description;
    private int quantity;
    private double unitPrice;
    private double discountPercent;

    public InvoiceItem(String description, int quantity, double unitPrice, double discountPercent)
    {
        this.description = description;
        this.quantity = Math.max(0, quantity);
        this.unitPrice = (Double.isFinite(unitPrice) && unitPrice >= 0) ? unitPrice : 0;
        this.discountPercent = (discountPercent >= 0 && discountPercent <= 50) ? discountPercent : 0;
    }
    public double getFinalAmount()
    {
        return quantity * unitPrice * (1 - discountPercent / 100);
    }
    @Override
    public String toString()
    {
        return description + " Кількість: " + quantity + " Ціна: " + unitPrice + " Знижка: " + discountPercent + "% Разом: " + getFinalAmount();
    }
}
