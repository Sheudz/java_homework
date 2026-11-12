package semester1.practice10;

public abstract class AbstractBird
{
    protected final String species;
    protected double weightKg;

    public AbstractBird(String species, double weightKg)
    {
        this.species = species;
        this.weightKg = weightKg;
    }
    public abstract String makeSound();

    @Override
    public String toString()
    {
        return species + " weight=" + weightKg;
    }
}

interface FlyableUnit
{
    double getFlightSpeedKmh();
}

interface SwimmingUnit
{
    double getDiveDepthMeters();
}

class Falcon extends AbstractBird implements FlyableUnit
{
    public Falcon(double weightKg)
    {
        super("Сокіл", weightKg);
    }
    @Override
    public String makeSound()
    {
        return "Кі-кі";
    }
    @Override
    public double getFlightSpeedKmh()
    {
        return 100;
    }
}

class EmperorPenguin extends AbstractBird implements SwimmingUnit
{
    public EmperorPenguin(double weightKg)
    {
        super("Імператорський пінгвін", weightKg);
    }
    @Override
    public String makeSound()
    {
        return "Га-га";
    }
    @Override
    public double getDiveDepthMeters()
    {
        return 500;
    }
}

class CargoPlane implements FlyableUnit
{
    @Override
    public double getFlightSpeedKmh()
    {
        return 800;
    }
}
