package semester1.practice09;

public abstract class Solid3D
{
    private final String materialName;
    private final double densityKgPerM3;

    public Solid3D(String materialName, double densityKgPerM3)
    {
        this.materialName = materialName;
        this.densityKgPerM3 = densityKgPerM3;
    }
    public abstract double getVolume();
    public abstract double getSurfaceArea();

    public final double getMassKg()
    {
        return densityKgPerM3 * getVolume();
    }
    @Override
    public String toString()
    {
        return getClass().getSimpleName() + " material=" + materialName + " volume=" + getVolume() + " surface=" + getSurfaceArea() + " mass=" + getMassKg() + " kg";
    }
}

class Sphere3D extends Solid3D
{
    private final double radius;

    public Sphere3D(String material, double density, double radius)
    {
        super(material, density);
        this.radius = radius;
    }
    @Override
    public double getVolume()
    {
        return 4.0 / 3 * Math.PI * radius * radius * radius;
    }
    @Override
    public double getSurfaceArea()
    {
        return 4 * Math.PI * radius * radius;
    }
}

class Cylinder3D extends Solid3D
{
    private final double radius;
    private final double height;

    public Cylinder3D(String material, double density, double radius, double height)
    {
        super(material, density);
        this.radius = radius;
        this.height = height;
    }
    @Override
    public double getVolume()
    {
        return Math.PI * radius * radius * height;
    }
    @Override
    public double getSurfaceArea()
    {
        return 2 * Math.PI * radius * (radius + height);
    }
}
