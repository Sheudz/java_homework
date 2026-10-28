package semester1.practice07;

public class Computer
{
    private String title;
    private Processor cpu;
    private Memory ram;
    private double casePrice;

    Computer(String title, Processor cpu, Memory ram, double casePrice)
    {
        this.title = title;
        this.cpu = cpu;
        this.ram = ram;
        this.casePrice = casePrice;
    }
    public double calculateTotalPrice()
    {
        return cpu.getPrice() + ram.getPrice() + casePrice;
    }
    public void upgradeMemory(Memory newRam)
    {
        if (newRam != null)
        {
            ram = newRam;
            System.out.println("Оперативну пам'ять оновлено!");
        }
    }
    public void printSpecs()
    {
        System.out.println("Комп'ютер: " + title);
        cpu.printSpecs();
        ram.printSpecs();
        System.out.println("Ціна: " + calculateTotalPrice());
    }
}
