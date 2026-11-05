package semester1.practice09;

public class ParcelOrder
{
    private final String orderId;
    private double weightKg;
    private DeliveryAddress destination;
    private boolean shipped;

    public ParcelOrder(String orderId, double weightKg, DeliveryAddress destination)
    {
        this.orderId = orderId;
        this.weightKg = weightKg;
        this.destination = destination;
    }
    public boolean changeDestination(DeliveryAddress newAddress)
    {
        if (!shipped && newAddress != null)
        {
            destination = newAddress;
            return true;
        }
        return false;
    }
    public void markAsShipped()
    {
        shipped = true;
    }
    @Override
    public String toString()
    {
        return orderId + " weight=" + weightKg + " destination=" + destination + " shipped=" + shipped;
    }
}

class DeliveryAddress
{
    private String city;
    private String street;
    private int postOfficeNumber;

    public DeliveryAddress(String city, String street, int postOfficeNumber)
    {
        this.city = validate(city);
        this.street = validate(street);
        this.postOfficeNumber = Math.max(1, postOfficeNumber);
    }
    private String validate(String text)
    {
        return text == null || text.isBlank() ? "Невідомо" : text;
    }
    @Override
    public String toString()
    {
        return city + ", " + street + ", відділення " + postOfficeNumber;
    }
}
