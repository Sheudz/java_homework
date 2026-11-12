package semester1.practice10;

public abstract class AbstractWorker
{
    private final String name;
    private final double baseSalary;

    public AbstractWorker(String name, double baseSalary)
    {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary()
    {
        return baseSalary;
    }
    @Override
    public String toString()
    {
        return name + " salary=" + baseSalary;
    }
}

interface BonusEligible
{
    double calculateQuarterBonus();
}

interface MedicalInsured
{
    double getInsuranceCoverage();
}

class FullTimeDeveloper extends AbstractWorker implements BonusEligible, MedicalInsured
{
    public FullTimeDeveloper(String name, double salary)
    {
        super(name, salary);
    }
    @Override
    public double calculateQuarterBonus()
    {
        return getBaseSalary() * 0.3;
    }
    @Override
    public double getInsuranceCoverage()
    {
        return 100000;
    }
}

class FopContractor extends AbstractWorker implements BonusEligible
{
    public FopContractor(String name, double salary)
    {
        super(name, salary);
    }
    @Override
    public double calculateQuarterBonus()
    {
        return getBaseSalary() * 0.1;
    }
}

class InternStudent extends AbstractWorker
{
    public InternStudent(String name, double salary)
    {
        super(name, salary);
    }
}
