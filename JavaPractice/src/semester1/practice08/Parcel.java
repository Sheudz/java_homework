package semester1.practice08;

public class Parcel
{
    private String trackingCode;
    private double weightKg;

    public Parcel(String trackingCode, double weightKg)
    {
        this.trackingCode = trackingCode;
        this.weightKg = Math.max(0, weightKg);
    }
    public double calculateShippingCost()
    {
        return 50.0 + weightKg * 12.0;
    }
    @Override
    public String toString()
    {
        return "Parcel{code='" + trackingCode + "', weight=" + weightKg + ", cost=" + calculateShippingCost() + "}";
    }
}

class FragileParcel extends Parcel
{
    private boolean requiresWoodenBox;
    private double insuranceValue;

    public FragileParcel(String trackingCode, double weightKg, boolean requiresWoodenBox, double insuranceValue)
    {
        super(trackingCode, weightKg);
        this.requiresWoodenBox = requiresWoodenBox;
        this.insuranceValue = Math.max(0, insuranceValue);
    }
    @Override
    public double calculateShippingCost()
    {
        return super.calculateShippingCost() + insuranceValue * 0.015 + (requiresWoodenBox ? 120 : 0);
    }
    @Override
    public String toString()
    {
        return "FragileParcel{" + super.toString() + ", woodenBox=" + requiresWoodenBox + ", insurance=" + insuranceValue + "}";
    }
}
