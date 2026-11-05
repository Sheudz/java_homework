package semester1.practice09;

public class HighSecuritySafe
{
    private int pinCode;
    private double storedCash;
    private int failedAttempts;
    private boolean permanentlyBlocked;

    public HighSecuritySafe(int pinCode)
    {
        this.pinCode = pinCode;
    }
    private boolean checkAccess(int enteredPin)
    {
        if (permanentlyBlocked)
        {
            return false;
        }
        if (enteredPin != pinCode)
        {
            failedAttempts++;
            permanentlyBlocked = failedAttempts >= 3;
            return false;
        }
        failedAttempts = 0;
        return true;
    }
    public boolean putCash(int pin, double amount)
    {
        if (checkAccess(pin) && amount > 0)
        {
            storedCash += amount;
            return true;
        }
        return false;
    }
    public boolean takeCash(int pin, double amount)
    {
        if (checkAccess(pin) && amount > 0 && amount <= storedCash)
        {
            storedCash -= amount;
            return true;
        }
        return false;
    }
    @Override
    public String toString()
    {
        return "Safe{cash=" + storedCash + ", failedAttempts=" + failedAttempts + ", blocked=" + permanentlyBlocked + "}";
    }
}
