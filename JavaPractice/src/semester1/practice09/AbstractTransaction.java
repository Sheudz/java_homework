package semester1.practice09;

public abstract class AbstractTransaction
{
    private final String txId;
    protected final double amount;

    public AbstractTransaction(String txId, double amount)
    {
        this.txId = txId;
        this.amount = amount;
    }
    public abstract double calculateCommission();

    public final double getTotalDebit()
    {
        return amount + calculateCommission();
    }
    @Override
    public String toString()
    {
        return txId + " amount=" + amount + " commission=" + calculateCommission() + " total=" + getTotalDebit();
    }
}

class DomesticTransfer extends AbstractTransaction
{
    public DomesticTransfer(String txId, double amount)
    {
        super(txId, amount);
    }
    @Override
    public double calculateCommission()
    {
        return Math.max(5, amount * 0.005);
    }
}

class CryptoTransfer extends AbstractTransaction
{
    private final double networkGasFee;

    public CryptoTransfer(String txId, double amount, double networkGasFee)
    {
        super(txId, amount);
        this.networkGasFee = networkGasFee;
    }
    @Override
    public double calculateCommission()
    {
        return networkGasFee;
    }
}
