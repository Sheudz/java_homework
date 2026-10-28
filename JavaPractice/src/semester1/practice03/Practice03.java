package semester1.practice03;

import java.util.Scanner;
import java.util.Locale;

public class Practice03 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Дробові числа вводьте через крапку.");

        // TASK 1
        System.out.print("Введіть ім'я: ");
        String firstName = scanner.nextLine();
        System.out.print("Введіть прізвище: ");
        String lastName = scanner.nextLine();
        System.out.print("Введіть вік: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть місто: ");
        String city = scanner.nextLine();
        System.out.println("=== ВХІДНІ ДАНІ ===");
        System.out.println("Ім'я: " + firstName);
        System.out.println("Прізвище: " + lastName);
        System.out.println("Вік: " + age);
        System.out.println("Місто: " + city);
        System.out.println("-------------------");
        System.out.println("Привіт, " + firstName + " " + lastName + " з міста " + city + "! Твій вік: " + age + " р.");

        System.out.print("\n");

        // TASK 2
        System.out.print("Введіть перше число: ");
        int a = scanner.nextInt();
        System.out.print("Введіть друге число: ");
        int b = scanner.nextInt();
        System.out.println("Сума: " + (a + b));
        System.out.println("Різниця: " + (a - b));
        System.out.println("Добуток: " + (a * b));
        if (b != 0)
        {
            System.out.println("Остача від ділення: " + (a % b));
        }
        else
        {
            System.out.println("Помилка: ділення на нуль!");
        }

        System.out.print("\n");

        // TASK 3
        System.out.print("Введіть суму в гривнях (UAH): ");
        double uah = scanner.nextDouble();
        System.out.print("Введіть курс USD: ");
        double usdRate = scanner.nextDouble();
        if (uah >= 0 && usdRate > 0)
        {
            double usd = Math.round(uah / usdRate * 100) / 100.0;
            System.out.println("Сума до видачі: " + usd + " USD");
        }
        else
        {
            System.out.println("Некоректна сума або курс!");
        }

        System.out.print("\n");

        // TASK 4
        System.out.print("Введіть номер квитка: ");
        int ticketNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть повне ім'я студента: ");
        String fullName = scanner.nextLine();
        System.out.print("Введіть спеціальність: ");
        String specialty = scanner.nextLine();
        System.out.println("Студент: " + fullName + ", квиток №" + ticketNumber + ", спеціальність: " + specialty);

        System.out.print("\n");

        // TASK 5
        System.out.print("Ваш зріст (м): ");
        double height = scanner.nextDouble();
        System.out.print("Ваша вага (кг): ");
        double weight = scanner.nextDouble();
        if (height > 0 && weight > 0)
        {
            double bmi = weight / (height * height);
            System.out.println("Розрахований BMI: " + Math.round(bmi * 100) / 100.0);
        }
        else
        {
            System.out.println("Зріст та вага мають бути додатними!");
        }

        System.out.print("\n");

        // TASK 6
        System.out.print("Введіть символ: ");
        char ch = scanner.next().charAt(0);
        System.out.println("Символ: " + ch + " | Код символу: " + (int) ch);

        System.out.print("\n");

        // TASK 7
        System.out.print("Катет A: ");
        double legA = scanner.nextDouble();
        System.out.print("Катет B: ");
        double legB = scanner.nextDouble();
        if (legA > 0 && legB > 0)
        {
            double hypotenuse = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
            System.out.println("Гіпотенуза: " + hypotenuse);
            System.out.println("Периметр: " + (legA + legB + hypotenuse));
            System.out.println("Площа: " + (legA * legB / 2));
        }
        else
        {
            System.out.println("Катети мають бути додатними!");
        }

        System.out.print("\n");

        // TASK 8
        scanner.nextLine();
        System.out.print("Товар: ");
        String productName = scanner.nextLine();
        System.out.print("Ціна: ");
        double price = scanner.nextDouble();
        System.out.print("Кількість: ");
        int quantity = scanner.nextInt();
        if (price >= 0 && quantity >= 0)
        {
            double total = price * quantity;
            double vat = total * 0.2;
            System.out.println("Товар: " + productName);
            System.out.println("Загальна сума: " + total + " грн (з них ПДВ 20%: " + vat + " грн)");
        }
        else
        {
            System.out.println("Некоректна ціна або кількість!");
        }

        System.out.print("\n");

        // TASK 9
        System.out.print("Введіть число для перевірки знаку: ");
        int number = scanner.nextInt();
        if (number > 0)
        {
            System.out.println("Число додатне.");
        }
        else if (number < 0)
        {
            System.out.println("Число від'ємне.");
        }
        else
        {
            System.out.println("Число дорівнює нулю.");
        }

        System.out.print("\n");

        // TASK 10
        System.out.print("Введіть число для перевірки парності: ");
        number = scanner.nextInt();
        if (number == 0)
        {
            System.out.println("Число є нулем");
        }
        else if (number % 2 == 0)
        {
            System.out.println("Число " + number + " є парним.");
        }
        else
        {
            System.out.println("Число " + number + " є непарним.");
        }

        System.out.print("\n");

        // TASK 11
        System.out.print("Введіть вік для визначення категорії: ");
        age = scanner.nextInt();
        if (age < 0 || age > 120)
        {
            System.out.println("Некоректний вік");
        }
        else if (age <= 12)
        {
            System.out.println("Дитина");
        }
        else if (age <= 17)
        {
            System.out.println("Підліток");
        }
        else if (age <= 64)
        {
            System.out.println("Дорослий");
        }
        else
        {
            System.out.println("Пенсіонер");
        }

        System.out.print("\n");

        // TASK 12
        System.out.print("Введіть тестовий бал (0..100): ");
        int score = scanner.nextInt();
        if (score < 0 || score > 100)
        {
            System.out.println("Помилка: некоректний бал!");
        }
        else if (score >= 90)
        {
            System.out.println("Відмінно (A)");
        }
        else if (score >= 82)
        {
            System.out.println("Дуже добре (B)");
        }
        else if (score >= 74)
        {
            System.out.println("Добре (C)");
        }
        else if (score >= 64)
        {
            System.out.println("Задовільно (D)");
        }
        else if (score >= 60)
        {
            System.out.println("Достатньо (E)");
        }
        else
        {
            System.out.println("Незадовільно (F)");
        }

        System.out.print("\n");

        // TASK 13
        System.out.print("Введіть 3 цілих числа: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = a;
        int min = a;
        if (b > max)
        {
            max = b;
        }
        if (c > max)
        {
            max = c;
        }
        if (b < min)
        {
            min = b;
        }
        if (c < min)
        {
            min = c;
        }
        System.out.println("Максимум: " + max);
        System.out.println("Мінімум: " + min);

        System.out.print("\n");

        // TASK 14
        System.out.print("Введіть X: ");
        double pointX = scanner.nextDouble();
        System.out.print("Введіть Y: ");
        double pointY = scanner.nextDouble();
        if (pointX == 0 && pointY == 0)
        {
            System.out.println("Точка знаходиться в початку координат.");
        }
        else if (pointY == 0)
        {
            System.out.println("Точка лежить на осі X.");
        }
        else if (pointX == 0)
        {
            System.out.println("Точка лежить на осі Y.");
        }
        else if (pointX > 0 && pointY > 0)
        {
            System.out.println("Точка знаходиться у I чверті.");
        }
        else if (pointX < 0 && pointY > 0)
        {
            System.out.println("Точка знаходиться у II чверті.");
        }
        else if (pointX < 0 && pointY < 0)
        {
            System.out.println("Точка знаходиться у III чверті.");
        }
        else
        {
            System.out.println("Точка знаходиться у IV чверті.");
        }

        System.out.print("\n");

        // TASK 15
        int x = 5;
        int y = 20;
        if (x > 10)
            if (y > 10)
                System.out.println("x та y більші за 10");
            else
                System.out.println("y не більше 10");

        if (x > 10)
        {
            if (y > 10)
            {
                System.out.println("x та y більші за 10");
            }
        }
        else
        {
            System.out.println("x не більше 10");
        }

        System.out.print("\n");

        // TASK 16
        System.out.print("Спожито електроенергії (кВт·год): ");
        double electricity = scanner.nextDouble();
        if (electricity < 0)
        {
            System.out.println("Споживання не може бути від'ємним!");
        }
        else
        {
            double electricityCost;
            if (electricity <= 100)
            {
                electricityCost = electricity * 2.64;
            }
            else
            {
                electricityCost = 100 * 2.64 + (electricity - 100) * 4.32;
            }
            System.out.println("Сума до сплати: " + Math.round(electricityCost * 100) / 100.0 + " грн");
        }

        System.out.print("\n");

        // TASK 17
        System.out.print("Введіть два цілих числа: ");
        x = scanner.nextInt();
        y = scanner.nextInt();
        max = (x > y) ? x : y;
        System.out.println("Більше число: " + max);

        System.out.print("\n");

        // TASK 18
        System.out.print("Введіть число для обчислення модуля: ");
        int n = scanner.nextInt();
        long abs = (n < 0) ? -(long) n : n;
        System.out.println("Модуль: " + abs);

        System.out.print("\n");

        // TASK 19
        System.out.print("Введіть число: ");
        n = scanner.nextInt();
        String result = (n % 2 == 0) ? "Парне" : "Непарне";
        System.out.println(result);

        System.out.print("\n");

        // TASK 20
        System.out.print("Введіть бал: ");
        score = scanner.nextInt();
        System.out.println("Результат: " + ((score >= 60) ? "Зараховано" : "Незараховано"));

        System.out.print("\n");

        // TASK 21
        System.out.print("Введіть число: ");
        n = scanner.nextInt();
        String status = (n > 0) ? "Додатне" : (n < 0) ? "Від'ємне" : "Нуль";
        System.out.println(status);

        System.out.print("\n");

        // TASK 22
        System.out.print("Сума покупки: ");
        double purchaseAmount = scanner.nextDouble();
        if (purchaseAmount >= 0)
        {
            double discountedAmount = (purchaseAmount > 1000) ? purchaseAmount * 0.9 : purchaseAmount * 0.98;
            System.out.println("До сплати зі знижкою: " + Math.round(discountedAmount * 100) / 100.0 + " грн");
        }
        else
        {
            System.out.println("Некоректна сума покупки!");
        }

        System.out.print("\n");

        // TASK 23
        System.out.print("Введіть ділене та дільник (цілі числа): ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println((b != 0) ? "Результат: " + (double) a / b : "Помилка: ділення на нуль неможливе!");

        System.out.print("\n");

        // TASK 24
        System.out.print("Введіть кількість помилок: ");
        int count = scanner.nextInt();
        System.out.println((count == 1) ? "Знайдено 1 помилку" : "Знайдено " + count + " помилок");

        System.out.print("\n");

        // TASK 25
        x = 10;
        int divisor = 0;
        if (divisor != 0 && (x / divisor > 1))
        {
            System.out.println("Успішне ділення");
        }
        else
        {
            System.out.println("Ділення безпечно пропущено завдяки short-circuit!");
        }

        System.out.print("\n");

        // TASK 26
        int counter1 = 0;
        int counter2 = 0;
        boolean b1 = false && (++counter1 > 0);
        boolean b2 = false & (++counter2 > 0);
        System.out.println("counter1: " + counter1 + " counter2: " + counter2);
        System.out.println("b1: " + b1 + " b2: " + b2);

        System.out.print("\n");

        // TASK 27
        number = 5;
        if (number > 0 || (10 / 0 == 0))
        {
            System.out.println("Умова виконана, аварійне ділення не викликалося!");
        }

        System.out.print("\n");

        // TASK 28
        int counterA = 0;
        int counterB = 0;
        boolean test1 = true || (++counterA > 0);
        boolean test2 = true | (++counterB > 0);
        System.out.println("counterA: " + counterA + " counterB: " + counterB);
        System.out.println("test1: " + test1 + " test2: " + test2);

        System.out.print("\n");

        // TASK 29
        System.out.print("Введіть години та хвилини: ");
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        boolean isValidTime = (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59);
        if (isValidTime)
        {
            System.out.println(String.format("%02d:%02d", hours, minutes));
        }
        else
        {
            System.out.println("Помилка: некоректний час!");
        }

        System.out.print("\n");

        // TASK 30
        System.out.print("Введіть три сторони трикутника: ");
        double sideA = scanner.nextDouble();
        double sideB = scanner.nextDouble();
        double sideC = scanner.nextDouble();
        boolean triangleExists = (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA);
        System.out.println("Трикутник існує: " + triangleExists);

        System.out.print("\n");

        // TASK 31
        System.out.print("Введіть число для побітової перевірки: ");
        n = scanner.nextInt();
        boolean isEvenBitwise = (n & 1) == 0;
        System.out.println("Парне через &: " + isEvenBitwise);
        System.out.println("Парне через %: " + (n % 2 == 0));
        System.out.println("Побітове І з 1 залишає лише останній біт: 0 — парне, 1 — непарне.");

        System.out.print("\n");

        // TASK 32
        System.out.print("PIN правильний (true/false): ");
        boolean isPinCorrect = scanner.nextBoolean();
        System.out.print("Картка активна (true/false): ");
        boolean isCardActive = scanner.nextBoolean();
        System.out.print("Балансу вистачає (true/false): ");
        boolean hasSufficientBalance = scanner.nextBoolean();
        System.out.print("Добовий ліміт перевищено (true/false): ");
        boolean isDailyLimitExceeded = scanner.nextBoolean();
        boolean canWithdraw = isPinCorrect && isCardActive && hasSufficientBalance && !isDailyLimitExceeded;
        System.out.println("Транзакція дозволена: " + canWithdraw);

        System.out.print("\n");

        // TASK 33
        System.out.print("Введіть номер дня тижня (1..7): ");
        int day = scanner.nextInt();
        switch (day)
        {
            case 1:
                System.out.println("Понеділок");
                break;
            case 2:
                System.out.println("Вівторок");
                break;
            case 3:
                System.out.println("Середа");
                break;
            case 4:
                System.out.println("Четвер");
                break;
            case 5:
                System.out.println("П'ятниця");
                break;
            case 6:
                System.out.println("Субота");
                break;
            case 7:
                System.out.println("Неділя");
                break;
            default:
                System.out.println("Некоректний номер дня");
                break;
        }

        System.out.print("\n");

        // TASK 34
        System.out.print("Введіть номер дня для визначення типу (1..7): ");
        day = scanner.nextInt();
        switch (day)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Будній (робочий) день");
                break;
            case 6:
            case 7:
                System.out.println("Вихідний день");
                break;
            default:
                System.out.println("Некоректний номер дня");
                break;
        }

        System.out.print("\n");

        // TASK 35
        System.out.print("Введіть номер місяця (1..12): ");
        int month = scanner.nextInt();
        int days = switch (month)
        {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> 0;
        };
        if (days != 0)
        {
            System.out.println("Кількість днів: " + days);
        }
        else
        {
            System.out.println("Такого місяця не існує!");
        }

        System.out.print("\n");

        // TASK 36
        scanner.nextLine();
        System.out.print("Введіть назву місяця: ");
        String monthName = scanner.nextLine();
        String season = switch (monthName.toLowerCase(Locale.ROOT))
        {
            case "грудень", "січень", "лютий" -> "Зима";
            case "березень", "квітень", "травень" -> "Весна";
            case "червень", "липень", "серпень" -> "Літо";
            case "вересень", "жовтень", "листопад" -> "Осінь";
            default -> "Невідомий місяць";
        };
        System.out.println("Пора року: " + season);

        System.out.print("\n");

        // TASK 37
        System.out.print("Доставка (1 — Самовивіз, 2 — Кур'єр, 3 — Поштомат): ");
        int delivery = scanner.nextInt();
        int deliveryCost = switch (delivery)
        {
            case 1 -> 0;
            case 2 -> {
                System.out.print("Вага товару (кг): ");
                double deliveryWeight = scanner.nextDouble();
                if (deliveryWeight < 0)
                {
                    yield -1;
                }
                yield (deliveryWeight > 5) ? 150 : 90;
            }
            case 3 -> 60;
            default -> -1;
        };
        if (deliveryCost >= 0)
        {
            System.out.println("Вартість доставки: " + deliveryCost + " грн");
        }
        else
        {
            System.out.println("Некоректний вибір або вага!");
        }

        System.out.print("\n");

        // TASK 38
        System.out.print("Число 1: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Оберіть операцію (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        System.out.print("Число 2: ");
        double secondNumber = scanner.nextDouble();
        String calculation = switch (op)
        {
            case '+' -> "Результат: " + (firstNumber + secondNumber);
            case '-' -> "Результат: " + (firstNumber - secondNumber);
            case '*' -> "Результат: " + (firstNumber * secondNumber);
            case '/' -> (secondNumber != 0) ? "Результат: " + firstNumber / secondNumber : "Помилка: ділення на нуль!";
            default -> "Невідома операція!";
        };
        System.out.println(calculation);

        System.out.print("\n");

        // TASK 39
        scanner.nextLine();
        System.out.print("Введіть команду (start, pause, stop, exit): ");
        String command = scanner.nextLine();
        System.out.println("Через ==: " + (command == "start"));
        if (command.equalsIgnoreCase("start"))
        {
            System.out.println("Через equalsIgnoreCase: команда start розпізнана.");
        }
        switch (command.toLowerCase(Locale.ROOT))
        {
            case "start" -> System.out.println("Система успішно запущена!");
            case "pause" -> System.out.println("Систему призупинено.");
            case "stop" -> System.out.println("Систему зупинено.");
            case "exit" -> System.out.println("Вихід із меню команд.");
            default -> System.out.println("Невідома команда!");
        }

        System.out.print("\n");

        // TASK 40
        System.out.println("================ БАНКОМАТ ================");
        System.out.print("Введіть PIN: ");
        int pin = scanner.nextInt();
        if (pin == 1234)
        {
            System.out.println("Авторизація успішна!");
            double balance = 5000.0;
            System.out.println("1: Перевірити баланс");
            System.out.println("2: Поповнити рахунок");
            System.out.println("3: Зняти готівку");
            System.out.println("4: Завершити роботу");
            System.out.print("Оберіть дію: ");
            int action = scanner.nextInt();
            switch (action)
            {
                case 1 -> System.out.println("Баланс: " + balance + " грн");
                case 2 -> {
                    System.out.print("Введіть суму поповнення: ");
                    double amount = scanner.nextDouble();
                    if (amount > 0)
                    {
                        balance += amount;
                        balance = Math.round(balance * 100) / 100.0;
                        System.out.println("Баланс після поповнення: " + balance + " грн");
                    }
                    else
                    {
                        System.out.println("Некоректна сума поповнення!");
                    }
                }
                case 3 -> {
                    System.out.print("Введіть суму зняття: ");
                    double amount = scanner.nextDouble();
                    if (amount > 0 && amount <= balance)
                    {
                        double commission = (amount > 1000) ? amount * 0.01 : 0;
                        commission = Math.round(commission * 100) / 100.0;
                        if (amount + commission <= balance)
                        {
                            balance -= amount + commission;
                            balance = Math.round(balance * 100) / 100.0;
                            System.out.println("Комісія операції: " + commission + " грн");
                            System.out.println("Видано: " + amount + " грн. Залишок на рахунку: " + balance + " грн");
                        }
                        else
                        {
                            System.out.println("Недостатньо коштів з урахуванням комісії!");
                        }
                    }
                    else
                    {
                        System.out.println("Некоректна сума або недостатньо коштів!");
                    }
                }
                case 4 -> System.out.println("Роботу завершено.");
                default -> System.out.println("Невідома операція!");
            }
        }
        else
        {
            System.out.println("Неправильний PIN. Роботу завершено.");
        }
        System.out.println("==========================================");
        scanner.close();
    }
}
