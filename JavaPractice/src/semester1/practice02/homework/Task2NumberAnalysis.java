package semester1.practice02.homework;

public class Task2NumberAnalysis {
    public static void main(String[] args)
    {
        int number = 742;

        int hundreds = number / 100;
        int tens = (number - hundreds * 100) / 10;
        int units = number - ((hundreds * 100) + (tens * 10));

        int reversed = (units * 100) + (tens * 10) + hundreds;

        System.out.println("Початкове число:            " + number);
        System.out.println("Розряди:                    Сотні = " + hundreds + ", Десятки = " + tens + ", Одиниці = " + units);
        System.out.println("Сума цифр:                  " + (hundreds + tens + units));
        System.out.println("Добуток цифр:               " + (hundreds * tens * units));
        System.out.println("Перевернуте число:          " + reversed);
        System.out.println("Чи є сума цифр парною?      " + ((hundreds + tens + units) % 2 == 0));
    }
}
