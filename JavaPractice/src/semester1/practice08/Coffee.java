package semester1.practice08;

public class Coffee
{
    private String roastType;
    private int volumeMl;
    private double basePrice;

    public Coffee(String roastType, int volumeMl, double basePrice)
    {
        this.roastType = roastType;
        this.volumeMl = Math.max(0, volumeMl);
        this.basePrice = Math.max(0, basePrice);
    }
    public int getVolumeMl()
    {
        return volumeMl;
    }
    public double calculateCalories()
    {
        return volumeMl * 2.0 / 100;
    }
    public double calculatePrice()
    {
        return basePrice;
    }
    @Override
    public String toString()
    {
        return "Кава: " + roastType + " Об'єм: " + volumeMl + " мл Калорійність: " + calculateCalories() + " ккал Ціна: " + calculatePrice() + " грн";
    }
}

class LatteWithAddons extends Coffee
{
    private String milkType;
    private int syrupPumps;

    public LatteWithAddons(String roastType, int volumeMl, double basePrice, String milkType, int syrupPumps)
    {
        super(roastType, volumeMl, basePrice);
        this.milkType = milkType;
        this.syrupPumps = Math.max(0, syrupPumps);
    }
    @Override
    public double calculateCalories()
    {
        return super.calculateCalories() + getVolumeMl() * 0.5 + syrupPumps * 20;
    }
    @Override
    public double calculatePrice()
    {
        return super.calculatePrice() + ("Рослинне".equalsIgnoreCase(milkType) ? 20 : 0) + syrupPumps * 12;
    }
    @Override
    public String toString()
    {
        return "Лате | " + super.toString() + " Молоко: " + milkType + " Сироп: " + syrupPumps;
    }
}
