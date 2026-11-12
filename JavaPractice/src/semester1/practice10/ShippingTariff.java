package semester1.practice10;

public abstract class ShippingTariff
{
    public abstract double calculateCost(double weightKg, double distanceKm);
}

class RoadTruckTariff extends ShippingTariff
{
    @Override
    public double calculateCost(double weightKg, double distanceKm)
    {
        return 15 * distanceKm + 2.5 * weightKg;
    }
}

class AirCargoTariff extends ShippingTariff
{
    @Override
    public double calculateCost(double weightKg, double distanceKm)
    {
        return 45 * distanceKm + 18 * weightKg + 500;
    }
}

class RailFreightTariff extends ShippingTariff
{
    @Override
    public double calculateCost(double weightKg, double distanceKm)
    {
        return 1200 + 4 * distanceKm + 0.8 * weightKg;
    }
}
