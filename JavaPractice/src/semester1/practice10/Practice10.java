package semester1.practice10;

import java.util.Arrays;

public class Practice10 {
    public static void main(String args[])
    {
        // TASK 1
        PaymentInstrument[] payments = {
                new BankCardInstrument("Станіслав"),
                new CryptoTokenInstrument("Станіслав", 40),
                new IbanDirectInstrument("Станіслав")
        };
        double paymentTotal = 0;
        for (PaymentInstrument payment : payments)
        {
            double cost = payment.processPayment(10000);
            paymentTotal += cost;
            System.out.println(payment + " Витрати: " + cost);
        }
        System.out.println("Сумарні витрати: " + paymentTotal);

        System.out.print("\n");

        // TASK 2
        Shape2D[] shapes = {new CircleShape(5), new RectangleShape(4, 6), new EquilateralTriangleShape(3)};
        for (Shape2D shape : shapes)
        {
            System.out.println(shape);
        }
        System.out.println("Найбільша фігура: " + findMaxAreaShape(shapes));

        System.out.print("\n");

        // TASK 3
        VectorMathOverload math = new VectorMathOverload();
        System.out.println("Норма 1D: " + math.norm(-5));
        System.out.println("Норма 2D: " + math.norm(3, 4));
        System.out.println("Норма масиву: " + math.norm(new double[]{3, 4, 12}));
        BinaryOperation[] operations = {new AddOp(), new MultiplyOp(), new HypotenuseOp()};
        for (BinaryOperation operation : operations)
        {
            System.out.println(operation.getClass().getSimpleName() + ": " + operation.apply(3, 4));
        }

        System.out.print("\n");

        // TASK 4
        NotificationSender[] senders = {
                new EmailSender("stas@mail.com", "Тривога"),
                new SmsSender("+380001112233"),
                new TelegramBotSender("@stas")
        };
        broadcastAlert(senders, "Увага! Перевірте стан обладнання та негайно повідомте відповідального працівника про несправності");

        System.out.print("\n");

        // TASK 5
        ShippingTariff[] tariffs = {new RoadTruckTariff(), new AirCargoTariff(), new RailFreightTariff()};
        ShippingTariff cheapest = tariffs[0];
        for (ShippingTariff tariff : tariffs)
        {
            System.out.println(tariff.getClass().getSimpleName() + ": " + tariff.calculateCost(250, 600));
            if (tariff.calculateCost(250, 600) < cheapest.calculateCost(250, 600))
            {
                cheapest = tariff;
            }
        }
        System.out.println("Найвигідніший: " + cheapest.getClass().getSimpleName());

        System.out.print("\n");

        // TASK 6
        DifferentiableFunction[] functions = {new QuadraticParabola(1, -3, 2), new NaturalLogFunction(2), new ExponentialGrowth(2, 0.5)};
        for (DifferentiableFunction function : functions)
        {
            System.out.println(function.getClass().getSimpleName() + " f(2)=" + function.f(2) + " f'(2)=" + function.derivativeAt(2));
        }

        System.out.print("\n");

        // TASK 7
        UiWidget[] widgets = {
                new ButtonWidget("save", 100, 30, "Зберегти"),
                new TextInputWidget("name", 200, 30, "Введіть ім'я"),
                new ProgressBarWidget("progress", 200, 20, 75)
        };
        System.out.println(buildHtmlPage(widgets));

        System.out.print("\n");

        // TASK 8
        IndustrialAsset[] assets = {
                new LinearDepreciationAsset("Верстат", 100000, 10),
                new DecliningBalanceAsset("Принтер", 50000, 5, 0.2)
        };
        double bookValue = 0;
        for (IndustrialAsset asset : assets)
        {
            double value = asset.getBookValueAfterYears(3);
            bookValue += value;
            System.out.println(asset + " Через 3 роки: " + value);
        }
        System.out.println("Залишкова вартість цеху: " + bookValue);

        System.out.print("\n");

        // TASK 9
        Measurable[] items = {new BankVault(100), new HighwayRoute(200), new CpuCore(3)};
        System.out.println("Середнє значення: " + computeAverage(items));

        System.out.print("\n");

        // TASK 10
        EnergyConvertible[] energySources = {new KineticBody(1000, 20), new BatteryCell(500)};
        System.out.println("Швидкість світла: " + EnergyConvertible.SPEED_OF_LIGHT);
        for (EnergyConvertible source : energySources)
        {
            System.out.println("Енергія: " + source.getEnergyJoules() + " Дж = " + source.getEnergyKwh() + " кВт·год");
        }

        System.out.print("\n");

        // TASK 11
        AmphibiousRescueDrone drone = new AmphibiousRescueDrone(50.45, 30.52);
        testFlight(drone);
        testDiving(drone);
        logPosition(drone);

        System.out.print("\n");

        // TASK 12
        DataValidator email = new EmailValidator();
        DataValidator number = new PositiveNumberValidator();
        System.out.println("Email: " + email.validateOrDefault("stas@mail.com", "Невірний email"));
        System.out.println("Email: " + email.validateOrDefault("wrong", "Невірний email"));
        System.out.println("Число: " + number.validateOrDefault("12.5", "0"));
        System.out.println("Число: " + number.validateOrDefault("abc", "0"));
        System.out.println("Порожній рядок: " + DataValidator.isNotNullOrBlank(" "));

        System.out.print("\n");

        // TASK 13
        System.out.println(new EmergencyBeacon().emitAlert());

        System.out.print("\n");

        // TASK 14
        BlockchainSmartContract contract = new EscrowSmartContract("key123");
        System.out.println("Підпис: " + contract.verifySignature("key123"));
        System.out.println("Виконання: " + contract.executeContract(100));
        System.out.println(contract.getAuditTrail());

        System.out.print("\n");

        // TASK 15
        Transformable2D[] objects = {new BoundingBox(0, 0, 4, 6), new CircleRegion(2, 3, 5)};
        applyGlobalTransform(objects, 5, -2, 2);
        for (Transformable2D object : objects)
        {
            System.out.println(object);
        }

        System.out.print("\n");

        // TASK 16
        DataExportable[] records = {new StudentGradeRecord("Станіслав", 11, 90), new WeatherObservation("Київ", 8.5, 70)};
        System.out.println("JSON:");
        for (DataExportable record : records)
        {
            System.out.println(record.toJson());
        }
        System.out.println("CSV:");
        for (DataExportable record : records)
        {
            System.out.println(record.toCsvRow());
        }

        System.out.print("\n");

        // TASK 17
        Falcon falcon = new Falcon(1.5);
        AbstractBird[] birds = {falcon, new EmperorPenguin(30)};
        for (AbstractBird bird : birds)
        {
            System.out.println(bird + " Звук: " + bird.makeSound());
        }
        FlyableUnit[] flyers = {falcon, new CargoPlane()};
        for (FlyableUnit flyer : flyers)
        {
            System.out.println("Швидкість польоту: " + flyer.getFlightSpeedKmh());
        }

        System.out.print("\n");

        // TASK 18
        SmartLedChandelier chandelier = new SmartLedChandelier("Вітальня", "LED");
        SmartUnderfloorHeating heating = new SmartUnderfloorHeating("Кухня", "Heat");
        chandelier.setBrightness(50);
        heating.setTargetTemperature(24);
        AbstractSmartAppliance[] appliances = {chandelier, heating};
        double totalWatts = 0;
        for (AbstractSmartAppliance appliance : appliances)
        {
            appliance.turnOn();
            totalWatts += appliance.getCurrentWatts();
            System.out.println(appliance);
        }
        System.out.println("Разом: " + totalWatts + " Вт");

        System.out.print("\n");

        // TASK 19
        AbstractFinancialInstrument[] portfolio = {
                new TechGrowthStock("TECH", 10, 1000),
                new BlueChipStock("BLUE", 20, 500, 25),
                new FixedTermDeposit("DEPOSIT", 10000, 0.15)
        };
        for (AbstractFinancialInstrument instrument : portfolio)
        {
            if (instrument instanceof Tradable tradable)
            {
                tradable.buy(2);
                tradable.sell(1);
            }
            System.out.println(instrument);
            if (instrument instanceof DividendPaying dividend)
            {
                System.out.println("Річний дохід: " + dividend.calculateAnnualDividend());
            }
        }

        System.out.print("\n");

        // TASK 20
        Vec2D vector = new Vec2D(3, 4);
        AbstractVectorOperator[] vectorOperators = {new Rotation2DOperator(Math.PI / 2), new ProjectionXOperator()};
        for (AbstractVectorOperator operator : vectorOperators)
        {
            Vec2D result = operator.transform(vector);
            System.out.println(operator + ": " + result);
            if (operator instanceof InvertibleOperator inverse)
            {
                System.out.println("Відновлений вектор: " + inverse.inverseTransform(result));
            }
        }

        System.out.print("\n");

        // TASK 21
        AbstractVehicle[] vehicles = {new ElectricCityBus("AA001", 10000), new DieselDumpTruck("AA002", 20000), new CargoPassengerVan("AA003", 5000)};
        for (AbstractVehicle vehicle : vehicles)
        {
            System.out.println(vehicle);
            if (vehicle instanceof CargoCarrier cargo)
            {
                System.out.println("Вантаж: " + cargo.getMaxPayloadTons() + " т");
            }
            if (vehicle instanceof PassengerCarrier passengers)
            {
                System.out.println("Місця: " + passengers.getSeatCount());
            }
            if (vehicle instanceof ElectricPowered electric)
            {
                System.out.println("Батарея: " + electric.getBatteryCapacityKwh() + " кВт·год");
            }
        }

        System.out.print("\n");

        // TASK 22
        AbstractMilitaryUnit[] militaryUnits = {new HeavySniper(), new CombatMedic(), new PaladinCaptain()};
        for (AbstractMilitaryUnit unit : militaryUnits)
        {
            System.out.println(unit);
            if (unit instanceof RangedAttacker attacker)
            {
                System.out.println("Дальність: " + attacker.getAttackRange() + " Шкода: " + attacker.fireShot());
            }
            if (unit instanceof FieldHealer healer)
            {
                System.out.println("Лікування: " + healer.healAlly());
            }
        }

        System.out.print("\n");

        // TASK 23
        AbstractLabDevice[] devices = {new ElectronicScale("S001", 99), new GlassThermometer("T001", 22)};
        for (AbstractLabDevice device : devices)
        {
            if (device instanceof Calibratable calibrated)
            {
                calibrated.calibrate(100);
            }
            if (device instanceof SelfDiagnostic diagnostic)
            {
                System.out.println("Самоперевірка: " + diagnostic.runSelfCheck());
            }
            device.performMeasurement();
        }

        System.out.print("\n");

        // TASK 24
        CaesarCipherProcessor cipher = new CaesarCipherProcessor(3);
        TextProcessor[] textPipeline = {new WhitespaceTrimmerProcessor(), cipher};
        String text = "  Hello   Java  ";
        for (TextProcessor processor : textPipeline)
        {
            text = processor.process(text);
        }
        System.out.println("Зашифровано: " + text);
        System.out.println("Розшифровано: " + cipher.reverseProcess(text));

        System.out.print("\n");

        // TASK 25
        for (Shape2D shape : shapes)
        {
            if (shape instanceof CircleShape c)
            {
                System.out.println("Діаметр: " + c.getDiameter());
            }
            if (shape instanceof RectangleShape r)
            {
                System.out.println("Діагональ: " + r.getDiagonal() + " Квадрат: " + r.isSquare());
            }
        }
        Shape2D missingShape = null;
        System.out.println("null instanceof Shape2D: " + (missingShape instanceof Shape2D));

        System.out.print("\n");

        // TASK 26
        Object[] warehouse = {new Laptop(), new DesktopMonitor(), new ElectricScooter(), new WiredPrinter(), new SmartWatch()};
        System.out.println("Заряджено пристроїв: " + chargeAllPossible(warehouse));
        for (Object item : warehouse)
        {
            if (item instanceof Rechargeable)
            {
                System.out.println(item);
            }
        }

        System.out.print("\n");

        // TASK 27
        AbstractWorker[] staff = {new FullTimeDeveloper("Станіслав", 30000), new FopContractor("Андрій", 40000), new InternStudent("Іван", 10000)};
        auditStaff(staff);

        System.out.print("\n");

        // TASK 28
        ShipModule[] modules = {new ShieldGenerator(false), new WarpDrive(true), new LifeSupportModule(false, 21)};
        runShipInspection(modules);

        System.out.print("\n");

        // TASK 29
        MediaItem[] media = {
                new VideoFile("Фільм 4K", 12000, 2160, 7200),
                new VideoFile("Відео HD", 500, 1080, 600),
                new AudioFile("FLAC", 100, 1411),
                new AudioFile("MP3", 10, 320),
                new EBookFile("Книга", 5, 300)
        };
        double selectedSize = 0;
        for (MediaItem item : media)
        {
            if (item instanceof VideoFile video && video.is4K())
            {
                selectedSize += video.getSizeMb();
                System.out.println(video);
            }
            if (item instanceof AudioFile audio && audio.isLossless())
            {
                selectedSize += audio.getSizeMb();
                System.out.println(audio);
            }
        }
        System.out.println("Обсяг 4K та Lossless: " + selectedSize + " MB");

        System.out.print("\n");

        // TASK 30
        AbstractCustomer[] customers = {new VipCustomer(), new StudentCustomer()};
        for (AbstractCustomer customer : customers)
        {
            System.out.println("Ціна зі знижкою: " + calculateDiscountedPrice(customer, 1000));
        }

        System.out.print("\n");

        // TASK 31
        Matrix2x2[] matrices = {new RotationMatrix2x2(Math.PI / 3), new SingularMatrix2x2(1, 2)};
        for (Matrix2x2 matrix : matrices)
        {
            System.out.println(matrix);
            if (matrix instanceof InvertibleMatrix inverse)
            {
                System.out.println("Обернена: " + inverse.inverse());
            }
            if (matrix instanceof OrthogonalMatrix orthogonal)
            {
                System.out.println("Ортогональна: " + orthogonal.checkOrthogonality());
            }
        }

        System.out.print("\n");

        // TASK 32
        CargoContainer[] containers = {new ElectronicsContainer(), new ChemicalContainer(), new FrozenFoodContainer()};
        for (CargoContainer container : containers)
        {
            System.out.println(container);
            if (container instanceof HazardousCargo hazardous)
            {
                System.out.println("У спецбокс, клас небезпеки: " + hazardous.getHazardClass());
            }
            if (container instanceof RefrigeratedCargo refrigerated)
            {
                System.out.println("Підключено живлення, температура: " + refrigerated.getRequiredTempC());
            }
        }

        System.out.print("\n");

        // TASK 33
        double[] coefficients = {1, 2, 3};
        FinalCalibrationTable calibration = new FinalCalibrationTable("S001", coefficients);
        coefficients[0] = 999;
        calibration.getCoefficients()[1] = 999;
        final double[] numbers = {10, 20};
        numbers[0] = 99;
        System.out.println("final не забороняє зміну елемента: " + Arrays.toString(numbers));
        System.out.println("Захисні копії: " + calibration);
        System.out.println("GRAVITY_G: " + FinalCalibrationTable.GRAVITY_G);

        System.out.print("\n");

        // TASK 34
        AbstractSecurityProtocol[] protocols = {new JwtSecurityProtocol("jwt123"), new ApiKeySecurityProtocol("api123")};
        System.out.println(protocols[0].runSecureCommand("jwt123", "status"));
        System.out.println(protocols[1].runSecureCommand("api123", "status"));
        System.out.println(protocols[0].runSecureCommand(null, "status"));

        System.out.print("\n");

        // TASK 35
        MetricSpaceElement[] vectors = {new ImmutableVector3D(0, 0, 0), new ImmutableVector3D(3, 4, 12)};
        for (MetricSpaceElement element : vectors)
        {
            System.out.println(element + " Норма: " + element.getNorm());
        }
        System.out.println("Відстань: " + vectors[0].distanceTo(vectors[1]));

        System.out.print("\n");

        // TASK 36
        PrintableDocument[] documents = {new FiscalReceipt("F001", 1200), new WarehouseReport("Київ", 100)};
        for (PrintableDocument document : documents)
        {
            System.out.println(document.formatForPrinter());
        }

        System.out.print("\n");

        // TASK 37
        PowerProducer[] stations = {new NuclearStation("N1", 1000), new SolarFarmStation("S1", 100), new HydroDamStation("H1", 200)};
        System.out.println("Генерація після 5% втрат, погода 0.5: " + SmartGridController.updateAndCalculate(stations, 0.5) + " MW");

        System.out.print("\n");

        // TASK 38
        FunctionAnalyzer.analyze(new AbstractAnalyticFunction[]{new CubicFunction()});

        System.out.print("\n");

        // TASK 39
        AbstractCombatUnit[] fighters = {new BerserkerAssasin(), new TrollWarlord(), new RoyalPaladin()};
        runCombatRound(fighters);

    }

