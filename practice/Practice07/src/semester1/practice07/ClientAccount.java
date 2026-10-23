package semester1.practice07;

public class ClientAccount
{
    private String iban;
    private String owner;
    private double balance;

    ClientAccount(String iban, String owner, double balance)
    {
        this.iban = iban;
        this.owner = owner;
        this.balance = (balance < 0) ? 0 : balance;
    }
    public boolean transferTo(ClientAccount recipient, double amount)
    {
        if (recipient != null && recipient != this && amount > 0 && balance >= amount)
        {
            this.balance -= amount;
            recipient.balance += amount;
            return true;
        }
        return false;
    }
    public void printAccount()
    {
        System.out.println("IBAN: " + iban + " Власник: " + owner + " Баланс: " + balance);
    }
}
