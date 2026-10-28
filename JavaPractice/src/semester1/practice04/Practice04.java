package semester1.practice04;

import java.util.Scanner;
import java.util.Locale;

public class Practice04 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Дробові числа вводьте через крапку");

        // TASK 1
        for (int i = 0; i < 7; i++) {
            System.out.println("Java - надійна та кросплатформна мова!");
        }

        System.out.print("\n");

        // TASK 2
        System.out.print("Введіть текст: ");
        String text = scanner.nextLine();
        int n;
        do
        {
            System.out.print("Кількість повторень (не менше 1): ");
            n = scanner.nextInt();
        } while (n < 1);
        for (int i = 1; i <= n; i++)
        {
            System.out.println("[" + i + "] " + text);
        }

        System.out.print("\n");

        // TASK 3
        int savings = 0;
        for (int month = 1; month <= 12; month++)
        {
            savings += 500;
            System.out.println("Місяць " + month + ": " + savings + " грн");
        }

        System.out.print("\n");

        // TASK 4
        double rate;
        do
        {
            System.out.print("Введіть курс євро (більше 0): ");
            rate = scanner.nextDouble();
        } while (rate <= 0);
        for (int euro = 10; euro <= 100; euro += 10)
        {
            double uah = Math.round(euro * rate * 100) / 100.0;
            System.out.println(euro + " EUR = " + uah + " грн");
        }

        System.out.print("\n");

        // TASK 5
        System.out.print("Введіть ширину лінії: ");
        int width = scanner.nextInt();
        for (int i = 0; i < width; i++)
        {
            System.out.print("=");
        }
        System.out.println();

        System.out.print("\n");

        // TASK 6
        int countdown = 10;
        while (countdown >= 1)
        {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Поїхали! Ракета запущена!");

        System.out.print("\n");

        // TASK 7
        long sum = 0;
        System.out.print("Вводьте цілі числа, 0 для завершення: ");
        int number = scanner.nextInt();
        while (number != 0)
        {
            sum += number;
            number = scanner.nextInt();
        }
        System.out.println("Сума: " + sum);

        System.out.print("\n");

        // TASK 8
        System.out.print("Введіть межу M для степенів двійки: ");
        int limit = scanner.nextInt();
        long power = 1;
        while (power <= limit)
        {
            System.out.print(power + " ");
            power *= 2;
        }
        System.out.println();

        System.out.print("\n");

        // TASK 9
        do
        {
            System.out.print("Введіть додатне число для підрахунку цифр: ");
            n = scanner.nextInt();
        } while (n <= 0);
        int temp = n;
        int digitCount = 0;
        int digitSum = 0;
        while (temp > 0)
        {
            digitSum += temp % 10;
            digitCount++;
            temp /= 10;
        }
        System.out.println("Кількість цифр: " + digitCount);
        System.out.println("Сума цифр: " + digitSum);

        System.out.print("\n");

        // TASK 10
        do
        {
            System.out.print("Введіть додатне число для реверсу: ");
            n = scanner.nextInt();
        } while (n <= 0);
        long reversedNumber = 0;
        temp = n;
        while (temp > 0)
        {
            reversedNumber = reversedNumber * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Реверс: " + reversedNumber);

        System.out.print("\n");

        // TASK 11
        double initialAmount;
        double interestRate;
        do
        {
            System.out.print("Введіть початковий внесок (більше 0): ");
            initialAmount = scanner.nextDouble();
        } while (initialAmount <= 0);
        do
        {
            System.out.print("Введіть річну ставку у відсотках (більше 0): ");
            interestRate = scanner.nextDouble();
        } while (interestRate <= 0);
        double balance = initialAmount;
        int years = 0;
        while (balance < initialAmount * 2)
        {
            balance += balance * interestRate / 100;
            years++;
        }
        System.out.println("Для подвоєння потрібно років: " + years);

        System.out.print("\n");

        // TASK 12
        do
        {
            System.out.print("Введіть число N більше 1: ");
            n = scanner.nextInt();
        } while (n <= 1);
        int divisor = 2;
        while (n % divisor != 0 && divisor <= n / divisor)
        {
            divisor++;
        }
        if (n % divisor != 0)
        {
            divisor = n;
        }
        System.out.println("Найменший дільник: " + divisor);

        System.out.print("\n");

        // TASK 13
        int secretNumber = 42;
        int attempts = 0;
        int guess = 0;
        while (guess != secretNumber)
        {
            System.out.print("Вгадайте число від 1 до 100: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess < secretNumber)
            {
                System.out.println("Більше!");
            }
            else if (guess > secretNumber)
            {
                System.out.println("Менше!");
            }
        }
        System.out.println("Вгадали! Кількість спроб: " + attempts);

        System.out.print("\n");

        // TASK 14
        int choice;
        do
        {
            System.out.println("1. Розпочати нову гру");
            System.out.println("2. Завантажити збереження");
            System.out.println("3. Налаштування");
            System.out.println("0. Вихід");
            System.out.print("Оберіть дію: ");
            choice = scanner.nextInt();
            switch (choice)
            {
                case 1 -> System.out.println("Нову гру розпочато");
                case 2 -> System.out.println("Збереження завантажено");
                case 3 -> System.out.println("Налаштування відкрито");
                case 0 -> System.out.println("Вихід з меню");
                default -> System.out.println("Невідомий пункт меню");
            }
        } while (choice != 0);

        System.out.print("\n");

        // TASK 15
        int age;
        do
        {
            System.out.print("Введіть вік (1..120): ");
            age = scanner.nextInt();
        } while (age < 1 || age > 120);
        System.out.println("Вік підтверджено: " + age);

        System.out.print("\n");

        // TASK 16
        int pin;
        attempts = 0;
        do
        {
            System.out.print("Введіть PIN: ");
            pin = scanner.nextInt();
            attempts++;
            if (pin == 1234)
            {
                System.out.println("Доступ надано");
                break;
            }
        } while (attempts < 3);
        if (pin != 1234)
        {
            System.out.println("Карту заблоковано!");
        }

        System.out.print("\n");

        // TASK 17
        char answer;
        do
        {
            System.out.print("Введіть два числа для додавання: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            System.out.println("Сума: " + (a + b));
            System.out.print("Бажаєте продовжити? (y/n): ");
            answer = scanner.next().charAt(0);
        } while (answer == 'y');

        System.out.print("\n");

        // TASK 18
        int dice1;
        int dice2;
        attempts = 0;
        do
        {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            attempts++;
            System.out.println("Кидок " + attempts + ": " + dice1 + " " + dice2);
        } while (dice1 != dice2);
        System.out.println("Дубль! Кількість спроб: " + attempts);

        System.out.print("\n");

        // TASK 19
        System.out.print("Введіть чисельник: ");
        double numerator = scanner.nextDouble();
        double denominator;
        do
        {
            System.out.print("Введіть знаменник (не 0): ");
            denominator = scanner.nextDouble();
        } while (denominator == 0);
        System.out.println("Результат ділення: " + numerator / denominator);

        System.out.print("\n");

        // TASK 20
        int grade;
        long gradeSum = 0;
        int gradeCount = 0;
        do
        {
            System.out.print("Введіть бал (0..100), від'ємне число для завершення: ");
            grade = scanner.nextInt();
            if (grade > 100)
            {
                System.out.println("Некоректний бал");
            }
            else if (grade >= 0)
            {
                gradeSum += grade;
                gradeCount++;
            }
        } while (grade >= 0);
        if (gradeCount > 0)
        {
            System.out.println("Середній бал: " + (double) gradeSum / gradeCount);
        }
        else
        {
            System.out.println("Оцінок не введено");
        }

        System.out.print("\n");

        // TASK 21
        int start;
        int end;
        do
        {
            System.out.print("Введіть A та B (A <= B): ");
            start = scanner.nextInt();
            end = scanner.nextInt();
        } while (start > end);
        for (long i = start; i <= end; i++)
        {
            if (i % 2 == 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("\n");

        // TASK 22
        do
        {
            System.out.print("Введіть N для факторіала (0..20): ");
            n = scanner.nextInt();
        } while (n < 0 || n > 20);
        long factorial = 1;
        for (int i = 1; i <= n; i++)
        {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);

        System.out.print("\n");

        // TASK 23
        System.out.printf("%5s | %7s | %4s%n", "Число", "Квадрат", "Куб");
        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("%5d | %7d | %4d%n", i, i * i, i * i * i);
        }

        System.out.print("\n");

        // TASK 24
        for (int i = 1; i <= 50; i++)
        {
            if (i % 3 == 0 || i % 5 == 0)
            {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("\n");

        // TASK 25
        for (int i = 100; i <= 200; i++)
        {
            if (i % 13 == 0 && i % 7 == 0)
            {
                System.out.println("Перше кратне 13 і 7: " + i);
                break;
            }
        }

        System.out.print("\n");

        // TASK 26
        for (char ch = 'A'; ch <= 'Z'; ch++)
        {
            System.out.println(ch + " - " + (int) ch);
        }

        System.out.print("\n");

        // TASK 27
        do
        {
            System.out.print("Введіть кількість доданків (не менше 1): ");
            n = scanner.nextInt();
        } while (n < 1);
        long alternatingSum = 0;
        for (long i = 1; i <= n; i++)
        {
            if (i % 2 == 0)
            {
                alternatingSum -= i;
            }
            else
            {
                alternatingSum += i;
            }
        }
        System.out.println("Знакозмінна сума: " + alternatingSum);

        System.out.print("\n");

        // TASK 28
        System.out.print("Введіть перший член прогресії: ");
        double firstTerm = scanner.nextDouble();
        System.out.print("Введіть різницю прогресії: ");
        double difference = scanner.nextDouble();
        do
        {
            System.out.print("Введіть кількість членів (не менше 1): ");
            n = scanner.nextInt();
        } while (n < 1);
        double term = firstTerm;
        double progressionSum = 0;
        for (int i = 0; i < n; i++)
        {
            System.out.print(term + " ");
            progressionSum += term;
            term += difference;
        }
        System.out.println();
        System.out.println("Сума прогресії: " + progressionSum);

        System.out.print("\n");

        // TASK 29
        byte b = 125;
        for (int i = 0; i < 6; i++)
        {
            b = (byte) (b + 1);
            System.out.println(b);
        }
        System.out.println("Після 127 отримуємо -128, бо byte зберігає лише 8 біт");

        System.out.print("\n");

        // TASK 30
        do
        {
            System.out.print("Введіть кількість чисел для середнього (не менше 1): ");
            n = scanner.nextInt();
        } while (n < 1);
        int numberSum = 0;
        for (int i = 0; i < n; i++)
        {
            System.out.print("Введіть ціле число: ");
            numberSum += scanner.nextInt();
        }
        double average = (double) numberSum / n;
        double wrongAverage = numberSum / n;
        System.out.println("З приведенням: " + average);
        System.out.println("Без приведення: " + wrongAverage);

        System.out.print("\n");

        // TASK 31
        System.out.print("Введіть слово для шифрування: ");
        String word = scanner.next();
        String encrypted = "";
        for (int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            encrypted += (char) (ch + 1);
        }
        System.out.println("Зашифроване слово: " + encrypted);

        System.out.print("\n");

        // TASK 32
        int wholeHryvnias = 0;
        double discardedParts = 0;
        for (int i = 1; i <= 5; i++)
        {
            double price;
            do
            {
                System.out.print("Введіть цінник " + i + " (не менше 0): ");
                price = scanner.nextDouble();
            } while (price < 0);
            int wholePart = (int) price;
            wholeHryvnias += wholePart;
            discardedParts += price - wholePart;
        }
        long kopecks = Math.round(discardedParts * 100);
        System.out.println("Сума цілих гривень: " + wholeHryvnias);
        System.out.println("Сума відкинутих копійок: " + kopecks + " коп");

        System.out.print("\n");

        // TASK 33
        for (int i = 1; i <= 50; i++)
        {
            int percent = (int) (((double) i / 50) * 100);
            System.out.println("Завантажено: " + percent + "%");
        }

        System.out.print("\n");

        // TASK 34
        long bigNumber = 3_000_000_000L;
        int smallNumber = (int) bigNumber;
        System.out.println("long: " + bigNumber);
        System.out.println("int: " + smallNumber);
        System.out.println("При приведенні до int старші біти відкидаються, тому значення змінюється");

        System.out.print("\n");

        // TASK 35
        System.out.println("Дробовий лічильник:");
        for (double d = 0.0; d <= 1.0; d += 0.1)
        {
            System.out.println(d);
        }
        System.out.println("Цілочисельний лічильник:");
        for (int i = 0; i <= 10; i++)
        {
            double val = i / 10.0;
            System.out.println(val);
        }

        System.out.print("\n");

        // TASK 36
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 10; j++)
            {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

        System.out.print("\n");

        // TASK 37
        int height;
        do
        {
            System.out.print("Введіть висоту та ширину рамки (більше 0): ");
            height = scanner.nextInt();
            width = scanner.nextInt();
        } while (height < 1 || width < 1);
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.print("\n");

        // TASK 38
        do
        {
            System.out.print("Введіть висоту трикутника (більше 0): ");
            n = scanner.nextInt();
        } while (n < 1);
        for (int i = 1; i <= n; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.print("\n");

        // TASK 39
        System.out.print("Введіть N для пошуку простих чисел: ");
        n = scanner.nextInt();
        System.out.print("Прості числа: ");
        for (long i = 2; i <= n; i++)
        {
            boolean isPrime = true;
            for (long j = 2; j * j <= i; j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("\n");

        // TASK 40
        do
        {
            System.out.print("Введіть розмір шахівниці (більше 0): ");
            n = scanner.nextInt();
        } while (n < 1);
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(((i + j) % 2 == 0) ? "#" : "_");
                if (j < n - 1)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
