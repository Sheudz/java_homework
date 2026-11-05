package semester1.practice09;

public class CryptoVault
{
    private final String walletAddress;
    private String secretRecoveryPhrase;
    private double btcBalance;
    private boolean locked = true;

    public CryptoVault(String walletAddress, String secretRecoveryPhrase, double btcBalance)
    {
        this.walletAddress = walletAddress;
        this.secretRecoveryPhrase = secretRecoveryPhrase;
        this.btcBalance = btcBalance;
    }
    public boolean unlock(String phrase)
    {
        if (secretRecoveryPhrase.equals(phrase))
        {
            locked = false;
            return true;
        }
        return false;
    }
    public void lock()
    {
        locked = true;
    }
    public boolean sendBtc(double amount, String destination)
    {
        if (!locked && amount > 0 && amount <= btcBalance)
        {
            btcBalance -= amount;
            return true;
        }
        return false;
    }
    @Override
    public String toString()
    {
        return "CryptoVault{address='" + walletAddress + "', locked=" + locked + ", balance=" + btcBalance + " BTC}";
    }
}
