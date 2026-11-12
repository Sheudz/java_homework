package semester1.practice10;

public class EscrowSmartContract implements BlockchainSmartContract
{
    private final String signatureKey;
    private boolean verified;
    private String auditTrail = "Контракт створено";

    public EscrowSmartContract(String signatureKey)
    {
        this.signatureKey = signatureKey;
    }
    @Override
    public boolean verifySignature(String key)
    {
        verified = signatureKey.equals(key);
        auditTrail += "\nПідпис перевірено: " + verified;
        return verified;
    }
    @Override
    public String getAuditTrail()
    {
        return auditTrail;
    }
    @Override
    public boolean executeContract(double gasLimit)
    {
        boolean executed = verified && gasLimit > 0;
        auditTrail += "\nВиконання контракту: " + executed;
        return executed;
    }
}

interface Authenticatable
{
    boolean verifySignature(String key);
}

interface Auditable
{
    String getAuditTrail();
}

interface BlockchainSmartContract extends Authenticatable, Auditable
{
    boolean executeContract(double gasLimit);
}
