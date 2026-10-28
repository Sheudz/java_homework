package semester1.practice08;

public class Practice08 {
    public static void main(String args[])
    {
        // TASK 1
        Student student = new Student("Станіслав", 1, 90);
        System.out.println(student);
        student.setCourse(10);
        student.setGpa(-5);
        System.out.println(student);

        System.out.print("\n");

        // TASK 2
        Product monitor = new Product("A-101", "Монітор", 6499.50, 4);
        Product keyboard = new Product("A-102", "Клавіатура", 1200, 3);
        System.out.println(monitor);
        System.out.println(keyboard);
        keyboard.setPrice(-100);
        keyboard.setStock(-1);
        System.out.println(keyboard);

        System.out.print("\n");

        // TASK 3
        Circle circle = new Circle(-5);
        System.out.println(circle);
        circle.setRadius(-2);
        System.out.println(circle);
        circle.setRadius(5);
        System.out.println(circle);

        System.out.print("\n");

        // TASK 4
        CardWallet wallet = new CardWallet("1234567890124589", "1234", 12500);
        System.out.println(wallet);
        System.out.println("Невірний старий PIN: " + wallet.changePin("1111", "5678"));
        System.out.println("Зміна PIN: " + wallet.changePin("1234", "5678"));
        System.out.println(wallet);

        System.out.print("\n");

        // TASK 5
        SensorNode sensor = new SensorNode("S-1", 0.5, 20);
        System.out.println(sensor);
        sensor.calibrationOffset = 1.5;
        System.out.println(sensor);
        System.out.println("ID: " + sensor.getSensorId());

        System.out.print("\n");

        // TASK 6
        double[] temps = {12, 15, 18, 19};
        WeatherDay weather = new WeatherDay("28.10.2026", temps);
        temps[0] = -100;
        System.out.println(weather);
        System.out.println("Мінімум: " + weather.getMinTemp() + " Максимум: " + weather.getMaxTemp());

        System.out.print("\n");

        // TASK 7
        IntRange range = new IntRange(10, 2);
        System.out.println(range);
        System.out.println("Містить 5: " + range.contains(5));
        range.setBounds(20, -5);
        System.out.println(range);

        System.out.print("\n");

        // TASK 8
        InvoiceItem item = new InvoiceItem("Навушники", 2, 1000, 10);
        System.out.println("Позиція чека: " + item);

        System.out.print("\n");

        // TASK 9
        Employee employee = new Employee("Андрій", 20000);
        Developer developer = new Developer("Станіслав", 30000, "Java");
        System.out.println(employee);
        System.out.println(developer);

        System.out.print("\n");

        // TASK 10
        Dog dog = new Dog("Рекс", 3, 15, "Вівчарка");
        Cat cat = new Cat("Мурчик", 2, 4, true);
        System.out.println(dog);
        System.out.println(dog.fetchStick());
        System.out.println(cat);
        System.out.println(cat.purr());

        System.out.print("\n");

        // TASK 11
        PassengerCar car = new PassengerCar("Toyota", 200, 60, 5);
        CargoTruck truck = new CargoTruck("Volvo", 120, 400, 20);
        System.out.println(car);
        System.out.println(truck);
        System.out.println("Для прикладу кожна тонна додає 5% до базової витрати");
        System.out.println("Витрата з повним вантажем: " + truck.getFullLoadConsumption(25) + " л/100 км");

        System.out.print("\n");

        // TASK 12
        Rectangle rectangle = new Rectangle(3, 4);
        Box3D box = new Box3D(3, 4, 5);
        System.out.println(rectangle);
        System.out.println(box);

        System.out.print("\n");

        // TASK 13
        UniversityStudent universityStudent = new UniversityStudent("Станіслав Затишняк", 2008, "ST001", "Комп'ютерні науки", 2000);
        Professor professor = new Professor("Іван Петренко", 1980, "Професор", 45);
        System.out.println(universityStudent);
        System.out.println("Вік студента: " + universityStudent.getAge(2026));
        System.out.println(professor);
        System.out.println("Вік професора: " + professor.getAge(2026));

        System.out.print("\n");

        // TASK 14
        System.out.println(new Smartphone("Samsung", 25000, 256, true));
        System.out.println(new Smartphone("Xiaomi", 15000, 128));
        System.out.println(new Smartphone("Motorola"));

        System.out.print("\n");

        // TASK 15
        System.out.println(new PrintedBook("Кобзар", "Тарас Шевченко", 1840, 300, "Тверда"));
        System.out.println(new AudioBook("Кобзар", "Тарас Шевченко", 2024, 125, "Диктор"));

        System.out.print("\n");

        // TASK 16
        System.out.println(new Gamer("Stas", 1000));
        System.out.println(new ProEsportsPlayer("Stas", 3000, "Team A", 50000, 5));
        System.out.println(new ProEsportsPlayer("NewPlayer", 100, "Team B", 0, 0));

        System.out.print("\n");

        // TASK 17
        System.out.println(new StaffMember("Іван", 20000));
        System.out.println(new Manager("Марія", 30000, 5000));
        System.out.println(new SalesPerson("Андрій", 15000, 100000, 5));

        System.out.print("\n");

        // TASK 18
        System.out.println(new StandardTransfer(1000));
        System.out.println(new InternationalTransfer(1000, "PL"));

        System.out.print("\n");

        // TASK 19
        System.out.println(new Ticket("Концерт", 1000));
        System.out.println(new StudentTicket("Концерт", 1000, "ST001"));
        System.out.println(new VipTicket("Концерт", 1000, true, 500));

        System.out.print("\n");

        // TASK 20
        System.out.println(new Weapon("Меч", 100));
        System.out.println(new EnchantedSword("Вогняний меч", 100, "Вогонь", 30, 3));

        System.out.print("\n");

        // TASK 21
        System.out.println(new Parcel("NP001", 2));
        System.out.println(new FragileParcel("NP002", 2, true, 1000));

        System.out.print("\n");

        // TASK 22
        Appliance appliance = new Appliance("Звичайний обігрівач", 2000);
        EcoHeater heater = new EcoHeater("Еко обігрівач", 2000, true);
        System.out.println(appliance);
        System.out.println("За 8 годин: " + appliance.getDailyConsumptionKWh(8) + " кВт·год");
        System.out.println(heater);
        System.out.println("За 8 годин: " + heater.getDailyConsumptionKWh(8) + " кВт·год");

        System.out.print("\n");

        // TASK 23
        Point2D point2D = new Point2D(3, 4);
        Point3D point3D = new Point3D(3, 4, 12);
        System.out.println(point2D + " Відстань: " + point2D.distanceToOrigin());
        System.out.println(point3D + " Відстань: " + point3D.distanceToOrigin());

        System.out.print("\n");

        // TASK 24
        System.out.println("Для прикладу: кава 2 ккал/100 мл, молоко 50 ккал/100 мл, сироп 20 ккал за порцію");
        System.out.println(new Coffee("Середня обсмажка", 200, 40));
        System.out.println(new LatteWithAddons("Середня обсмажка", 200, 60, "Рослинне", 2));

        System.out.print("\n");

        // TASK 25
        System.out.println(new DotaHero("Hero", "Сила", 200));
        System.out.println(new StrengthHero("Силовик", 200, 25));
        AlchemistHero alchemist = new AlchemistHero("Alchemist", 200, 25, 100);
        System.out.println(alchemist);
        System.out.println(alchemist.chemicalRage());

        System.out.print("\n");

        // TASK 26
        System.out.println(new ElectricCar("Tesla", 2025, 350, 4, 75, 500));

        System.out.print("\n");

        // TASK 27
        CashbackPlatinumCard card = new CashbackPlatinumCard("Станіслав", 10000, 3000, 5);
        System.out.println("Оплата 1000: " + card.pay(1000));
        System.out.println("Оплата 3000: " + card.pay(3000));
        System.out.println(card);

        System.out.print("\n");

        // TASK 28
        CustomTerminal terminal = new CustomTerminal();
        System.out.println(terminal.authorize("stas"));
        System.out.println("generateAuthHash не можна перевизначити, бо метод final");

        System.out.print("\n");

        // TASK 29
        ImmutableServerCredentials credentials = new ImmutableServerCredentials("localhost", 8080, "my-api-key");
        System.out.println(credentials);
        System.out.println("Клас final, тому від нього не можна створити спадкоємця");

        System.out.print("\n");

        // TASK 30
        System.out.println(new Segment1D(3));
        System.out.println(new Square2D(3));
        System.out.println(new Cube3D(3));

        System.out.print("\n");

        // TASK 31
        System.out.println(new PostgraduateStudent(1, "stas@mail.com", "КНД-11", 90, "Аналіз даних", "Іван Петренко"));
        System.out.println(new PostgraduateStudent(2, "student@mail.com", "КНД-12", 80, "", "Іван Петренко"));

        System.out.print("\n");

        // TASK 32
        ControlledSubstance medicine = new ControlledSubstance("Препарат", 100, false, "DOC001", 20);
        System.out.println(medicine);
        System.out.println("З рецептом: " + medicine.canSell(true));
        System.out.println("Без рецепта: " + medicine.canSell(false));
        System.out.println("Неповнолітньому: " + new ControlledSubstance("Препарат", 100, false, "DOC001", 17).canSell(true));
        System.out.println("Прострочений: " + new ControlledSubstance("Препарат", 100, true, "DOC001", 20).canSell(true));

        System.out.print("\n");

        // TASK 33
        System.out.println(new ArithmeticProgression(2, 3));
        System.out.println(new GeometricProgression(2, 3));

        System.out.print("\n");

        // TASK 34
        int[] grades = {60, 80, 100};
        System.out.println(new GradeSheet("Станіслав", grades));
        System.out.println(new WeightedGradeSheet("Станіслав", grades, new double[]{1, 1, 2}));

        System.out.print("\n");

        // TASK 35
        LinearFunction linear = new LinearFunction(2, 3);
        QuadraticFunction quadratic = new QuadraticFunction(1, -4, 3);
        System.out.println(linear + " f(2)=" + linear.evaluate(2));
        System.out.println(quadratic + " f(2)=" + quadratic.evaluate(2));

        System.out.print("\n");

        // TASK 36
        System.out.println(new WarehouseItem("Монітор", 3, new double[]{1000, 1200, 1100}));
        System.out.println(new DiscountedWarehouseItem("Монітор", 3, new double[]{1000, 1200, 1100}, "Пошкоджена упаковка", 20));

        System.out.print("\n");

        // TASK 37
        CinemaHall hall = new CinemaHall("Звичайний", 3, 4, 180);
        hall.bookSeat(0, 0);
        System.out.println(hall);
        VipCinemaHall vipHall = new VipCinemaHall("VIP", 3, 4, 180, 100);
        vipHall.bookSeat(0, 0);
        vipHall.bookSeat(2, 1);
        System.out.println(vipHall);

        System.out.print("\n");

        // TASK 38
        TeamLead lead = new TeamLead("Марія", 50000, "Java", 3);
        lead.addTeamMember(developer);
        lead.addTeamMember(new Developer("Андрій", 25000, "Java"));
        System.out.println(lead);

        System.out.print("\n");

        // TASK 39
        ShieldedPaladin paladin = new ShieldedPaladin("Паладин", 100, 10, 50);
        System.out.println(paladin);
        paladin.takeDamage(30);
        System.out.println(paladin);
        paladin.takeDamage(40);
        System.out.println(paladin);
        paladin.takeDamage(200);
        System.out.println(paladin);

        System.out.print("\n");

        // TASK 40
        System.out.println("Для здачі роботи потрібні коміт та push у власний GitHub-репозиторій");
        System.out.println("git status");
        System.out.println("git add src/semester1/practice08 .gitignore");
        System.out.println("git commit -m \"Complete Practice 08 and Homework 08\"");
        System.out.println("git push");
    }
}
