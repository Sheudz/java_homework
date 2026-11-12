package semester1.practice10.homework;

import java.util.Locale;

public class Task2SmartPaymentAndAuditGateway {
    public static void main(String args[])
    {
        // TASK 2
        AbstractPaymentTransaction[] ledger = {
                new PremiumCardPayment("TX-101", 20000, "**** 1234"),
                new CryptoUsdtPayment("TX-102", 8500, "0x9f8ac4", 18),
                new TaxTreasuryPayment("TX-103", 5000, "TAX001")
        };
        auditPayments(ledger);
        System.out.println("Повторна обробка TX-101: " + ledger[0].process());
    }

    public static void auditPayments(AbstractPaymentTransaction[] ledger)
    {
        double turnover = 0;
        double fees = 0;
        double cashbackTotal = 0;
        for (AbstractPaymentTransaction tx : ledger)
        {
            if (tx.process())
            {
                turnover += tx.getBaseAmountUah();
                fees += tx.calculateFee();
                System.out.println(tx);
                if (tx instanceof CashbackCapable cashback)
                {
                    double amount = cashback.calculateCashback(tx.getBaseAmountUah());
                    cashbackTotal += amount;
                    System.out.printf(Locale.US, "Кешбек %s: %.2f грн\n", tx.getTxId(), amount);
                }
                if (tx instanceof BlockchainVerifiable blockchain)
                {
                    System.out.println("Hash=" + blockchain.getTxHash() + " Підтверджень=" + blockchain.getConfirmations() + " Finalized=" + blockchain.isFinalized());
                }
                if (tx instanceof Refundable refundable)
                {
                    System.out.println("Повернення " + tx.getTxId() + ": " + refundable.requestRefund("Тестове повернення"));
                }
            }
        }
        System.out.printf(Locale.US, "Оборот: %.2f грн\nКомісії: %.2f грн\nКешбек: %.2f грн\n", turnover, fees, cashbackTotal);
    }
}

interface CashbackCapable
{
    double MAX_CASHBACK_UAH = 500;
    double getCashbackRate();

    default double calculateCashback(double baseAmount)
    {
        return Math.min(MAX_CASHBACK_UAH, baseAmount * getCashbackRate());
    }
}

interface Refundable
{
    boolean requestRefund(String reason);
    boolean isRefunded();
}

interface BlockchainVerifiable
{
    String getTxHash();
    int getConfirmations();

    default boolean isFinalized()
    {
        return getConfirmations() >= 12;
    }
}

abstract class AbstractPaymentTransaction
{
    private final String txId;
    private final double baseAmountUah;
    private boolean processed;

    public AbstractPaymentTransaction(String txId, double baseAmountUah)
    {
        this.txId = txId;
        this.baseAmountUah = baseAmountUah;
    }
    public String getTxId()
    {
        return txId;
    }
    public double getBaseAmountUah()
    {
        return baseAmountUah;
    }
    public boolean isProcessed()
    {
        return processed;
    }
    public abstract double calculateFee();
    public abstract String getPaymentChannel();

    public final boolean process()
    {
        if (baseAmountUah <= 0 || processed)
        {
            return false;
        }
        processed = true;
        return true;
    }
    public final double getTotalCharged()
    {
        return baseAmountUah + calculateFee();
    }
    @Override
    public String toString()
    {
        return String.format(Locale.US, "[%s | %s] Сума: %.2f грн | Комісія: %.2f грн | Всього: %.2f грн", txId, getPaymentChannel(), baseAmountUah, calculateFee(), getTotalCharged());
    }
}

class PremiumCardPayment extends AbstractPaymentTransaction implements CashbackCapable, Refundable
{
    private final String maskedPan;
    private boolean refunded;

    public PremiumCardPayment(String txId, double amount, String maskedPan)
    {
        super(txId, amount);
        this.maskedPan = maskedPan;
    }
    @Override
    public double calculateFee()
    {
        return getBaseAmountUah() * 0.01;
    }
    @Override
    public String getPaymentChannel()
    {
        return "Visa Infinite " + maskedPan;
    }
    @Override
    public double getCashbackRate()
    {
        return 0.03;
    }
    @Override
    public boolean requestRefund(String reason)
    {
        if (isProcessed() && !refunded)
        {
            refunded = true;
            return true;
        }
        return false;
    }
    @Override
    public boolean isRefunded()
    {
        return refunded;
    }
}

class CryptoUsdtPayment extends AbstractPaymentTransaction implements CashbackCapable, BlockchainVerifiable
{
    private final String txHash;
    private final int confirmations;

    public CryptoUsdtPayment(String txId, double amount, String txHash, int confirmations)
    {
        super(txId, amount);
        this.txHash = txHash;
        this.confirmations = confirmations;
    }
    @Override
    public double calculateFee()
    {
        return 40;
    }
    @Override
    public String getPaymentChannel()
    {
        return "USDT TRC-20";
    }
    @Override
    public double getCashbackRate()
    {
        return 0.01;
    }
    @Override
    public String getTxHash()
    {
        return txHash;
    }
    @Override
    public int getConfirmations()
    {
        return confirmations;
    }
}

final class TaxTreasuryPayment extends AbstractPaymentTransaction implements Refundable
{
    private final String taxCode;
    private boolean refunded;

    public TaxTreasuryPayment(String txId, double amount, String taxCode)
    {
        super(txId, amount);
        this.taxCode = taxCode;
    }
    @Override
    public double calculateFee()
    {
        return 0;
    }
    @Override
    public String getPaymentChannel()
    {
        return "ДержКазначейство " + taxCode;
    }
    @Override
    public boolean requestRefund(String reason)
    {
        if (isProcessed() && !refunded)
        {
            refunded = true;
            return true;
        }
        return false;
    }
    @Override
    public boolean isRefunded()
    {
        return refunded;
    }
}
