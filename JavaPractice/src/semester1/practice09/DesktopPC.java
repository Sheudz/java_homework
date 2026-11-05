package semester1.practice09;

public class DesktopPC
{
    private final int psuMaxWatts;
    private final AbstractPcPart[] parts;
    private int count;

    public DesktopPC(int psuMaxWatts, int capacity)
    {
        this.psuMaxWatts = psuMaxWatts;
        parts = new AbstractPcPart[capacity];
    }
    public boolean addPart(AbstractPcPart part)
    {
        if (part == null || count == parts.length)
        {
            return false;
        }
        parts[count++] = part;
        return true;
    }
    public int getTotalPowerWatts()
    {
        int total = 0;
        for (int i = 0; i < count; i++)
        {
            total += parts[i].getPowerConsumptionWatts();
        }
        return total;
    }
    public boolean isStable()
    {
        return getTotalPowerWatts() * 1.2 <= psuMaxWatts;
    }
    @Override
    public String toString()
    {
        String result = "DesktopPC{PSU=" + psuMaxWatts + ", load=" + getTotalPowerWatts() + ", stable=" + isStable() + "}";
        for (int i = 0; i < count; i++)
        {
            result += "\n" + parts[i];
        }
        return result;
    }
}

abstract class AbstractPcPart
{
    private final String model;
    private final double priceUah;

    public AbstractPcPart(String model, double priceUah)
    {
        this.model = model;
        this.priceUah = priceUah;
    }
    public abstract int getPowerConsumptionWatts();

    @Override
    public String toString()
    {
        return model + " price=" + priceUah + " power=" + getPowerConsumptionWatts() + " W";
    }
}

class ProcessorPart extends AbstractPcPart
{
    private final int cores;
    private final int watts;

    public ProcessorPart(String model, double price, int cores, int watts)
    {
        super(model, price);
        this.cores = cores;
        this.watts = watts;
    }
    @Override
    public int getPowerConsumptionWatts()
    {
        return watts;
    }
    @Override
    public String toString()
    {
        return super.toString() + " cores=" + cores;
    }
}

class VideoCardPart extends AbstractPcPart
{
    private final int vramGb;
    private final int watts;

    public VideoCardPart(String model, double price, int vramGb, int watts)
    {
        super(model, price);
        this.vramGb = vramGb;
        this.watts = watts;
    }
    @Override
    public int getPowerConsumptionWatts()
    {
        return watts;
    }
    @Override
    public String toString()
    {
        return super.toString() + " VRAM=" + vramGb + " GB";
    }
}
