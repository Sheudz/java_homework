package semester1.practice09;

import java.util.Arrays;

public class Practice09 {
    public static void main(String args[])
    {
        // TASK 1
        ImmutableGeoPoint point = new ImmutableGeoPoint(50, 30);
        System.out.println(point);
        System.out.println(point.shift(100, -300));
        System.out.println("Початкова точка: " + point);

        System.out.print("\n");

        // TASK 2
        double[] samples = {10, 12, 14};
        LabMeasurement measurement = new LabMeasurement("Температура", samples);
        samples[0] = -100;
        double[] samplesCopy = measurement.getSamples();
        samplesCopy[1] = 999;
        System.out.println("Зовнішній масив: " + Arrays.toString(samples));
        System.out.println("Змінена копія: " + Arrays.toString(samplesCopy));
        System.out.println("Внутрішні дані: " + measurement);

        System.out.print("\n");

        // TASK 3
        CryptoVault vault = new CryptoVault("wallet001", "secret phrase", 1.5);
        System.out.println("Переказ із заблокованого: " + vault.sendBtc(0.1, "wallet002"));
        System.out.println("Неправильна фраза: " + vault.unlock("wrong"));
        System.out.println("Розблокування: " + vault.unlock("secret phrase"));
        System.out.println("Переказ: " + vault.sendBtc(0.5, "wallet002"));
        vault.lock();
        System.out.println(vault);

        System.out.print("\n");

        // TASK 4
        ClosedInterval interval = new ClosedInterval(10, 2);
        System.out.println(interval);
        System.out.println("Перетин із [8; 15]: " + interval.overlaps(new ClosedInterval(8, 15)));
        interval.resize(5, -5);
        System.out.println(interval);

        System.out.print("\n");

        // TASK 5
        RgbColor color = new RgbColor(300, -10, 100);
        System.out.println(color);
        System.out.println("Інверсія: " + color.invert());
        System.out.println("Змішування: " + color.mixWith(new RgbColor(0, 200, 100)));

        System.out.print("\n");

        // TASK 6
        HighSecuritySafe safe = new HighSecuritySafe(1234);
        System.out.println("Покласти 1000: " + safe.putCash(1234, 1000));
        System.out.println("Зняти 200: " + safe.takeCash(1234, 200));
        safe.takeCash(1111, 100);
        safe.takeCash(2222, 100);
        safe.takeCash(3333, 100);
        System.out.println("Правильний PIN після блокування: " + safe.takeCash(1234, 100));
        System.out.println(safe);

        System.out.print("\n");

        // TASK 7
        double[] coeffs = {1, -3, 2, 0};
        EncapsulatedPolynomial polynomial = new EncapsulatedPolynomial(coeffs);
        coeffs[0] = 100;
        System.out.println(polynomial);
        System.out.println("Степінь: " + polynomial.getDegree());
        System.out.println("Коефіцієнт x^2: " + polynomial.getCoefficient(2));
        System.out.println("P(3) = " + polynomial.evaluate(3));

        System.out.print("\n");

        // TASK 8
        String[] allergies = {"Пеніцилін", "Пилок"};
        MedicalRecord record = new MedicalRecord("P001", "Станіслав Затишняк", 2, true, allergies);
        allergies[0] = "Інше";
        String[] allergyCopy = record.getAllergies();
        allergyCopy[1] = "Інше";
        System.out.println(record);
        System.out.println("Алергія на пеніцилін: " + record.hasAllergyTo("пеніцилін"));

        System.out.print("\n");

        // TASK 9
        CompositeCircle circle = new CompositeCircle(0, 0, 5);
        System.out.println(circle);
        System.out.println("Точка (3; 4) всередині: " + circle.containsPoint(new Point2D(3, 4)));
        System.out.println("Точка (6; 0) всередині: " + circle.containsPoint(new Point2D(6, 0)));

        System.out.print("\n");

        // TASK 10
        Automobile automobile = new Automobile("Toyota", "Бензин", 2000);
        automobile.accelerate(30);
        System.out.println(automobile);
        automobile.start();
        automobile.accelerate(30);
        System.out.println(automobile);
        automobile.stop();
        System.out.println(automobile);

        System.out.print("\n");

        // TASK 11
        SmartDevice device = new SmartDevice(5000, 6.5, 80);
        device.watchVideo(60);
        System.out.println(device);
        device.watchVideo(500);
        System.out.println(device);

        System.out.print("\n");

        // TASK 12
        Point2D start = new Point2D(0, 0);
        Point2D end = new Point2D(3, 4);
        LineSegment segment = new LineSegment(start, end);
        end.translate(100, 100);
        Point2D midpoint = segment.getMidpoint();
        midpoint.translate(100, 100);
        System.out.println("Відрізок після зміни зовнішніх точок: " + segment);

        System.out.print("\n");

        // TASK 13
        BankAccount account = new BankAccount("UA001", 5000);
        PlasticCard firstCard = new PlasticCard("1111", "12/28", account);
        PlasticCard secondCard = new PlasticCard("2222", "12/28", account);
        System.out.println("Оплата першою: " + firstCard.payAtTerminal(1000));
        System.out.println("Оплата другою: " + secondCard.payAtTerminal(500));
        firstCard.block();
        System.out.println("Заблокована картка: " + firstCard.payAtTerminal(100));
        System.out.println(firstCard);
        System.out.println(secondCard);

        System.out.print("\n");

        // TASK 14
        HeroCharacter hero = new HeroCharacter("Stas", 50);
        hero.equip(new WeaponItem("Меч", 30, 20));
        System.out.println("Удар: " + hero.attack());
        System.out.println("Удар: " + hero.attack());
        System.out.println("Зламана зброя: " + hero.attack());
        hero.equip(new WeaponItem("Сокира", 50, 100));
        System.out.println("Нова зброя: " + hero.attack());
        hero.unequip();
        System.out.println("Без зброї: " + hero.attack());
        System.out.println(hero);

        System.out.print("\n");

        // TASK 15
        ParcelOrder order = new ParcelOrder("NP001", 2, new DeliveryAddress("Київ", "Хрещатик", 1));
        System.out.println("Зміна до відправки: " + order.changeDestination(new DeliveryAddress("Львів", "Городоцька", 2)));
        order.markAsShipped();
        System.out.println("Зміна після відправки: " + order.changeDestination(new DeliveryAddress("Одеса", "Дерибасівська", 3)));
        System.out.println(order);

        System.out.print("\n");

        // TASK 16
        ClimateController climate = new ClimateController(18, 22, 2);
        climate.regulate();
        System.out.println(climate);
        climate.updateTemperature(21.8);
        climate.regulate();
        System.out.println(climate);
        climate.updateTemperature(22);
        climate.regulate();
        System.out.println(climate);

        System.out.print("\n");

        // TASK 17
        Polyline polyline = new Polyline(3);
        polyline.addVertex(0, 0);
        polyline.addVertex(3, 0);
        polyline.addVertex(3, 4);
        System.out.println(polyline);

        System.out.print("\n");

        // TASK 18
        ShoppingOrder shopping = new ShoppingOrder(10);
        shopping.addItem("Миша", 500, 1);
        shopping.addItem("Клавіатура", 1000, 1);
        shopping.addItem("Миша", 500, 2);
        System.out.println(shopping);

        System.out.print("\n");

        // TASK 19
        Bookshelf shelf = new Bookshelf("Програмування", 3);
        shelf.putBook(new BookItem("Java", "Автор А", 500));
        shelf.putBook(new BookItem("Алгоритми", "Автор Б", 700));
        System.out.println(shelf);
        System.out.println("Найбільша книга: " + shelf.findLongestBook());

        System.out.print("\n");

        // TASK 20
        Playlist playlist = new Playlist("Музика", 3);
        playlist.addTrack(new AudioTrack("Трек 1", "Виконавець 1", 185));
        playlist.addTrack(new AudioTrack("Трек 2", "Виконавець 2", 200));
        System.out.println(playlist);

        System.out.print("\n");

        // TASK 21
        DataCenterCluster cluster = new DataCenterCluster("Київ", 3);
        cluster.addNode(new ServerNode("192.168.1.1", 64, false));
        cluster.addNode(new ServerNode("192.168.1.2", 32, true));
        cluster.addNode(new ServerNode("192.168.1.3", 64, true));
        System.out.println("Контейнер 24 GB: " + cluster.deployContainer(24));
        System.out.println("Контейнер 48 GB: " + cluster.deployContainer(48));
        System.out.println("Контейнер 100 GB: " + cluster.deployContainer(100));
        System.out.println(cluster);

        System.out.print("\n");

        // TASK 22
        UniversityCourse course = new UniversityCourse("Java", 2);
        course.addModule(new CourseModule("Основи", 20, 40, 40));
        course.addModule(new CourseModule("ООП", 30, 60, 60));
        System.out.println(course);

        System.out.print("\n");

        // TASK 23
        PassengerTrain train = new PassengerTrain("Київ - Львів", 2);
        train.attachCarriage(new TrainCarriage(1, "Купе", 36));
        train.attachCarriage(new TrainCarriage(2, "Плацкарт", 54));
        System.out.println("Бронювання 4 місць: " + train.bookTicketsInCarriage(1, 4));
        System.out.println("Бронювання 100 місць: " + train.bookTicketsInCarriage(2, 100));
        System.out.println(train);

        System.out.print("\n");

        // TASK 24
        EquationSystem system = new EquationSystem(2);
        system.addEquation(new LinearEquation(1, 1, 5));
        system.addEquation(new LinearEquation(1, -1, 1));
        System.out.println(system);
        System.out.println("Розв'язок (3; 2): " + system.checkSolution(3, 2));
        System.out.println("Розв'язок (1; 1): " + system.checkSolution(1, 1));

        System.out.print("\n");

        // TASK 25
        System.out.println(new CircleShape("Червоний", 5));
        System.out.println(new RectangleShape("Синій", 3, 4));

        System.out.print("\n");

        // TASK 26
        SolarPowerPlant solar = new SolarPowerPlant("Сонячна", 10, 0.8);
        WindPowerPlant wind = new WindPowerPlant("Вітрова", 10, 12);
        System.out.println("Для прикладу вітер: потужність * min(1, (швидкість / 12)^3), робочі межі 3..25 м/с");
        System.out.println(solar + " Дохід: " + solar.calculateDailyProfit(1000));
        System.out.println(wind + " Дохід: " + wind.calculateDailyProfit(1000));
        System.out.println(new WindPowerPlant("Штиль", 10, 2));
        System.out.println(new WindPowerPlant("Шторм", 10, 26));

        System.out.print("\n");

        // TASK 27
        System.out.println(new SalariedEmployee(1, "Станіслав", 20000, 5000));
        System.out.println(new HourlyContractor(2, "Андрій", 180, 100));

        System.out.print("\n");

        // TASK 28
        HarmonicSequence harmonic = new HarmonicSequence();
        SquareNumbersSequence squares = new SquareNumbersSequence();
        System.out.println(harmonic + " Сума перших 5: " + harmonic.sumFirstN(5));
        System.out.println(squares + " Сума перших 5: " + squares.sumFirstN(5));

        System.out.print("\n");

        // TASK 29
        System.out.println(new DomesticTransfer("TX1", 100));
        System.out.println(new DomesticTransfer("TX2", 2000));
        System.out.println(new CryptoTransfer("TX3", 1000, 15));

        System.out.print("\n");

        // TASK 30
        System.out.println(new Sphere3D("Сталь", 7850, 0.1));
        System.out.println(new Cylinder3D("Золото", 19300, 0.05, 0.2));

        System.out.print("\n");

        // TASK 31
        PressureSensor pressure = new PressureSensor("Резервуар", 1, 5, 3, 1.1);
        RadiationSensor radiation = new RadiationSensor("Лабораторія", 0, 0.3, 0.5);
        System.out.println(pressure);
        System.out.println(radiation);

        System.out.print("\n");

        // TASK 32
        ZipCompressor zip = new ZipCompressor();
        UltraLzmaCompressor lzma = new UltraLzmaCompressor();
        System.out.println(zip + " Розмір: " + zip.estimateCompressedSize(10000) + " Економія: " + zip.getCompressionRatio(10000) + "%");
        System.out.println(lzma + " Розмір: " + lzma.estimateCompressedSize(10000) + " Економія: " + lzma.getCompressionRatio(10000) + "%");

        System.out.print("\n");

        // TASK 33
        DesktopPC pc = new DesktopPC(600, 3);
        pc.addPart(new ProcessorPart("Ryzen 7", 12000, 8, 100));
        pc.addPart(new VideoCardPart("RTX 4070", 30000, 12, 200));
        System.out.println("Запас БЖ: потужність БЖ >= споживання * 1.2");
        System.out.println(pc);
        pc.addPart(new VideoCardPart("RTX 4090", 70000, 24, 450));
        System.out.println(pc);

        System.out.print("\n");

        // TASK 34
        Spacecraft ship = new Spacecraft("Оріон", 10, 2);
        ship.addThruster(new ChemicalThruster("CH1", 200, 5));
        ship.addThruster(new IonThruster("ION1", 0.5, 0.001));
        System.out.println(ship);

        System.out.print("\n");

        // TASK 35
        LandPlot plot = new LandPlot(100, 3);
        System.out.println("Будинок 40 м2: " + plot.addStructure(new RectangleShape("Сірий", 5, 8)));
        System.out.println("Клумба: " + plot.addStructure(new CircleShape("Зелений", 2)));
        System.out.println("Ще 20 м2: " + plot.addStructure(new RectangleShape("Білий", 4, 5)));
        System.out.println(plot);

        System.out.print("\n");

        // TASK 36
        InvestmentPortfolio portfolio = new InvestmentPortfolio("Станіслав", 2);
        portfolio.addAsset(new GovernmentBond("ОВДП", 10000, 15.5));
        portfolio.addAsset(new DividendStock("STOCK", 20000, 10, 3, 0.195));
        System.out.println("Для акцій податок застосовано до додатного доходу від росту та дивідендів");
        System.out.println(portfolio);

        System.out.print("\n");

        // TASK 37
        RaidParty party = new RaidParty("Команда", 3);
        party.addMember(new ArcaneMage("Маг", 500, 100, 150));
        System.out.println("Без танка: " + party.isReady(500));
        party.addMember(new TankWarrior("Танк", 2000, 100));
        System.out.println("Для прикладу сила танка = HP / 10 + броня * 2, мага = інтелект * 3 + сила заклинань * 2");
        System.out.println(party);
        System.out.println("Готовність до складності 900: " + party.isReady(900));

        System.out.print("\n");

        // TASK 38
        SmartLab lab = new SmartLab(2);
        lab.addSensor(pressure);
        lab.addSensor(radiation);
        lab.runDiagnostics();

        System.out.print("\n");

        // TASK 39
        SignalProcessor processor = new SignalProcessor(2);
        processor.addFilter(new AmplifierFilter(2));
        processor.addFilter(new ClippingFilter(3));
        double[] signal = {-2, -0.5, 0, 0.5, 2};
        System.out.println(processor);
        System.out.println("Результат: " + Arrays.toString(processor.process(signal)));
        System.out.println("Початковий сигнал: " + Arrays.toString(signal));

        System.out.print("\n");

        // TASK 40
        System.out.println("Для здачі виконайте коміт та push у власний GitHub-репозиторій");
        System.out.println("git status");
        System.out.println("git add src/semester1/practice09");
        System.out.println("git commit -m \"Complete Practice 09 and Homework 09\"");
        System.out.println("git push");
    }
}
