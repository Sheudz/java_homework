package semester1.practice08;

public class Medicine
{
    private String name;
    private double price;
    private boolean isExpired;

    public Medicine(String name, double price, boolean isExpired)
    {
        this.name = name;
        this.price = Math.max(0, price);
        this.isExpired = isExpired;
    }
    public boolean isExpired()
    {
        return isExpired;
    }
    @Override
    public String toString()
    {
        return "Medicine{name='" + name + "', price=" + price + ", expired=" + isExpired + "}";
    }
}

class PrescriptionMedicine extends Medicine
{
    private String doctorLicense;

    public PrescriptionMedicine(String name, double price, boolean isExpired, String doctorLicense)
    {
        super(name, price, isExpired);
        this.doctorLicense = doctorLicense;
    }
    public boolean canSell(boolean hasPrescription)
    {
        return !isExpired() && hasPrescription;
    }
    @Override
    public String toString()
    {
        return "PrescriptionMedicine{" + super.toString() + ", doctorLicense='" + doctorLicense + "'}";
    }
}

class ControlledSubstance extends PrescriptionMedicine
{
    private int patientAge;

    public ControlledSubstance(String name, double price, boolean isExpired, String doctorLicense, int patientAge)
    {
        super(name, price, isExpired, doctorLicense);
        this.patientAge = Math.max(0, patientAge);
    }
    @Override
    public boolean canSell(boolean hasPrescription)
    {
        return super.canSell(hasPrescription) && patientAge >= 18;
    }
    @Override
    public String toString()
    {
        return "ControlledSubstance{" + super.toString() + ", patientAge=" + patientAge + "}";
    }
}
