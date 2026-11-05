package semester1.practice09;

public class LandPlot
{
    private final double totalPlotAreaM2;
    private final AbstractShape[] structures;
    private int count;

    public LandPlot(double totalPlotAreaM2, int capacity)
    {
        this.totalPlotAreaM2 = totalPlotAreaM2;
        structures = new AbstractShape[capacity];
    }
    public double getBuiltArea()
    {
        double total = 0;
        for (int i = 0; i < count; i++)
        {
            total += structures[i].getArea();
        }
        return total;
    }
    public boolean addStructure(AbstractShape s)
    {
        if (s == null || count == structures.length || getBuiltArea() + s.getArea() > totalPlotAreaM2 * 0.6)
        {
            return false;
        }
        structures[count++] = s;
        return true;
    }
    public double getFreeGreenArea()
    {
        return totalPlotAreaM2 - getBuiltArea();
    }
    @Override
    public String toString()
    {
        return "LandPlot{area=" + totalPlotAreaM2 + ", built=" + getBuiltArea() + ", green=" + getFreeGreenArea() + "}";
    }
}
