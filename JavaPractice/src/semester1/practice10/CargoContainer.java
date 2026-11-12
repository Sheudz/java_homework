package semester1.practice10;

public class CargoContainer
{
    private final String cargoName;

    public CargoContainer(String cargoName)
    {
        this.cargoName = cargoName;
    }
    @Override
    public String toString()
    {
        return cargoName;
    }
}

interface HazardousCargo
{
    int getHazardClass();
}

interface RefrigeratedCargo
{
    double getRequiredTempC();
}

class ElectronicsContainer extends CargoContainer
{
    public ElectronicsContainer()
    {
        super("Електроніка");
    }
}

class ChemicalContainer extends CargoContainer implements HazardousCargo
{
    public ChemicalContainer()
    {
        super("Хімікати");
    }
    @Override
    public int getHazardClass()
    {
        return 3;
    }
}

class FrozenFoodContainer extends CargoContainer implements RefrigeratedCargo
{
    public FrozenFoodContainer()
    {
        super("Заморожені продукти");
    }
    @Override
    public double getRequiredTempC()
    {
        return -18;
    }
}
