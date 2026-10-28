package semester1.practice07;

public class SalaryCalculator
{
    public double calculate(double baseRate)
    {
        return baseRate;
    }
    public double calculate(double baseRate, double fixedBonus)
    {
        return baseRate + fixedBonus;
    }
    public double calculate(double baseRate, double bonusPercent, boolean isTaxDeducted)
    {
        double result = baseRate + baseRate * bonusPercent / 100;
        if (isTaxDeducted)
        {
            result -= result * 19.5 / 100;
        }
        return result;
    }
    public double calculate(double baseRate, int overtimeHours, double overtimeHourlyRate)
    {
        return baseRate + overtimeHours * overtimeHourlyRate;
    }
}
