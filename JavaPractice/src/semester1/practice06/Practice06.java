package semester1.practice06;

import java.util.Locale;

public class Practice06 {
    public static void main(String args[])
    {
        // TASK 1
        Student s1 = new Student();
        s1.name = "Денис";
        s1.age = 19;
        s1.gpa = 4.75;
        System.out.println(s1.name + ", " + s1.age + ", " + s1.gpa);

        System.out.print("\n");

        // TASK 2
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2021;
        car1.speed = 180;
        Car car2 = new Car();
        car2.brand = "BMW";
        car2.model = "M5";
        car2.year = 2023;
        car2.speed = 250;
        System.out.println(car1.brand + " " + car1.model + " Рік: " + car1.year + " Швидкість: " + car1.speed);
        System.out.println(car2.brand + " " + car2.model + " Рік: " + car2.year + " Швидкість: " + car2.speed);
        if (car1.year > car2.year)
        {
            System.out.println(car1.brand + " новіший");
        }
        else if (car1.year < car2.year)
        {
            System.out.println(car2.brand + " новіший");
        }
        else
        {
            System.out.println("Автомобілі одного року випуску");
        }

        System.out.print("\n");

        // TASK 3
        Book emptyBook = new Book();
        System.out.println(emptyBook.title + ", " + emptyBook.author + ", " + emptyBook.pages + ", " + emptyBook.isRead);

        System.out.print("\n");

        // TASK 4
        Rectangle rectangle = new Rectangle();
        rectangle.width = 7.5;
        rectangle.height = 4.0;
        double area = rectangle.width * rectangle.height;
        double perimeter = 2 * (rectangle.width + rectangle.height);
        System.out.println("Площа: " + area + " Периметр: " + perimeter);

        System.out.print("\n");

        // TASK 5
        Product product = new Product();
        product.name = "Монітор";
        product.price = 6500.0;
        product.quantity = 8;
        System.out.println(product.name + " Вартість партії: " + product.price * product.quantity + " грн");

        System.out.print("\n");

        // TASK 6
        Smartphone phone = new Smartphone();
        phone.model = "Samsung Galaxy";
        phone.batteryLevel = 100;
        phone.isTurnedOn = true;
        phone.batteryLevel -= 35;
        if (phone.batteryLevel <= 0)
        {
            phone.batteryLevel = 0;
            phone.isTurnedOn = false;
        }
        System.out.println(phone.model + " Заряд: " + phone.batteryLevel + "% Увімкнений: " + phone.isTurnedOn);

        System.out.print("\n");

        // TASK 7
        Point2D pointA = new Point2D();
        pointA.x = 0;
        pointA.y = 0;
        Point2D pointB = new Point2D();
        pointB.x = 3;
        pointB.y = 4;
        double distance = Math.sqrt(Math.pow(pointB.x - pointA.x, 2) + Math.pow(pointB.y - pointA.y, 2));
        System.out.println("Відстань: " + distance);

        System.out.print("\n");

        // TASK 8
        Student first = new Student();
        first.name = "Іван";
        Student second = first;
        second.name = "Петро";
        System.out.println(first.name);
        System.out.println("first і second посилаються на один об'єкт, тому ім'я змінилося в обох");

        System.out.print("\n");

        // TASK 9
        Greeter greeter = new Greeter();
        greeter.sayHello();
        greeter.sayHelloTo("Станіслав");

        System.out.print("\n");

        // TASK 10
        Animal cat = new Animal();
        cat.species = "Кіт";
        cat.name = "Мурчик";
        cat.printInfo();
        cat.makeSound();
        Animal dog = new Animal();
        dog.species = "Собака";
        dog.name = "Рекс";
        dog.printInfo();
        dog.makeSound();

        System.out.print("\n");

        // TASK 11
        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.decrement();
        counter.printCount();
        counter.reset();
        counter.printCount();

        System.out.print("\n");

        // TASK 12
        TrafficLight light = new TrafficLight();
        light.changeColor("Червоний");
        light.showSignal();
        light.changeColor("Жовтий");
        light.showSignal();
        light.changeColor("Зелений");
        light.showSignal();

        System.out.print("\n");

        // TASK 13
        Player player = new Player();
        player.nickname = "Player1";
        player.takeDamage(35);
        System.out.println("Після шкоди HP: " + player.health);
        player.heal(20);
        System.out.println("Після лікування HP: " + player.health);
        player.heal(100);
        System.out.println("Максимальне HP: " + player.health);
        player.takeDamage(150);
        System.out.println("Після смертельного удару HP: " + player.health);

        System.out.print("\n");

        // TASK 14
        Lamp lamp = new Lamp();
        lamp.status();
        lamp.toggle();
        lamp.status();
        lamp.toggle();
        lamp.status();
        lamp.turnOn();
        lamp.status();
        lamp.turnOff();
        lamp.status();

        System.out.print("\n");

        // TASK 15
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.addSeconds(124);
        stopwatch.tick();
        stopwatch.displayTime();

        System.out.print("\n");

        // TASK 16
        Printer printer = new Printer();
        printer.model = "HP LaserJet";
        printer.paperCount = 10;
        printer.printDocument("Практична робота", 6);
        System.out.println("Залишилось паперу: " + printer.paperCount);
        printer.printDocument("Звіт", 8);
        System.out.println("Після відмови паперу: " + printer.paperCount);

        System.out.print("\n");

        // TASK 17
        SimpleCalculator calculator = new SimpleCalculator();
        int sum = calculator.add(10, 3);
        int difference = calculator.subtract(10, 3);
        int multiplication = calculator.multiply(10, 3);
        double division = calculator.divide(10, 3);
        System.out.println("Сума: " + sum + " Різниця: " + difference + " Добуток: " + multiplication + " Частка: " + division);
        double invalidDivision = calculator.divide(10, 0);
        System.out.println("Ділення на нуль: " + invalidDivision);

        System.out.print("\n");

        // TASK 18
        Circle circle = new Circle();
        circle.radius = 5.0;
        System.out.println("Площа круга: " + circle.getArea());
        System.out.println("Довжина кола: " + circle.getCircumference());

        System.out.print("\n");

        // TASK 19
        TemperatureConverter converter = new TemperatureConverter();
        double fahrenheit = converter.celsiusToFahrenheit(25);
        double celsius = converter.fahrenheitToCelsius(fahrenheit);
        System.out.println("25°C = " + fahrenheit + "°F");
        System.out.println(fahrenheit + "°F = " + celsius + "°C");

        System.out.print("\n");

        // TASK 20
        NumberChecker checker = new NumberChecker();
        int[] numbers = {7, 12, -5};
        for (int number : numbers)
        {
            System.out.println(number + " Парне: " + checker.isEven(number) + " Додатне: " + checker.isPositive(number) + " Просте: " + checker.isPrime(number));
        }

        System.out.print("\n");

        // TASK 21
        CurrencyExchange exchange = new CurrencyExchange();
        exchange.usdRate = 41.5;
        System.out.printf(Locale.US, "10000 грн = %.2f USD%n", exchange.toUSD(10000));
        System.out.println("100 USD = " + exchange.toUAH(100) + " грн");

        System.out.print("\n");

        // TASK 22
        Employee employee = new Employee();
        employee.name = "Станіслав";
        employee.baseSalary = 30000;
        employee.bonusPercentage = 15;
        System.out.printf(Locale.US, "%s Зарплата з бонусом: %.2f грн%n", employee.name, employee.calculateTotalSalary());
        System.out.printf(Locale.US, "Податок: %.2f грн%n", employee.calculateTax());

        System.out.print("\n");

        // TASK 23
        TextFormatter formatter = new TextFormatter();
        System.out.println(formatter.formatTitle("Привіт Java"));
        System.out.println("Голосних: " + formatter.countVowels("Привіт Java"));

        System.out.print("\n");

        // TASK 24
        Triangle triangle = new Triangle();
        triangle.a = 3;
        triangle.b = 4;
        triangle.c = 5;
        System.out.println("Трикутник існує: " + triangle.isValid());
        System.out.println("Периметр: " + triangle.getPerimeter() + " Площа: " + triangle.getArea());

        System.out.print("\n");

        // TASK 25
        SecretVault vault = new SecretVault();
        System.out.println("vault.secretCode = \"hacked\" - помилка has private access, поле недоступне поза класом");
        System.out.println("Правильний код: " + vault.verifyCode("Pass123"));
        System.out.println("Неправильний код: " + vault.verifyCode("hacked"));

        System.out.print("\n");

        // TASK 26
        UserAccount account = new UserAccount();
        account.setCredentials("stas", "Pass123");
        System.out.println("Вхід: " + account.login("stas", "Pass123"));
        System.out.println("Невірний пароль: " + account.login("stas", "wrong"));
        account.changePassword("wrong", "NewPass");
        account.changePassword("Pass123", "NewPass");
        System.out.println("Вхід зі старим паролем: " + account.login("stas", "Pass123"));
        System.out.println("Вхід з новим паролем: " + account.login("stas", "NewPass"));

        System.out.print("\n");

        // TASK 27
        BankAccount bank = new BankAccount();
        bank.setAccountNumber("UA001");
        bank.deposit(1000);
        System.out.println("Зняти 1500: " + bank.withdraw(1500));
        System.out.println("Баланс: " + bank.getBalance());
        System.out.println("Зняти 300: " + bank.withdraw(300));
        System.out.println("Баланс: " + bank.getBalance());

        System.out.print("\n");

        // TASK 28
        Thermometer thermometer = new Thermometer();
        thermometer.setTemperature(25);
        System.out.println("Температура: " + thermometer.getTemperature());
        thermometer.setTemperature(-300);
        System.out.println("Після помилки: " + thermometer.getTemperature());

        System.out.print("\n");

        // TASK 29
        CarSpeedometer speedometer = new CarSpeedometer();
        speedometer.accelerate(100);
        System.out.println("Швидкість: " + speedometer.getSpeed());
        speedometer.accelerate(200);
        System.out.println("Після розгону: " + speedometer.getSpeed());
        speedometer.brake(300);
        System.out.println("Після гальмування: " + speedometer.getSpeed());

        System.out.print("\n");

        // TASK 30
        Person person1 = new Person();
        person1.setName("Станіслав");
        person1.setAge(18);
        person1.printSummary();
        Person person2 = new Person();
        person2.setName("Андрій");
        person2.setAge(25);
        person2.setAge(150);
        person2.printSummary();

        System.out.print("\n");

        // TASK 31
        DiscountCard card = new DiscountCard();
        card.setOwnerName("Станіслав");
        card.addPurchase(3000);
        card.printCardInfo();
        card.addPurchase(4000);
        card.printCardInfo();
        card.addPurchase(3000);
        card.printCardInfo();

        System.out.print("\n");

        // TASK 32
        SmartDoorLock lock = new SmartDoorLock();
        lock.enterPin(1111);
        lock.enterPin(2222);
        lock.enterPin(3333);
        lock.enterPin(1234);

        System.out.print("\n");

        // TASK 33
        GradeBook gradeBook = new GradeBook();
        gradeBook.setData("Станіслав", new int[]{85, 92, 78, 96, 65});
        System.out.println("Середній бал: " + gradeBook.getAverage());
        System.out.println("Найвища оцінка: " + gradeBook.getHighestGrade());
        System.out.println("Найнижча оцінка: " + gradeBook.getLowestGrade());

        System.out.print("\n");

        // TASK 34
        ArrayStats stats = new ArrayStats();
        stats.setNumbers(new int[]{1, -2, 3, 4, -5, 6, 7, 8, 9, 0});
        System.out.println("Парних: " + stats.countEvens());
        System.out.println("Непарних: " + stats.countOdds());
        System.out.println("Сума: " + stats.calculateSum());

        System.out.print("\n");

        // TASK 35
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(100);
        cart.addItem(250);
        cart.addItem(50);
        cart.printReceipt();
        cart.applyDiscount(15);
        cart.printReceipt();

        System.out.print("\n");

        // TASK 36
        TemperatureTracker tracker = new TemperatureTracker();
        tracker.setTemps(new double[]{18, 21, 15, 24, 13, 27, 20});
        tracker.printWeeklyReport();
        System.out.println("Днів вище 20°C: " + tracker.countDaysAbove(20));

        System.out.print("\n");

        // TASK 37
        ArraySearcher searcher = new ArraySearcher();
        searcher.setData(new int[]{5, 10, 15, 10, 20});
        System.out.println("Є 10: " + searcher.contains(10) + " Індекс: " + searcher.findIndex(10));
        System.out.println("Є 99: " + searcher.contains(99) + " Індекс: " + searcher.findIndex(99));

        System.out.print("\n");

        // TASK 38
        Vector3D vector = new Vector3D();
        vector.setCoords(2, 3, 6);
        System.out.println("Довжина: " + vector.getMagnitude());
        vector.multiplyByScalar(2);
        vector.printVector();

        System.out.print("\n");

        // TASK 39
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Matrix2D matrix = new Matrix2D();
        matrix.setGrid(grid);
        matrix.printMatrix();
        System.out.println("Загальна сума: " + matrix.getTotalSum());
        System.out.println("Сума рядка 1: " + matrix.getRowSum(1));

        System.out.print("\n");

        // TASK 40
        MatrixDiagonals diagonals = new MatrixDiagonals();
        diagonals.setMatrix(grid);
        System.out.println("Головна діагональ: " + diagonals.getMainDiagonalSum());
        System.out.println("Побічна діагональ: " + diagonals.getAntiDiagonalSum());
        System.out.println("Суми рівні: " + diagonals.isDiagonalSymmetric());
    }
}
