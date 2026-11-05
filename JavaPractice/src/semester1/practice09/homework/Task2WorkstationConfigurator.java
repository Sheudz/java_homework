package semester1.practice09.homework;

import java.util.Arrays;
import java.util.Locale;

public class Task2WorkstationConfigurator {
    public static void main(String args[])
    {
        // TASK 2
        Motherboard motherboard = new Motherboard("ASUS ROG B650", "AM5", 4);
        PowerSupplyUnit psu = new PowerSupplyUnit("Seasonic 750W Gold", 750, 0.9);
        WorkstationPC pc = new WorkstationPC("DeepLearning-Rig", motherboard, psu);
        System.out.println("Несумісний CPU: " + pc.installComponent(new ProcessorUnit("Intel Core i9", 20000, "LGA1700", 24, 5.8, 253)));
        System.out.println("Встановлення CPU: " + pc.installComponent(new ProcessorUnit("AMD Ryzen 9 7950X", 24000, "AM5", 16, 5.7, 170)));
        System.out.println("Встановлення GPU: " + pc.installComponent(new GraphicsAccelerator("NVIDIA RTX 4080 Super", 48000, 16, 552, 320)));
        int[] speedSamples = {7400, 7450, 7420};
        NvmeSsdDrive ssd = new NvmeSsdDrive("Samsung 990 Pro 2TB", 6900, 2000, 7450, speedSamples);
        speedSamples[0] = 0;
        int[] copy = ssd.getSpeedSamples();
        copy[1] = 0;
        System.out.println("Незмінені тести SSD: " + Arrays.toString(ssd.getSpeedSamples()));
        System.out.println("Встановлення SSD: " + pc.installComponent(ssd));
        System.out.println("Перевантаження БЖ: " + pc.installComponent(new GraphicsAccelerator("Друга відеокарта", 70000, 24, 512, 450)));
        System.out.println(pc);
    }
}

final class Motherboard
{
    private final String model;
    private final String socketType;
    private final int maxExpansionSlots;

    public Motherboard(String model, String socketType, int maxExpansionSlots)
    {
        this.model = model;
        this.socketType = socketType;
        this.maxExpansionSlots = Math.max(1, Math.min(8, maxExpansionSlots));
    }
    public boolean isSocketCompatible(String cpuSocket)
    {
        return socketType.equalsIgnoreCase(cpuSocket);
    }
    public int getMaxExpansionSlots()
    {
        return maxExpansionSlots;
    }
    @Override
    public String toString()
    {
        return model + " socket=" + socketType + " slots=" + maxExpansionSlots;
    }
}

final class PowerSupplyUnit
{
    private final String model;
    private final int maxOutputWatts;
    private final double efficiencyCoefficient;

    public PowerSupplyUnit(String model, int maxOutputWatts, double efficiencyCoefficient)
    {
        this.model = model;
        this.maxOutputWatts = maxOutputWatts;
        this.efficiencyCoefficient = Math.max(0.8, Math.min(0.96, efficiencyCoefficient));
    }
    public int getSafeContinuousWatts()
    {
        return (int) (maxOutputWatts * 0.85);
    }
    public double calculateWallPowerDraw(int internalLoadWatts)
    {
        return internalLoadWatts / efficiencyCoefficient;
    }
    @Override
    public String toString()
    {
        return String.format(Locale.US, "%s safeLimit=%d W efficiency=%.0f%%", model, getSafeContinuousWatts(), efficiencyCoefficient * 100);
    }
}

abstract class AbstractHardwareComponent
{
    private final String modelName;
    private final double priceUah;

    public AbstractHardwareComponent(String modelName, double priceUah)
    {
        this.modelName = modelName;
        this.priceUah = priceUah >= 0 ? priceUah : 0;
    }
    public double getPriceUah()
    {
        return priceUah;
    }
    public abstract int getPowerWatts();
    public abstract double getBenchmarkScore();
    public abstract String getCategory();

    @Override
    public String toString()
    {
        return String.format(Locale.US, "[%s] %s (%d W | Score: %.2f | %.2f грн)", getCategory(), modelName, getPowerWatts(), getBenchmarkScore(), priceUah);
    }
}

class ProcessorUnit extends AbstractHardwareComponent
{
    private final String socket;
    private final int cores;
    private final double boostClockGhz;
    private final int tdpWatts;

    public ProcessorUnit(String model, double price, String socket, int cores, double boostClockGhz, int tdpWatts)
    {
        super(model, price);
        this.socket = socket;
        this.cores = cores;
        this.boostClockGhz = boostClockGhz;
        this.tdpWatts = tdpWatts;
    }
    public String getSocket()
    {
        return socket;
    }
    @Override
    public int getPowerWatts()
    {
        return tdpWatts;
    }
    @Override
    public double getBenchmarkScore()
    {
        return cores * boostClockGhz * 120;
    }
    @Override
    public String getCategory()
    {
        return "CPU";
    }
}

