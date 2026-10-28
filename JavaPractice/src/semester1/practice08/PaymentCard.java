package semester1.practice08;

public class PaymentCard
{
    private String cardHolder;
    protected double balance;

    public PaymentCard(String cardHolder, double balance)
    {
        this.cardHolder = cardHolder;
        this.balance = (Double.isFinite(balance) && balance >= 0) ? balance : 0;
    }
    public double getBalance()
    {
        return balance;
    }
    public boolean pay(double amount)
    {
        if (Double.isFinite(amount) && amount > 0 && amount <= balance)
        {
            balance -= amount;
            return true;
        }
        return false;
    }
    @Override
    public String toString()
    {
        return "PaymentCard{holder='" + cardHolder + "', balance=" + balance + "}";
    }
}

class DebitCard extends PaymentCard
{
    private double dailyLimit;
    private double spentToday;

    public DebitCard(String cardHolder, double balance, double dailyLimit)
    {
        super(cardHolder, balance);
        this.dailyLimit = Math.max(0, dailyLimit);
    }
    @Override
    public boolean pay(double amount)
    {
        if (amount > dailyLimit - spentToday)
        {
            return false;
        }
        if (super.pay(amount))
        {
            spentToday += amount;
            return true;
        }
        return false;
    }
    public void resetDailySpending()
    {
        spentToday = 0;
    }
    @Override
    public String toString()
    {
        return "DebitCard{" + super.toString() + ", dailyLimit=" + dailyLimit + ", spentToday=" + spentToday + "}";
    }
}

class CashbackPlatinumCard extends DebitCard
{
    private double cashbackPercent;
    private double accumulatedCashback;

    public CashbackPlatinumCard(String cardHolder, double balance, double dailyLimit, double cashbackPercent)
    {
        super(cardHolder, balance, dailyLimit);
        this.cashbackPercent = (cashbackPercent >= 0 && cashbackPercent <= 100) ? cashbackPercent : 0;
    }
    public double getAccumulatedCashback()
    {
        return accumulatedCashback;
    }
    @Override
    public boolean pay(double amount)
    {
        if (super.pay(amount))
        {
            accumulatedCashback += amount * cashbackPercent / 100;
            return true;
        }
        return false;
    }
    @Override
    public String toString()
    {
        return "CashbackPlatinumCard{" + super.toString() + ", cashbackPercent=" + cashbackPercent + ", accumulated=" + accumulatedCashback + "}";
    }
}
