package semester1.practice06;

public class DiscountCard
{
    private String ownerName;
    private double totalSpent;
    private int discountPercent = 1;

    public void setOwnerName(String ownerName)
    {
        this.ownerName = ownerName;
    }
    public void addPurchase(double cost)
    {
        if (cost > 0)
        {
            totalSpent += cost;
            if (totalSpent >= 10000)
            {
                discountPercent = 10;
            }
            else if (totalSpent >= 5000)
            {
                discountPercent = 5;
            }
            else
            {
                discountPercent = 1;
            }
        }
    }
    public void printCardInfo()
    {
        System.out.println("Власник: " + ownerName + " Витрачено: " + totalSpent + " Знижка: " + discountPercent + "%");
    }
}