    public static Shape2D findMaxAreaShape(Shape2D[] shapes)
    {
        Shape2D largest = shapes[0];
        for (Shape2D shape : shapes)
        {
            if (shape.getArea() > largest.getArea())
            {
                largest = shape;
            }
        }
        return largest;
    }
    public static void broadcastAlert(NotificationSender[] senders, String alertText)
    {
        for (NotificationSender sender : senders)
        {
            System.out.println(sender.send(alertText));
        }
    }
    public static String buildHtmlPage(UiWidget[] pageElements)
    {
        String html = "<!DOCTYPE html>\n<html><body>\n";
        for (UiWidget widget : pageElements)
        {
            html += widget.renderHtml() + "\n";
        }
        return html + "</body></html>";
    }
    public static double computeAverage(Measurable[] items)
    {
        double sum = 0;
        for (Measurable item : items)
        {
            sum += item.getMeasure();
        }
        return sum / items.length;
    }
    public static void testFlight(Flyable f)
    {
        f.takeOff();
        System.out.println("Максимальна висота: " + f.getMaxAltitude());
    }
    public static void testDiving(Swimmable s)
    {
        s.dive(10);
        System.out.println("Максимальна глибина: " + s.getMaxDepth());
    }
    public static void logPosition(GpsTrackable g)
    {
        System.out.println("Координати: " + g.getCoordinates());
    }
    public static void applyGlobalTransform(Transformable2D[] objects, double dx, double dy, double scaleFactor)
    {
        for (Transformable2D object : objects)
        {
            object.translate(dx, dy);
            object.scale(scaleFactor);
        }
    }
    public static int chargeAllPossible(Object[] items)
    {
        int count = 0;
        for (Object item : items)
        {
            if (item instanceof Rechargeable r)
            {
                r.chargeToFull();
                count++;
            }
        }
        return count;
    }
    public static void auditStaff(AbstractWorker[] staff)
    {
        double payroll = 0;
        double bonuses = 0;
        int insuredCount = 0;
        for (AbstractWorker worker : staff)
        {
            payroll += worker.getBaseSalary();
            if (worker instanceof BonusEligible bonus)
            {
                bonuses += bonus.calculateQuarterBonus();
            }
            if (worker instanceof MedicalInsured insured)
            {
                insuredCount++;
                System.out.println("Страхове покриття: " + insured.getInsuranceCoverage());
            }
        }
        System.out.println("Фонд оплати: " + payroll + " Премії: " + bonuses + " Застрахованих: " + insuredCount);
    }
    public static void runShipInspection(ShipModule[] modules)
    {
        for (ShipModule module : modules)
        {
            System.out.println(module);
            if (module instanceof ShieldGenerator shield)
            {
                shield.rechargeShields(100);
            }
            if (module instanceof WarpDrive warp)
            {
                System.out.println("Утримання антиматерії: " + warp.checkAntimatterContainment());
            }
            if (module instanceof LifeSupportModule support)
            {
                System.out.println("Кисень: " + support.getOxygenPercent() + "%");
            }
        }
    }
    public static double calculateDiscountedPrice(AbstractCustomer customer, double price)
    {
        return price * (1 - customer.getDiscountPercent() / 100);
    }
    public static void runCombatRound(AbstractCombatUnit[] units)
    {
        for (int i = 0; i < units.length; i++)
        {
            AbstractCombatUnit attacker = units[i];
            AbstractCombatUnit defender = units[(i + 1) % units.length];
            if (attacker.isAlive() && defender.isAlive())
            {
                if (attacker instanceof SelfRegenerating reg)
                {
                    System.out.println("Відновлено HP: " + reg.regenerateHp());
                }
                int damage = attacker.calculateDamage();
                if (attacker instanceof CriticalStriker crit)
                {
                    damage = (int) (damage * crit.getCritMultiplier());
                }
                if (defender instanceof ShieldBearer shield)
                {
                    damage = shield.absorbDamage(damage);
                }
                defender.takeDamage(damage);
                System.out.println(attacker + " -> " + defender + " Шкода: " + damage);
            }
        }
    }
}
