package semester1.practice03.homework;
import java.util.Scanner;

public class Task2DeliveryService {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== ТАРИФІКАТОР СЛУЖБИ ДОСТАВКИ ===");

        System.out.print("Введіть вагу відправлення (кг): ");
        double weight = scanner.nextDouble();

        System.out.print("Введіть відстань транспортування (км): ");
        int distance = scanner.nextInt();

        System.out.print("Оберіть пункт призначення (1 - Відділення, 2 - Поштомат, 3 - Кур'єр): ");
        int deliveryType = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Чи є у вас карта Premium? (так/ні): ");
        String hasPremium = scanner.nextLine();

        if (weight <= 0 || weight > 50.0) {
            System.out.println("Помилка: вага повинна бути більше 0 та не більше 50 кг");
            scanner.close();
            return;
        }

        if (distance <= 0) {
            System.out.println("Помилка: відстань повинна бути більше 0 км");
            scanner.close();
            return;
        }

        double baseTariff = switch (deliveryType) {
            case 1 -> 50.0;
            case 2 -> {
                if (weight > 15.0) {
                    System.out.println("Помилка: поштомат не приймає посилки вагою понад 15 кг.");
                    yield -1;
                }
                yield 60.0;
            }
            case 3 -> 100.0;
            default -> -1;
        };

        if (baseTariff == -1) {
            System.out.println("Помилка: невідомий тип доставки.");
            scanner.close();
            return;
        }

        double distanceCost;

        if (distance <= 50) {
            distanceCost = 0;
        } else if (distance <= 200) {
            distanceCost = 35.0;
        } else {
            distanceCost = 80.0;
        }

        double totalBeforeDiscount = baseTariff + distanceCost;

        boolean isPremium = hasPremium.equalsIgnoreCase("так");

        double finalCost = isPremium ? totalBeforeDiscount * 0.8 : totalBeforeDiscount;

        String deliveryTypeString = switch (deliveryType) {
            case 1 -> "Відділення";
            case 2 -> "Поштомат";
            case 3 -> "Кур'єр";
            default -> "Невідомий тип";
        };

        System.out.println("\n------------- НАКЛАДНА ДОСТАВКИ -------------");
        System.out.println("Тип доставки:              " + deliveryTypeString + " (базовий тариф: " + baseTariff + " грн)");
        System.out.println("Доплата за відстань:       " + distanceCost + " грн (" + distance + " км)");
        System.out.println("Сума до знижки:            " + totalBeforeDiscount + " грн");

        if (isPremium) {
            System.out.println("Статус клієнта:            Premium (-20%)");
        } else {
            System.out.println("Статус клієнта:            Звичайний клієнт");
        }

        System.out.println("---------------------------------------------");
        System.out.println("РАЗОМ ДО СПЛАТИ:           " + finalCost + " грн");
        System.out.println("=============================================");

        scanner.close();

    }
}
