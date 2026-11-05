package semester1.practice09;

public class InvestmentPortfolio
{
    private final String investorName;
    private final AbstractAsset[] assets;
    private int count;

    public InvestmentPortfolio(String investorName, int capacity)
    {
        this.investorName = investorName;
        assets = new AbstractAsset[capacity];
    }
    public boolean addAsset(AbstractAsset asset)
    {
        if (asset == null || count == assets.length)
        {
            return false;
        }
        assets[count++] = asset;
        return true;
    }
    public double getTotalValue()
    {
        double total = 0;
        for (int i = 0; i < count; i++)
        {
            total += assets[i].getInvestedAmount();
        }
        return total;
    }
    public double getAnnualReturn()
    {
        double total = 0;
        for (int i = 0; i < count; i++)
        {
            total += assets[i].calculateAnnualReturn();
        }
        return total;
    }
    @Override
    public String toString()
    {
        return investorName + " value=" + getTotalValue() + " annualReturn=" + getAnnualReturn();
    }
}

abstract class AbstractAsset
{
    private final String ticker;
    protected double investedAmount;

    public AbstractAsset(String ticker, double investedAmount)
    {
        this.ticker = ticker;
        this.investedAmount = investedAmount;
    }
    public double getInvestedAmount()
    {
        return investedAmount;
    }
    public abstract double calculateAnnualReturn();

    @Override
    public String toString()
    {
        return ticker + " invested=" + investedAmount + " return=" + calculateAnnualReturn();
    }
}

class GovernmentBond extends AbstractAsset
{
    private final double couponPercent;

    public GovernmentBond(String ticker, double amount, double couponPercent)
    {
        super(ticker, amount);
        this.couponPercent = couponPercent;
    }
    @Override
    public double calculateAnnualReturn()
    {
        return investedAmount * couponPercent / 100;
    }
}

class DividendStock extends AbstractAsset
{
    private final double growthPercent;
    private final double dividendPercent;
    private final double taxRate;

    public DividendStock(String ticker, double amount, double growthPercent, double dividendPercent, double taxRate)
    {
        super(ticker, amount);
        this.growthPercent = growthPercent;
        this.dividendPercent = dividendPercent;
        this.taxRate = taxRate;
    }
    @Override
    public double calculateAnnualReturn()
    {
        double profit = investedAmount * (growthPercent + dividendPercent) / 100;
        return profit > 0 ? profit * (1 - taxRate) : profit;
    }
}
