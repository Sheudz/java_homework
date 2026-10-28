package semester1.practice05.homework;

import java.util.Scanner;
import java.util.Locale;

public class Task1DailySales {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        String[] days = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"};
        double[] sales = new double[7];
        System.out.println("=== ФІНАНСОВИЙ ЗВІТ КАВ'ЯРНІ ЗА ТИЖДЕНЬ ===");
        System.out.println("Дробові числа вводьте через крапку");
        for (int i = 0; i < sales.length; i++)
        {
            do
            {
                System.out.print("Введіть виторг за " + days[i] + " (грн): ");
                sales[i] = scanner.nextDouble();
                if (sales[i] < 0)
                {
                    System.out.println("Виторг не може бути від'ємним");
                }
            } while (sales[i] < 0);
        }

        double total = 0;
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < sales.length; i++)
        {
            total += sales[i];
            if (sales[i] > sales[maxIndex])
            {
                maxIndex = i;
            }
            if (sales[i] < sales[minIndex])
            {
                minIndex = i;
            }
        }
        double average = total / sales.length;

        System.out.println("\n---------------- ПІДСУМКИ ----------------");
        System.out.printf(Locale.US, "Загальний тижневий виторг: %.2f грн%n", total);
        System.out.printf(Locale.US, "Середній виторг на день: %.2f грн%n", average);
        System.out.printf(Locale.US, "Найкращий день: %s (%.2f грн)%n", days[maxIndex], sales[maxIndex]);
        System.out.printf(Locale.US, "Найгірший день: %s (%.2f грн)%n", days[minIndex], sales[minIndex]);
        System.out.println("\nДні з виторгом вище середнього:");
        boolean hasAboveAverage = false;
        for (int i = 0; i < sales.length; i++)
        {
            if (sales[i] > average)
            {
                System.out.printf(Locale.US, "- %s: %.2f грн%n", days[i], sales[i]);
                hasAboveAverage = true;
            }
        }
        if (!hasAboveAverage)
        {
            System.out.println("Таких днів немає");
        }
        System.out.println("==========================================");
        scanner.close();
    }
}
