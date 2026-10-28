package semester1.practice08;

import java.util.Locale;

public class CardWallet
{
    private String cardNumber;
    private String pinCode;
    private double balance;

    public CardWallet(String cardNumber, String pinCode, double balance)
    {
        this.cardNumber = (cardNumber != null && cardNumber.matches("[0-9]{16}")) ? cardNumber : "0000000000000000";
        this.pinCode = (pinCode != null && pinCode.matches("[0-9]{4}")) ? pinCode : "0000";
        this.balance = (Double.isFinite(balance) && balance >= 0) ? balance : 0;
    }
    public boolean changePin(String oldPin, String newPin)
    {
        if (pinCode.equals(oldPin) && newPin != null && newPin.matches("[0-9]{4}"))
        {
            pinCode = newPin;
            return true;
        }
        return false;
    }
    @Override
    public String toString()
    {
        return String.format(Locale.US, "CardWallet{card='**** **** **** %s', balance=%.2f UAH}", cardNumber.substring(12), balance);
    }
}
