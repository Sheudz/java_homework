package semester1.practice03.homework;
import java.util.Scanner;

public class Task1FuelCalculator {
    public static void main (String[] args)
    {
        String fuelTypeString = "";
        double pricePerLiter = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== КАЛЬКУЛЯТОР ПОЇЗДКИ ТА ПАЛЬНОГО ===");

        System.out.print("Введіть відстань поїздки (км): ");
        double distance = scanner.nextDouble();

        System.out.print("Введіть середню витрату на 100 км (л): ");
        double fuelConsumption = scanner.nextDouble();

        System.out.print("Оберіть тип пального (1 - А-95, 2 - Дизель, 3 - Газ): ");
        int fuelType = scanner.nextInt();

        if (distance <= 0 || fuelConsumption <= 0)
        {
            System.out.println("Помилка: невірні вхідні дані");
            scanner.close();
            return;
        }
        switch (fuelType)
        {
            case 1:
                fuelTypeString = "Бензин А-95 (56.50 грн/л)";
                pricePerLiter = 56.50;
                break;

            case 2:
                fuelTypeString = "Дизель (52.80 грн/л)";
                pricePerLiter = 52.80;
                break;

            case 3:
                fuelTypeString = "Газ (29.40 грн/л)";
                pricePerLiter = 29.40;
                break;

            default:
                System.out.println("Невідомий тип пального");
                scanner.close();
                return;
        }
        double neededFuel = (distance * fuelConsumption) / 100;
        double baseCost = neededFuel * pricePerLiter;
        double finalCost = (baseCost >= 2000) ? baseCost * 0.95 : baseCost;

        System.out.println("\n---------------- ЗВІТ ПОЇЗДКИ ----------------");
        System.out.println("Обране пальне:               " + fuelTypeString);
        System.out.println("Необхідно пального:          " + neededFuel + " л");
        System.out.println("Базова вартість:             " + baseCost + " грн");
        if (baseCost >= 2000)
        {
            System.out.println("Знижка АЗС (5%):             " + (baseCost * 0.05) + " грн");
        }
        System.out.println("----------------------------------------------");
        System.out.println("Підсумкова сума до сплати:   " + finalCost + " грн");
        System.out.println("==============================================");

        scanner.close();
    }
}
