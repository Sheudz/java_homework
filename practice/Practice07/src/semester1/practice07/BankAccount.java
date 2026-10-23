package semester1.practice07;

public class BankAccount
{
    private String accountNumber;
    private String ownerName;
    private double balance;

    BankAccount(String accountNumber, String ownerName, double initialBalance)
    {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = (initialBalance < 0) ? 0.0 : initialBalance;
    }

    public void deposit(double amount)
    {
        if (amount > 0) {
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
        else
        {
            return false;
        }
    }
    public void printAccount()
    {
        System.out.println("Номер власника: " + accountNumber + "Власник: " + ownerName + " Поточний баланс: " + balance);
    }
}
