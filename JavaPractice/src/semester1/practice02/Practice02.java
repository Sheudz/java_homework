package semester1.practice02;

public class Practice02 {
    public static void main(String args[])
    {
        // TASK 1
        int age = 18;
        double height = 1.78; // Зріст для прикладу, заміни на свій.
        char firstLetter = 'С';
        boolean isStudent = true;
        System.out.println(age);
        System.out.println(height);
        System.out.println(firstLetter);
        System.out.println(isStudent);

        System.out.print("\n");

        // TASK 2
        byte temperature = -15;
        short currentYear = 2026;
        int cityPopulation = 1200000;
        long worldPopulation = 8100000000L;
        System.out.println(temperature);
        System.out.println(currentYear);
        System.out.println(cityPopulation);
        System.out.println(worldPopulation);

        System.out.print("\n");

        // TASK 3
        float floatValue = 1.1234567f;
        double doubleValue = 1.123456789012345;
        System.out.println(floatValue);
        System.out.println(doubleValue);

        System.out.print("\n");

        // TASK 4
        char symbol1 = 'J';
        char symbol2 = 74;
        char symbol3 = '\u004A';
        System.out.println(symbol1);
        System.out.println(symbol2);
        System.out.println(symbol3);
        // У всіх трьох випадках це одна й та сама літера J.

        System.out.print("\n");

        // TASK 5
        boolean isJavaFun = true;
        boolean isFishFly = false;
        boolean isSkyBlue = true;
        System.out.println(isJavaFun);
        System.out.println(isFishFly);
        System.out.println(isSkyBlue);

        System.out.print("\n");

        // TASK 6
        final double GRAVITY = 9.81;
        final int DAYS_IN_WEEK = 7;
        final String UNIVERSITY_NAME = "Львівська Політехніка";
        System.out.println(GRAVITY);
        System.out.println(DAYS_IN_WEEK);
        System.out.println(UNIVERSITY_NAME);
        // GRAVITY = 10.0;

        System.out.print("\n");

        // TASK 7
        int intVal = 250;
        double doubleVal = intVal;
        System.out.println("int: " + intVal);
        System.out.println("double: " + doubleVal);

        System.out.print("\n");

        // TASK 8
        double priceWithPennies = 49.99;
        int roundedPrice = (int) priceWithPennies;
        System.out.println(roundedPrice);

        System.out.print("\n");

        // TASK 9
        int firstNumber = 5;
        double userWeight = 72.5;
        String userCity = "Kyiv";
        boolean isValidUser = true;
        System.out.println(firstNumber + ", " + userWeight + ", " + userCity + ", " + isValidUser);

        System.out.print("\n");

        // TASK 10
        String firstName = "Тарас";
        String lastName = "Шевченко";
        age = 47;
        System.out.println("Мене звати " + firstName + " " + lastName + ", мені " + age + " років.");

        System.out.print("\n");

        // TASK 11
        int a = 10;
        int b = 20;
        System.out.println("Сума без дужок: " + a + b);
        System.out.println("Сума з дужками: " + (a + b));
        // Без дужок числа по черзі додаються до тексту, виходить 1020
        // З дужками спочатку рахується сума 30, а потім додається до тексту

        System.out.print("\n");

        // TASK 12
        String login = "ivan.petrenko";
        String domain = "gmail.com";
        String role = "student";
        String email = login + "@" + domain;
        System.out.println("Користувач " + login + " (роль: " + role + ") має пошту: " + email);

        System.out.print("\n");

        // TASK 13
        String productName = "Ноутбук";
        int quantity = 2;
        double pricePerUnit = 24500.50;
        System.out.println("ЧЕК:\nТовар: " + productName + "\nКількість: " + quantity + " шт.\nЦіна: " + pricePerUnit + " грн");

        System.out.print("\n");

        // TASK 14
        String currency = "UAH";
        int hryvnias = 1500;
        int kopecks = 75;
        System.out.println("Поточний баланс: " + hryvnias + "." + kopecks + " " + currency);

        System.out.print("\n");

        // TASK 15
        String protocol = "https://";
        String host = "api.example.com";
        String endpoint = "/users";
        int userId = 42;
        String url = protocol + host + endpoint + "/" + userId;
        System.out.println("Запит відправлено на: " + url);

        System.out.print("\n");

        // TASK 16
        String language = "Java";
        int level = 1;
        boolean isReady = true;
        System.out.println("Мова: " + language + " | Рівень: " + level + " | Готовність до практики: " + isReady);

        System.out.print("\n");

        // TASK 17
        int number = 19;
        int remainder = number % 2;
        System.out.println("Число " + number + " при діленні на 2 дає остачу: " + remainder);

        System.out.print("\n");

        // TASK 18
        int totalSeconds = 385;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        System.out.println(totalSeconds + " секунд = " + minutes + " хв " + seconds + " сек");

        System.out.print("\n");

        // TASK 19
        int n = 47;
        int tens = n / 10;
        int units = n % 10;
        int digitSum = tens + units;
        System.out.println("Число: " + n + ". Десятки: " + tens + ", Одиниці: " + units + ". Сума цифр: " + digitSum);

        System.out.print("\n");

        // TASK 20
        int score = 100;
        score += 50;
        System.out.println("Після додавання: " + score);
        score -= 20;
        System.out.println("Після віднімання: " + score);
        score *= 2;
        System.out.println("Після множення: " + score);
        score /= 4;
        System.out.println("Після ділення: " + score);

        System.out.print("\n");

        // TASK 21
        int counter = 5;
        System.out.println(counter++);
        System.out.println(counter);
        // Спочатку виводиться 5, а вже після цього counter збільшується до 6

        System.out.print("\n");

        // TASK 22
        counter = 5;
        System.out.println(++counter);
        // Тут спочатку збільшується counter, тому одразу виводиться 6

        System.out.print("\n");

        // TASK 23
        int grade1 = 4;
        int grade2 = 5;
        int grade3 = 4;
        double averageGrade = (grade1 + grade2 + grade3) / 3.0;
        System.out.println("Середній бал: " + averageGrade);

        System.out.print("\n");

        // TASK 24
        double celsius = 25.0;
        double fahrenheit = celsius * 1.8 + 32;
        double kelvin = celsius + 273.15;
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
        System.out.println(celsius + "°C = " + kelvin + " K");

        System.out.print("\n");

        // TASK 25
        int userAge = 17;
        boolean isAdult = userAge >= 18;
        System.out.println("Вік: " + userAge + ". Чи є повнолітнім: " + isAdult);

        System.out.print("\n");

        // TASK 26
        int x = 15;
        int y = 20;
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));

        System.out.print("\n");

        // TASK 27
        int speed = 75;
        boolean isSafeSpeed = (speed >= 20) && (speed <= 80);
        System.out.println(isSafeSpeed);

        System.out.print("\n");

        // TASK 28
        int personAge = 70;
        boolean hasFreePass = (personAge < 7) || (personAge >= 65);
        System.out.println("Вік: " + personAge + ". Право на безкоштовний проїзд: " + hasFreePass);

        System.out.print("\n");

        // TASK 29
        boolean isDoorLocked = true;
        boolean canEnter = !isDoorLocked;
        System.out.println("Двері зачинені: " + isDoorLocked);
        System.out.println("Чи можна увійти: " + canEnter);

        System.out.print("\n");

        // TASK 30
        number = 30;
        boolean isDivisibleByBoth = (number % 3 == 0) && (number % 5 == 0);
        System.out.println("Число " + number + " кратне 3 і 5: " + isDivisibleByBoth);
        number = 25;
        isDivisibleByBoth = (number % 3 == 0) && (number % 5 == 0);
        System.out.println("Число " + number + " кратне 3 і 5: " + isDivisibleByBoth);

        System.out.print("\n");

        // TASK 31
        boolean hasPassword = true;
        boolean hasSmsCode = true;
        boolean isAccountBlocked = false;
        boolean canLogin = hasPassword && hasSmsCode && !isAccountBlocked;
        System.out.println("Доступ до системи: " + canLogin);

        System.out.print("\n");

        // TASK 32
        int year = 2024;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println("Рік " + year + " високосний: " + isLeapYear);

        System.out.print("\n");

        // TASK 33
        double legA = 3.0;
        double legB = 4.0;
        double hypotenuse = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
        System.out.println("Катети: " + legA + " та " + legB + ". Гіпотенуза: " + hypotenuse);

        System.out.print("\n");

        // TASK 34
        double radius = 5.0;
        double circumference = 2 * Math.PI * radius;
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("Радіус: " + radius);
        System.out.println("Довжина кола: " + circumference);
        System.out.println("Площа круга: " + circleArea);

        System.out.print("\n");

        // TASK 35
        double dayTemp = 18.5;
        double nightTemp = -3.2;
        double tempDifference = Math.abs(dayTemp - nightTemp);
        double maxTemp = Math.max(dayTemp, nightTemp);
        double minTemp = Math.min(dayTemp, nightTemp);
        System.out.println("Перепад температури: " + tempDifference);
        System.out.println("Максимальна температура: " + maxTemp);
        System.out.println("Мінімальна температура: " + minTemp);

        System.out.print("\n");

        // TASK 36
        double num = 5.67;
        System.out.println("Число: " + num);
        System.out.println("round: " + Math.round(num));
        System.out.println("ceil: " + Math.ceil(num));
        System.out.println("floor: " + Math.floor(num));
        double negNum = -5.67;
        System.out.println("Число: " + negNum);
        System.out.println("round: " + Math.round(negNum));
        System.out.println("ceil: " + Math.ceil(negNum));
        System.out.println("floor: " + Math.floor(negNum));
        // Для від'ємного числа ceil дає -5.0, а floor дає -6.0

        System.out.print("\n");

        // TASK 37
        double coefficientA = 1.0;
        double coefficientB = -7.0;
        double coefficientC = 10.0;
        double discriminant = Math.pow(coefficientB, 2) - 4 * coefficientA * coefficientC;
        double x1 = (-coefficientB + Math.sqrt(discriminant)) / (2 * coefficientA);
        double x2 = (-coefficientB - Math.sqrt(discriminant)) / (2 * coefficientA);
        System.out.println("Дискримінант D = " + discriminant);
        System.out.println("Корінь x1 = " + x1);
        System.out.println("Корінь x2 = " + x2);

        System.out.print("\n");

        // TASK 38
        int dice = (int) (Math.random() * 6) + 1;
        System.out.println("Випало на кубику: " + dice);

        System.out.print("\n");

        // TASK 39
        int min = -10;
        int max = 35;
        int randomTemp = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("Погода на завтра: " + randomTemp + "°C");

        System.out.print("\n");

        // TASK 40
        double initialAmount = 10000.0;
        double interestRate = 12.0;
        int years = 3;
        double finalAmount = initialAmount * Math.pow(1 + interestRate / 100, years);
        double profit = finalAmount - initialAmount;
        finalAmount = Math.round(finalAmount * 100) / 100.0;
        profit = Math.round(profit * 100) / 100.0;
        System.out.println("+------------------------------------+");
        System.out.println("|      ДЕПОЗИТНИЙ КАЛЬКУЛЯТОР         |");
        System.out.println("+------------------------------------+");
        System.out.println("Початкова сума: " + initialAmount + " грн");
        System.out.println("Термін: " + years + " роки під " + interestRate + "% річних");
        System.out.println("Підсумкова сума: " + finalAmount + " грн");
        System.out.println("Чистий прибуток: " + profit + " грн");
        System.out.println("+------------------------------------+");
    }
}
