package semester1.practice09;

public class BankAccount
{
    private final String iban;
    private double balance;

    public BankAccount(String iban, double balance)
    {
        this.iban = iban;
        this.balance = balance;
    }
    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
        }
    }
    public boolean withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            return true;
        }
        return false;
    }
    public double getBalance()
    {
        return balance;
    }
    @Override
    public String toString()
    {
        return iban + " balance=" + balance;
    }
}

class PlasticCard
{
    private final String cardNumber;
    private final String expiryDate;
    private boolean blocked;
    private final BankAccount linkedAccount;

    public PlasticCard(String cardNumber, String expiryDate, BankAccount linkedAccount)
    {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.linkedAccount = linkedAccount;
    }
    public void block()
    {
        blocked = true;
    }
    public boolean payAtTerminal(double amount)
    {
        return !blocked && linkedAccount != null && linkedAccount.withdraw(amount);
    }
    @Override
    public String toString()
    {
        return "Card{number='" + cardNumber + "', expiry='" + expiryDate + "', blocked=" + blocked + ", account=" + linkedAccount + "}";
    }
}
