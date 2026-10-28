package semester1.practice05.homework;

import java.util.Locale;

public class Task2WarehouseInventory {
    public static void main(String args[])
    {
        String[] items = {"Ноутбук", "Смартфон", "Бездротові навушники", "Механічна клавіатура", "Монітор 27\""};
        int[] quantities = {8, 3, 25, 4, 12};
        double[] prices = {28500.0, 19200.0, 1850.0, 3100.0, 9400.0};
        double[] totalValues = new double[items.length];
        double total = 0;
        int maxIndex = 0;

        System.out.println("======================= ЗВІТ СКЛАДУ ЕЛЕКТРОНІКИ =======================");
        System.out.printf("%s | %-21s | %5s | %12s | %15s%n", "№", "Назва товару", "К-сть", "Ціна за шт.", "Сумарна вартість");
        System.out.println("-----------------------------------------------------------------------");
        for (int i = 0; i < items.length; i++)
        {
            totalValues[i] = quantities[i] * prices[i];
            total += totalValues[i];
            if (totalValues[i] > totalValues[maxIndex])
            {
                maxIndex = i;
            }
            System.out.printf(Locale.US, "%d | %-21s | %5d | %12.2f | %15.2f%n", i + 1, items[i], quantities[i], prices[i], totalValues[i]);
        }

        System.out.println("-----------------------------------------------------------------------");
        System.out.printf(Locale.US, "Загальна вартість складу: %.2f грн%n", total);
        System.out.printf(Locale.US, "Найбільший капітал у товарі: %s (%.2f грн)%n", items[maxIndex], totalValues[maxIndex]);
        System.out.println("\nДЕФІЦИТНІ ПОЗИЦІЇ (менше 5 шт.):");
        for (int i = 0; i < items.length; i++)
        {
            if (quantities[i] < 5)
            {
                System.out.println("- " + items[i] + " (залишилось: " + quantities[i] + " шт.)");
                System.out.println("УВАГА: Терміново замовити постачальнику!");
            }
        }
        System.out.println("=======================================================================");
    }
}
