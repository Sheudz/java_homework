package semester1.practice07;

public class Practice07 {
    public static void main(String args[])
    {
        // TASK 1
        Book book1 = new Book();
        Book book2 = new Book("451 градус за Фаренгейтом", "Рей Бредбері", 1953, 20.0);
        book1.printInfo();
        book2.printInfo();

        System.out.print("\n");

        // TASK 2
        Student student1 = new Student("Андрій", 19, 4.5);
        Student student2 = new Student("Олексій", 13, 5.6);
        System.out.println(student1.isHonorStudent() ? "Відмінник" : "Звичайний студент");
        student2.printStudent();

        System.out.print("\n");

        //TASK 3
        BankAccount user1 = new BankAccount("N7381", "Анатолій", 50.0);
        user1.deposit(50.0);
        user1.withdraw(120.0);
        user1.printAccount();

        System.out.print("\n");

        //TASK 4
        Point2D point1 = new Point2D(3, 4);      // (3.0; 4.0)
        Point2D point2 = new Point2D(-2, 2);     // (-2.0; 2.0)

        point1.printPoint();
        point2.printPoint();

        System.out.println("точка 1 -> 0.0: " + point1.distanceToOrigin());       // 5.0
        System.out.println("точка 1 -> точка 2: " + point1.distanceTo(-2, 2));      // ~5.3852

        System.out.print("\n");

        //TASK 5
        Product product = new Product("Навушники", 1000, 5, "Техніка");
        product.printProduct();
        System.out.println("Вартість партії: " + product.getTotalValue());
        product.applyDiscount(20);
        product.printProduct();
        System.out.println("Після знижки: " + product.getTotalValue());

        System.out.print("\n");

        //TASK 6
        Time time = new Time(23, 59, 59);
        System.out.println(time.toUniversalString());
        System.out.println(time.toStandardString());
        time.tick();
        System.out.println(time.toUniversalString());
        System.out.println(time.toStandardString());
        System.out.println(new Time(30, -1, 65).toUniversalString());

        System.out.print("\n");

        //TASK 7
        Rectangle rectangle = new Rectangle(3, 5);
        Rectangle square = new Rectangle(4);
        Rectangle unit = new Rectangle();
        System.out.println("Прямокутник: " + rectangle.getArea() + " Периметр: " + rectangle.getPerimeter());
        System.out.println("Квадрат: " + square.getArea() + " Периметр: " + square.getPerimeter());
        System.out.println("Це квадрат: " + square.isSquare());
        System.out.println("Одиничний: " + unit.getArea());

        System.out.print("\n");

        //TASK 8
        Employee employee = new Employee(1, "Андрій Петренко", "Менеджер", 20000);
        employee.printBadge();
        employee.raiseSalary(15);
        employee.printBadge();
        System.out.println("Річна зарплата: " + employee.getAnnualSalary());

        System.out.print("\n");

        //TASK 9
        new User("admin", "admin@mail.com", "ADMIN", false).printProfile();
        new User("andrii", "andrii@mail.com").printProfile();
        new User("oleksii").printProfile();
        new User().printProfile();

        System.out.print("\n");

        //TASK 10
        Fraction fraction = new Fraction(6, -8);
        fraction.print();
        System.out.println(fraction.toDouble());
        new Fraction(5).print();
        new Fraction().print();
        new Fraction(2, 0).print();

        System.out.print("\n");

        //TASK 11
        Car car = new Car("Toyota", "Corolla", 2024);
        car.drive(150);
        car.startEngine();
        car.drive(150);
        car.stopEngine();

        System.out.print("\n");

        //TASK 12
        new SmartBulb(80, 3000, false).printStatus();
        new SmartBulb(75).printStatus();
        new SmartBulb().printStatus();
        new SmartBulb(150, 1000, true).printStatus();

        System.out.print("\n");

        //TASK 13
        String sql = new QueryBuilder("users").select("id, name, email").where("age >= 18").build();
        System.out.println(sql);
        System.out.println(new QueryBuilder("books").build());

        System.out.print("\n");

        //TASK 14
        new CoffeeOrder("Лате", "Large", 2, true).printReceipt();
        new CoffeeOrder("Капучино", "Small").printReceipt();
        new CoffeeOrder("Еспресо").printReceipt();

        System.out.print("\n");

        //TASK 15
        Box box = new Box(3, "Картон");
        Box copy = new Box(box);
        box.printBox();
        copy.printBox();
        System.out.println("Об'єми: " + box.getVolume() + " і " + copy.getVolume());
        System.out.println("Площа поверхні: " + box.getSurfaceArea());

        System.out.print("\n");

        //TASK 16
        FlightTicket ticket = new FlightTicket("T123", "Андрій", "FL101", "Варшава", "Лондон");
        ticket.assignSeat("12A");
        ticket.printBoardingPass();

        System.out.print("\n");

        //TASK 17
        MathOperations math = new MathOperations();
        System.out.println(math.add(2, 3));
        System.out.println(math.add(2.5, 3.5));
        System.out.println(math.add(1, 2, 3));
        System.out.println(math.add("Привіт", "світ"));
        System.out.println(math.multiply(3, 4));
        System.out.println(math.multiply(2.5, 4.0));
        System.out.println(math.multiply("Java ", 3));

        System.out.print("\n");

        //TASK 18
        DocumentPrinter printer = new DocumentPrinter();
        printer.print("Привіт");
        printer.print(123);
        printer.print(3.14159, 2);
        printer.print(new String[]{"Перший рядок", "Другий рядок"});
        printer.print("java", true);

        System.out.print("\n");

        //TASK 19
        AreaCalculator area = new AreaCalculator();
        System.out.println("Квадрат: " + area.calculateArea(4));
        System.out.println("Коло: " + area.calculateArea(3, true));
        System.out.println("Прямокутник: " + area.calculateArea(3, 5));
        System.out.println("Трикутник: " + area.calculateArea(3, 4, 5));
        System.out.println("Трапеція: " + area.calculateTrapezoidArea(4, 6, 3));

        System.out.print("\n");

        //TASK 20
        Logger logger = new Logger();
        logger.log("Програму запущено");
        logger.log("WARN", "Мало пам'яті");
        logger.log("ERROR", 404, "Не знайдено");
        logger.log("TEST", "Перевірка часу", true);

        System.out.print("\n");

        //TASK 21
        ArraySearcher searcher = new ArraySearcher();
        int[] numbers = {1, 5, 3, 5, 8};
        String[] words = {"Java", "Book", "Car"};
        System.out.println(searcher.find(numbers, 5));
        System.out.println(searcher.find(numbers, 5, 2));
        System.out.println(searcher.find(words, "Book"));
        System.out.println(searcher.find(words, "java", true));
        System.out.println(searcher.find(words, "java", false));

        System.out.print("\n");

        //TASK 22
        DateService date = new DateService(15, 3, 2024);
        date.printDate();
        date.add(20);
        date.printDate();
        date.add(0, 3);
        date.printDate();
        date.add(0, 0, 1);
        date.printDate();

        System.out.print("\n");

        //TASK 23
        SalaryCalculator salary = new SalaryCalculator();
        System.out.println(salary.calculate(20000));
        System.out.println(salary.calculate(20000, 3000));
        System.out.println(salary.calculate(20000, 15, true));
        System.out.println(salary.calculate(20000, 10, 200));

        System.out.print("\n");

        //TASK 24
        ArrayFilter filter = new ArrayFilter();
        int[] arr = {12, 5, 8, 19, 24, 3, 16};
        System.out.println(java.util.Arrays.toString(filter.filter(arr, 10)));
        System.out.println(java.util.Arrays.toString(filter.filter(arr, 5, 19)));
        System.out.println(java.util.Arrays.toString(filter.filter(arr, true)));
        System.out.println(java.util.Arrays.toString(filter.filter(arr, false)));

        System.out.print("\n");

        //TASK 25
        UserAccount account1 = new UserAccount("andrii", "a@mail.com");
        UserAccount account2 = new UserAccount("oleksii", "o@mail.com");
        UserAccount account3 = new UserAccount("ivan", "i@mail.com");
        System.out.println(account1.getId() + " " + account2.getId() + " " + account3.getId());
        System.out.println("Наступний ID: " + UserAccount.getNextAvailableId());
        UserAccount.resetIdSequence(2001);
        System.out.println("Після скидання: " + UserAccount.getNextAvailableId());

        System.out.print("\n");

        //TASK 26
        for (int i = 1; i <= 6; i++)
        {
            System.out.println("Підключення " + i + ": " + ServerConfig.connect());
        }
        ServerConfig.printServerStatus();
        ServerConfig.disconnect();
        ServerConfig.printServerStatus();

        System.out.print("\n");

        //TASK 27
        System.out.println("5! = " + MathUtils.factorial(5));
        System.out.println("2^-3 = " + MathUtils.power(2, -3));
        System.out.println("НСД: " + MathUtils.gcd(24, 18));
        System.out.println("Обмеження: " + MathUtils.clamp(15, 0, 10));

        System.out.print("\n");

        //TASK 28
        System.out.println("4150 грн в USD: " + CurrencyExchange.uahToUsd(4150));
        System.out.println("100 USD в грн: " + CurrencyExchange.usdToUah(100));
        System.out.println("100 EUR в грн: " + CurrencyExchange.eurToUah(100));
        CurrencyExchange.updateRates(42, 46);
        System.out.println("Новий курс, 100 USD: " + CurrencyExchange.usdToUah(100));

        System.out.print("\n");

        //TASK 29
        FleetCar fleet1 = new FleetCar("VIN1", 1000);
        FleetCar fleet2 = new FleetCar("VIN2", 2000);
        FleetCar fleet3 = new FleetCar("VIN3", 3000);
        fleet1.addTrip(100);
        fleet2.addTrip(200);
        fleet3.addTrip(300);
        FleetCar.printFleetSummary();

        System.out.print("\n");

        //TASK 30
        System.out.println(StringUtils.isPalindrome("А роза упала на лапу Азора"));
        System.out.println(StringUtils.reverse("Java"));
        System.out.println(StringUtils.countVowels("Привіт Java"));
        System.out.println(StringUtils.maskCardNumber("1234 5678 9012 1234"));

        System.out.print("\n");

        //TASK 31
        GameSession session1 = GameSession.createSession("Андрій");
        GameSession session2 = GameSession.createSession("Олексій");
        GameSession session3 = GameSession.createSession("Іван");
        GameSession session4 = GameSession.createSession("Марія");
        System.out.println("Четверта сесія null: " + (session4 == null));
        if (session1 != null)
        {
            session1.terminate();
        }
        session4 = GameSession.createSession("Марія");
        System.out.println("Після звільнення місця: " + (session4 != null));

        System.out.print("\n");

        //TASK 32
        System.out.println("Енергія 1 грама: " + PhysicsEngine.restEnergy(0.001));
        System.out.println("Падіння за 5 секунд: " + PhysicsEngine.freeFallDistance(5));
        System.out.println("Кінетична енергія: " + PhysicsEngine.kineticEnergy(2, 10));

        System.out.print("\n");

        //TASK 33
        LineSegment segment = new LineSegment(0, 0, 3, 4);
        segment.printSegment();
        System.out.println("Довжина: " + segment.getLength());
        Point middle = segment.getMidPoint();
        System.out.println("Середина: (" + middle.getX() + "; " + middle.getY() + ")");

        System.out.print("\n");

        //TASK 34
        ClientAccount ivan = new ClientAccount("UA001", "Іван", 10000);
        ClientAccount maria = new ClientAccount("UA002", "Марія", 2000);
        System.out.println("Переказ: " + ivan.transferTo(maria, 3500));
        ivan.printAccount();
        maria.printAccount();

        System.out.print("\n");

        //TASK 35
        Engine engine = new Engine("ENG123", 150);
        CarWithEngine carWithEngine = new CarWithEngine("Volkswagen", "Golf", engine);
        carWithEngine.printSpecs();
        carWithEngine.startCar();
        System.out.println("Двигун працює: " + engine.isRunning());
        carWithEngine.turnOff();
        System.out.println("Після вимкнення: " + engine.isRunning());

        System.out.print("\n");

        //TASK 36
        Processor cpu = new Processor("Ryzen 5 5600", 3.5, 4500);
        Memory ram = new Memory(16, 3200, 1500);
        Computer computer = new Computer("Мій ПК", cpu, ram, 2000);
        computer.printSpecs();
        computer.upgradeMemory(new Memory(32, 3600, 3000));
        computer.printSpecs();

        System.out.print("\n");

        //TASK 37
        Hero knight = new Hero("Лицар", 100, 25, 10);
        Hero orc = new Hero("Орк", 120, 22, 5);
        while (knight.isAlive() && orc.isAlive())
        {
            knight.attack(orc);
            if (orc.isAlive())
            {
                orc.attack(knight);
            }
        }
        System.out.println("Переможець: " + (knight.isAlive() ? "Лицар" : "Орк"));

        System.out.print("\n");

        //TASK 38
        Product mouse = new Product(1, "Мишка", 500);
        Product keyboard = new Product(2, "Клавіатура", 1000);
        Order order1 = new Order(new Customer("Андрій", 2000), 5);
        order1.addProduct(mouse);
        order1.addProduct(keyboard);
        System.out.println(order1.checkout());
        Order order2 = new Order(new Customer("Олексій", 100), 5);
        order2.addProduct(mouse);
        order2.addProduct(keyboard);
        System.out.println(order2.checkout());

        System.out.print("\n");

        //TASK 39
        Vector3D vector1 = new Vector3D(1, 0, 0);
        Vector3D vector2 = new Vector3D(0, 1, 0);
        vector1.add(vector2).printVector();
        System.out.println("Скалярний добуток: " + vector1.dotProduct(vector2));
        vector1.crossProduct(vector2).printVector();
        System.out.println("Перпендикулярні: " + vector1.isOrthogonalTo(vector2));
        System.out.println("Рівні: " + vector1.isEqualTo(new Vector3D(1, 0, 0)));
        new Vector3D().printVector();

        System.out.print("\n");

        //TASK 40
        LibraryCatalog catalog = new LibraryCatalog(5);
        catalog.addBook(new BookItem("978-617-548-100-1", "Кобзар", "Тарас Шевченко"));
        catalog.addBook(new BookItem("978-617-548-100-2", "Лісова пісня", "Леся Українка"));
        catalog.addBook(new BookItem("978-617-548-100-3", "Тигролови", "Іван Багряний"));
        BookItem kobzar = catalog.findBookByTitle("Кобзар");
        catalog.printCatalog();
        System.out.println(catalog.borrowBook("Кобзар"));
        kobzar.printBook();
        System.out.println(catalog.borrowBook("Кобзар"));
        catalog.printCatalog();
    }
}
