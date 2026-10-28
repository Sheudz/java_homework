package semester1.practice07;

public class FleetCar
{
    private String vinCode;
    private double currentMileage;
    private static int totalCars = 0;
    private static double totalCompanyMileage = 0.0;

    FleetCar(String vinCode, double initialMileage)
    {
        this.vinCode = vinCode;
        this.currentMileage = (initialMileage < 0) ? 0 : initialMileage;
        totalCars++;
        totalCompanyMileage += currentMileage;
    }
    public void addTrip(double km)
    {
        if (km > 0)
        {
            this.currentMileage += km;
            totalCompanyMileage += km;
        }
    }
    public static void printFleetSummary()
    {
        System.out.println("Автомобілів: " + totalCars + " Загальний пробіг: " + totalCompanyMileage);
    }
}
