package semester1.practice10;

public abstract class AbstractCustomer
{
    public abstract double getDiscountPercent();
}

class VipCustomer extends AbstractCustomer
{
    @Override
    public double getDiscountPercent()
    {
        return 20;
    }
}

class StudentCustomer extends AbstractCustomer
{
    @Override
    public double getDiscountPercent()
    {
        return 10;
    }
}
