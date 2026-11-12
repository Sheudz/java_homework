package semester1.practice10;

public abstract class PaymentInstrument
{
    private final String payerName;

    public PaymentInstrument(String payerName)
    {
        this.payerName = payerName;
    }
    public abstract double calculateFee(double amount);

    public double processPayment(double amount)
    {
        return amount + calculateFee(amount);
    }
    @Override
    public String toString()
    {
        return getClass().getSimpleName() + " " + payerName;
    }
}

class BankCardInstrument extends PaymentInstrument
{
    public BankCardInstrument(String name)
    {
        super(name);
    }
    @Override
    public double calculateFee(double amount)
    {
        return amount * 0.015 + 5;
    }
}

class CryptoTokenInstrument extends PaymentInstrument
{
    private final double gasFeeUah;

    public CryptoTokenInstrument(String name, double gasFeeUah)
    {
        super(name);
        this.gasFeeUah = gasFeeUah;
    }
    @Override
    public double calculateFee(double amount)
    {
        return gasFeeUah;
    }
}

class IbanDirectInstrument extends PaymentInstrument
{
    public IbanDirectInstrument(String name)
    {
        super(name);
    }
    @Override
    public double calculateFee(double amount)
    {
        return amount <= 50000 ? 0 : amount * 0.005;
    }
}
