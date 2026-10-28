package semester1.practice08.homework;

import java.util.Locale;

public class Task2BankingHierarchy {
    public static void main(String args[])
    {
        // TASK 2
        System.out.println("================ БАНКІВСЬКА ІЄРАРХІЯ РАХУНКІВ ================");
        BankAccount account = new BankAccount("UA001", "Станіслав", 1000);
        System.out.println(account);
        account.deposit(500);
        System.out.println("Зняти 300: " + account.withdraw(300));
        System.out.println("Зняти 2000: " + account.withdraw(2000));
        System.out.println(account);

        System.out.print("\n");

        SavingsAccount savings = new SavingsAccount("UA101", "Олена Коваль", 5000, 12, 1000);
        System.out.println(savings);
        System.out.println("Зняти 4500: " + savings.withdraw(4500));
        savings.applyInterest();
        System.out.println("Після нарахування відсотків:");
        System.out.println(savings);

        System.out.print("\n");

        CreditAccount credit = new CreditAccount("UA202", "Максим Бондар", 2000, 10000, 2);
        System.out.println(credit);
        System.out.println("Зняти 5000: " + credit.withdraw(5000));
        System.out.println(credit);
        System.out.println("Зняти ще 10000: " + credit.withdraw(10000));
        System.out.println(credit);
        credit.deposit(4000);
        System.out.println("Після поповнення:");
        System.out.println(credit);
        System.out.println("==============================================================");
    }
}

class BankAccount
{
    private String iban;
    private String ownerName;
    protected double balance;

    public BankAccount(String iban, String ownerName, double initialBalance)
    {
        this.iban = iban;
        this.ownerName = ownerName;
        this.balance = (Double.isFinite(initialBalance) && initialBalance >= 0) ? initialBalance : 0;
    }
    public String getIban()
    {
        return iban;
    }
    public String getOwnerName()
    {
        return ownerName;
    }
    public double getBalance()
    {
        return balance;
    }
    public void deposit(double amount)
    {
        if (Double.isFinite(amount) && amount > 0 && Double.isFinite(balance + amount))
        {
            balance += amount;
        }
    }
    public boolean withdraw(double amount)
    {
        if (Double.isFinite(amount) && amount > 0 && amount <= balance)
        {
            balance -= amount;
            return true;
        }
        System.out.println("Відмова: некоректна сума або недостатньо коштів");
        return false;
    }
    @Override
    public String toString()
    {
        return String.format(Locale.US, "Рахунок[%s | Власник: %s | Баланс: %.2f грн]", iban, ownerName, balance);
    }
}

class SavingsAccount extends BankAccount
{
    private double interestRate;
    private double minBalance;

    public SavingsAccount(String iban, String ownerName, double initialBalance, double interestRate, double minBalance)
    {
        super(iban, ownerName, initialBalance);
        this.interestRate = (Double.isFinite(interestRate) && interestRate >= 0) ? interestRate : 0;
        this.minBalance = (Double.isFinite(minBalance) && minBalance >= 0) ? minBalance : 0;
    }
    @Override
    public boolean withdraw(double amount)
    {
        if (balance - amount >= minBalance)
        {
            return super.withdraw(amount);
        }
        System.out.println("Відмова: порушення незнижуваного залишку " + minBalance + " грн");
        return false;
    }
    public void applyInterest()
    {
        deposit(balance * (interestRate / 100.0));
    }
    @Override
    public String toString()
    {
        return String.format(Locale.US, "SavingsAccount{%s, Ставка: %.1f%%, Мін.залишок: %.2f грн}", super.toString(), interestRate, minBalance);
    }
}

class CreditAccount extends BankAccount
{
    private double creditLimit;
    private double feePercent;

    public CreditAccount(String iban, String ownerName, double initialBalance, double creditLimit, double feePercent)
    {
        super(iban, ownerName, initialBalance);
        this.creditLimit = (Double.isFinite(creditLimit) && creditLimit >= 0) ? creditLimit : 0;
        this.feePercent = (Double.isFinite(feePercent) && feePercent >= 0) ? feePercent : 0;
    }
    @Override
    public boolean withdraw(double amount)
    {
        if (!Double.isFinite(amount) || amount <= 0)
        {
            System.out.println("Відмова: некоректна сума зняття");
            return false;
        }
        if (balance >= amount)
        {
            return super.withdraw(amount);
        }
        double borrowed = amount - Math.max(0.0, balance);
        double fee = borrowed * (feePercent / 100.0);
        double newBalance = balance - amount - fee;
        if (newBalance >= -creditLimit)
        {
            balance = newBalance;
            return true;
        }
        System.out.println("Відмова: перевищено кредитний ліміт з урахуванням комісії");
        return false;
    }
    public double getCurrentDebt()
    {
        return (balance < 0) ? Math.abs(balance) : 0;
    }
    @Override
    public String toString()
    {
        return String.format(Locale.US, "CreditAccount{%s, Ліміт: %.2f грн, Комісія: %.1f%%, Борг: %.2f грн}", super.toString(), creditLimit, feePercent, getCurrentDebt());
    }
}
