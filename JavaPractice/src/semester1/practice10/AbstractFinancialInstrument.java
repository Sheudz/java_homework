package semester1.practice10;

public abstract class AbstractFinancialInstrument
{
    private final String ticker;
    protected int quantity;

    public AbstractFinancialInstrument(String ticker, int quantity)
    {
        this.ticker = ticker;
        this.quantity = quantity;
    }
    public abstract double getMarketValueUah();

    @Override
    public String toString()
    {
        return ticker + " quantity=" + quantity + " value=" + getMarketValueUah();
    }
}

interface Tradable
{
    boolean buy(int qty);
    boolean sell(int qty);
}

interface DividendPaying
{
    double calculateAnnualDividend();
}

class TechGrowthStock extends AbstractFinancialInstrument implements Tradable
{
    private final double price;

    public TechGrowthStock(String ticker, int quantity, double price)
    {
        super(ticker, quantity);
        this.price = price;
    }
    @Override
    public double getMarketValueUah()
    {
        return quantity * price;
    }
    @Override
    public boolean buy(int qty)
    {
        if (qty <= 0)
        {
            return false;
        }
        quantity += qty;
        return true;
    }
    @Override
    public boolean sell(int qty)
    {
        if (qty <= 0 || qty > quantity)
        {
            return false;
        }
        quantity -= qty;
        return true;
    }
}

class BlueChipStock extends AbstractFinancialInstrument implements Tradable, DividendPaying
{
    private final double price;
    private final double dividendPerShare;

    public BlueChipStock(String ticker, int quantity, double price, double dividendPerShare)
    {
        super(ticker, quantity);
        this.price = price;
        this.dividendPerShare = dividendPerShare;
    }
    @Override
    public double getMarketValueUah()
    {
        return quantity * price;
    }
    @Override
    public boolean buy(int qty)
    {
        if (qty <= 0)
        {
            return false;
        }
        quantity += qty;
        return true;
    }
    @Override
    public boolean sell(int qty)
    {
        if (qty <= 0 || qty > quantity)
        {
            return false;
        }
        quantity -= qty;
        return true;
    }
    @Override
    public double calculateAnnualDividend()
    {
        return quantity * dividendPerShare;
    }
}

class FixedTermDeposit extends AbstractFinancialInstrument implements DividendPaying
{
    private final double amount;
    private final double annualRate;

    public FixedTermDeposit(String ticker, double amount, double annualRate)
    {
        super(ticker, 1);
        this.amount = amount;
        this.annualRate = annualRate;
    }
    @Override
    public double getMarketValueUah()
    {
        return amount;
    }
    @Override
    public double calculateAnnualDividend()
    {
        return amount * annualRate;
    }
}
