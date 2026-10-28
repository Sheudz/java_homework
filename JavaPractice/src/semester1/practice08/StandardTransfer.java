package semester1.practice08;

public class StandardTransfer
{
    protected double amount;

    public StandardTransfer(double amount)
    {
        this.amount = Math.max(0, amount);
    }
    public double getFee()
    {
        return amount * 0.01;
    }
    public double getTotalWithFee()
    {
        return amount + getFee();
    }
    @Override
    public String toString()
    {
        return "StandardTransfer{amount=" + amount + ", fee=" + getFee() + ", total=" + getTotalWithFee() + "}";
    }
}

class InternationalTransfer extends StandardTransfer
{
    private String countryCode;

    public InternationalTransfer(double amount, String countryCode)
    {
        super(amount);
        this.countryCode = countryCode;
    }
    @Override
    public double getFee()
    {
        return super.getFee() * 2 + 15.0;
    }
    @Override
    public String toString()
    {
        return "InternationalTransfer{" + super.toString() + ", country='" + countryCode + "'}";
    }
}
