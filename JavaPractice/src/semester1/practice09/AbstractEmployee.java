package semester1.practice09;

public abstract class AbstractEmployee
{
    private final int id;
    private final String name;
    protected double taxRate;

    public AbstractEmployee(int id, String name, double taxRate)
    {
        this.id = id;
        this.name = name;
        this.taxRate = taxRate;
    }
    public abstract double calculateGrossSalary();

    public final double calculateNetSalary()
    {
        return calculateGrossSalary() * (1 - taxRate);
    }
    @Override
    public String toString()
    {
        return id + " " + name + " gross=" + calculateGrossSalary() + " net=" + calculateNetSalary();
    }
}

class SalariedEmployee extends AbstractEmployee
{
    private double monthlySalary;
    private double bonus;

    public SalariedEmployee(int id, String name, double monthlySalary, double bonus)
    {
        super(id, name, 0.195);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }
    @Override
    public double calculateGrossSalary()
    {
        return monthlySalary + bonus;
    }
}

class HourlyContractor extends AbstractEmployee
{
    private int hoursWorked;
    private double hourlyRate;

    public HourlyContractor(int id, String name, int hoursWorked, double hourlyRate)
    {
        super(id, name, 0.195);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double calculateGrossSalary()
    {
        return Math.min(160, hoursWorked) * hourlyRate + Math.max(0, hoursWorked - 160) * hourlyRate * 1.5;
    }
}