class GraphicsAccelerator extends AbstractHardwareComponent
{
    private final int vramGb;
    private final int tensorCores;
    private final int boardPowerWatts;

    public GraphicsAccelerator(String model, double price, int vramGb, int tensorCores, int boardPowerWatts)
    {
        super(model, price);
        this.vramGb = vramGb;
        this.tensorCores = tensorCores;
        this.boardPowerWatts = boardPowerWatts;
    }
    @Override
    public int getPowerWatts()
    {
        return boardPowerWatts;
    }
    @Override
    public double getBenchmarkScore()
    {
        return vramGb * 250.0 + tensorCores * 1.5;
    }
    @Override
    public String getCategory()
    {
        return "GPU";
    }
}

class NvmeSsdDrive extends AbstractHardwareComponent
{
    private final int capacityGb;
    private final int readSpeedMbSec;
    private final int[] speedSamples;

    public NvmeSsdDrive(String model, double price, int capacityGb, int readSpeedMbSec, int[] speedSamples)
    {
        super(model, price);
        this.capacityGb = capacityGb;
        this.readSpeedMbSec = readSpeedMbSec;
        this.speedSamples = Arrays.copyOf(speedSamples, speedSamples.length);
    }
    public int[] getSpeedSamples()
    {
        return Arrays.copyOf(speedSamples, speedSamples.length);
    }
    @Override
    public int getPowerWatts()
    {
        return 12;
    }
    @Override
    public double getBenchmarkScore()
    {
        return readSpeedMbSec * 0.25;
    }
    @Override
    public String getCategory()
    {
        return "NVMe SSD";
    }
    @Override
    public String toString()
    {
        return super.toString() + " capacity=" + capacityGb + " GB samples=" + Arrays.toString(speedSamples);
    }
}

class WorkstationPC
{
    private final String buildName;
    private final Motherboard motherboard;
    private final PowerSupplyUnit psu;
    private final AbstractHardwareComponent[] components;
    private int componentCount;

    public WorkstationPC(String buildName, Motherboard motherboard, PowerSupplyUnit psu)
    {
        this.buildName = buildName;
        this.motherboard = motherboard;
        this.psu = psu;
        components = new AbstractHardwareComponent[this.motherboard.getMaxExpansionSlots()];
    }
    public boolean installComponent(AbstractHardwareComponent comp)
    {
        if (comp == null || componentCount == components.length)
        {
            System.out.println("Відмова: немає компонента або вільного слота");
            return false;
        }
        if (comp instanceof ProcessorUnit)
        {
            ProcessorUnit cpu = (ProcessorUnit) comp;
            if (!motherboard.isSocketCompatible(cpu.getSocket()))
            {
                System.out.println("Відмова: несумісний сокет процесора");
                return false;
            }
        }
        if (getTotalPowerWatts() + comp.getPowerWatts() > psu.getSafeContinuousWatts())
        {
            System.out.println("Відмова: перевантаження блока живлення");
            return false;
        }
        components[componentCount++] = comp;
        return true;
    }
    public int getTotalPowerWatts()
    {
        int total = 0;
        for (int i = 0; i < componentCount; i++)
        {
            total += components[i].getPowerWatts();
        }
        return total;
    }
    public double getTotalSystemScore()
    {
        double total = 0;
        for (int i = 0; i < componentCount; i++)
        {
            total += components[i].getBenchmarkScore();
        }
        return total;
    }
    public double getTotalBuildPrice()
    {
        double total = 0;
        for (int i = 0; i < componentCount; i++)
        {
            total += components[i].getPriceUah();
        }
        return total;
    }
    @Override
    public String toString()
    {
        String result = "Збірка: " + buildName + "\nМатеринська плата: " + motherboard + "\nБлок живлення: " + psu;
        result += "\nЗайнято слотів: " + componentCount + "/" + components.length;
        for (int i = 0; i < componentCount; i++)
        {
            result += "\n" + (i + 1) + ". " + components[i];
        }
        result += String.format(Locale.US, "\nСпоживання: %d W | З розетки: %.2f W\nПродуктивність: %.2f\nВартість комплектуючих: %.2f грн", getTotalPowerWatts(), psu.calculateWallPowerDraw(getTotalPowerWatts()), getTotalSystemScore(), getTotalBuildPrice());
        return result + "\nСтан: СТАБІЛЬНО";
    }
}
