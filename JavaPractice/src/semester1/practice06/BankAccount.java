package semester1.practice06;

public class BankAccount
{
    private String accountNumber;
    private double balance;

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
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
}
