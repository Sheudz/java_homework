package semester1.practice08;

public class StaffMember
{
    private String name;
    private double baseSalary;

    public StaffMember(String name, double baseSalary)
    {
        this.name = name;
        this.baseSalary = Math.max(0, baseSalary);
    }
    public double calculateMonthlyPay()
    {
        return baseSalary;
    }
    @Override
    public String toString()
    {
        return "StaffMember{name='" + name + "', baseSalary=" + baseSalary + ", pay=" + calculateMonthlyPay() + "}";
    }
}

class Manager extends StaffMember
{
    private double teamBonus;

    public Manager(String name, double baseSalary, double teamBonus)
    {
        super(name, baseSalary);
        this.teamBonus = Math.max(0, teamBonus);
    }
    @Override
    public double calculateMonthlyPay()
    {
        return super.calculateMonthlyPay() + teamBonus;
    }
    @Override
    public String toString()
    {
        return "Manager{" + super.toString() + ", bonus=" + teamBonus + "}";
    }
}

class SalesPerson extends StaffMember
{
    private double salesVolume;
    private double commissionRate;

    public SalesPerson(String name, double baseSalary, double salesVolume, double commissionRate)
    {
        super(name, baseSalary);
        this.salesVolume = Math.max(0, salesVolume);
        this.commissionRate = Math.max(0, commissionRate);
    }
    @Override
    public double calculateMonthlyPay()
    {
        return super.calculateMonthlyPay() + salesVolume * (commissionRate / 100.0);
    }
    @Override
    public String toString()
    {
        return "SalesPerson{" + super.toString() + ", sales=" + salesVolume + ", commission=" + commissionRate + "%}";
    }
}
