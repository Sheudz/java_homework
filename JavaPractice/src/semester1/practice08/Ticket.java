package semester1.practice08;

public class Ticket
{
    private String eventName;
    private double basePrice;

    public Ticket(String eventName, double basePrice)
    {
        this.eventName = eventName;
        this.basePrice = Math.max(0, basePrice);
    }
    public double getFinalPrice()
    {
        return basePrice;
    }
    @Override
    public String toString()
    {
        return "Ticket{event='" + eventName + "', basePrice=" + basePrice + ", finalPrice=" + getFinalPrice() + "}";
    }
}

class StudentTicket extends Ticket
{
    private String studentCardNumber;

    public StudentTicket(String eventName, double basePrice, String studentCardNumber)
    {
        super(eventName, basePrice);
        this.studentCardNumber = studentCardNumber;
    }
    @Override
    public double getFinalPrice()
    {
        return super.getFinalPrice() * 0.5;
    }
    @Override
    public String toString()
    {
        return "StudentTicket{" + super.toString() + ", studentCard='" + studentCardNumber + "'}";
    }
}

class VipTicket extends Ticket
{
    private boolean includesBackstage;
    private double loungeFee;

    public VipTicket(String eventName, double basePrice, boolean includesBackstage, double loungeFee)
    {
        super(eventName, basePrice);
        this.includesBackstage = includesBackstage;
        this.loungeFee = Math.max(0, loungeFee);
    }
    @Override
    public double getFinalPrice()
    {
        return super.getFinalPrice() + loungeFee;
    }
    @Override
    public String toString()
    {
        return "VipTicket{" + super.toString() + ", backstage=" + includesBackstage + ", loungeFee=" + loungeFee + "}";
    }
}
