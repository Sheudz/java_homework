package semester1.practice04.homework;
import java.util.Scanner;

public class Task5BrawlStarsArena {
    static String progressBar(int maxValue, int currentValue)
    {
        int filledBlocks = (int)(((double) currentValue / maxValue) * 10);

        String progressBar = "";

        for (int i = 0; i < filledBlocks; i++)
        {
            progressBar += "█";
        }

        for (int i = filledBlocks; i < 10; i++)
        {
            progressBar += "░";
        }

        return "[" + progressBar + "]";
    }

    static final Object[][] BRAWLERS = new Object[][]
    {
            {"Шеллі", 4000, 1200, 2800,     "[Шеллі]     ", "Супер-дріб"},
            {"Кольт", 3000, 1600, 3600,     "[Кольт]     ", "Кульова буря"},
            {"Ель Прімо", 6000, 1100, 2200, "[Ель Прімо] ", "Метеорний стрибок"}
    };

    static final int MAX_BOSS_HP = 10000;
    static final int BOSS_DAMAGE = 700;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int bossHP = MAX_BOSS_HP;
        double phaseModifier = 1;
        String bossPhaseString = "СПОКІЙНИЙ (Шкода: " + BOSS_DAMAGE + ")";

        int brawlerHP = 0;
        int ammo = 3;
        int superCharge = 0;
        int powerCubes = 0;

        System.out.println("""
                    ======================================================
                               ⭐ BRAWL STARS: BOSS FIGHT ⭐
                    ======================================================
                    Оберіть свого бійця:
                    1. Шеллі (Shelly)     - HP: 4000 | Атака: 1200 | Супер: 2800
                    2. Кольт (Colt)       - HP: 3000 | Атака: 1600 | Супер: 3600
                    3. Ель Прімо (Primo)  - HP: 6000 | Атака: 1100 | Супер: 2200
                """);
        Object[] brawler = null;
        while (brawler == null)
        {
            System.out.print("Ваш вибір (1-3): ");
            int brawlerId = scanner.nextInt();

            brawler = switch (brawlerId)
            {
                case 1 -> BRAWLERS[0];
                case 2 -> BRAWLERS[1];
                case 3 -> BRAWLERS[2];
                default ->
                {
                    System.out.println("Не знайдено бійця з таким id");
                    yield null;
                }
            };
        }
        System.out.println("Ви обрали бійця: " + brawler[0] + "! Бій починається!");

        brawlerHP = (int) brawler[1];

        int round = 1;
        for (; bossHP > 0 && brawlerHP > 0; round++)
        {
            System.out.println("-------------------- РАУНД " + round + " --------------------");
            System.out.println(brawler[4] + "HP: " + progressBar((int) brawler[1], brawlerHP) + " " + brawlerHP + "/" + (int) brawler[1] + " | Набої: " + ammo + "/3 Супер: " + progressBar(100, superCharge) + " " + superCharge + "%");
            System.out.println("[Робо-Бос]  HP: " + progressBar(MAX_BOSS_HP, bossHP) + " " + bossHP + "/10000 | Фаза: " + bossPhaseString);
            System.out.println("Куби підсилення: " + powerCubes + " шт.");
            System.out.println("""
                    \nОберіть дію:
                    1 - Базова атака (-1 набій)""");
            System.out.println("2 - СУПЕР АТАКА" + (superCharge < 100 ? "(Не заряджено!)" : ""));
            System.out.print("""
                    3 - Захисний маневр (відновлення набоїв та +15% HP)
                    4 - Ризик: пошук Енергетичного куба (Power Cube)
                    Ваш хід: """);
            int currentMove = scanner.nextInt();
            switch (currentMove)
            {
                case 1:
                {
                    if (ammo > 0)
                    {
                        bossHP -= (int)((int)brawler[2] * (1 + 0.15 * powerCubes));
                        ammo--;
                        superCharge += 35;
                        if (superCharge > 100) { superCharge = 100; }
                        System.out.println(brawler[0] + " вдало атакує! Завдано " + (int)((int)brawler[2] * (1 + 0.15 * powerCubes)) + " шкоди!");
                        System.out.println("Заряд супера: +35% (Поточний: " + superCharge + ")");
                    }
                    else
                    {
                        System.out.println("Немає набоїв! Хід втрачено через перезарядку");
                        ammo++;
                    }
                    break;
                }
                case 2:
                {
                    if (superCharge == 100)
                    {
                        superCharge = 0;
                        bossHP -= (int)((int)brawler[3] * (1 + 0.15 * powerCubes));
                        System.out.println("СУПЕР-АТАКА! «" + brawler[5] +"»!");
                        System.out.println("Завдано " + (int)((int)brawler[3] * (1 + 0.15 * powerCubes)) + " шкоди! Боса відкинуто вибухом!");
                    }
                    else
                    {
                        System.out.println("Супер не спрацював!");
                    }
                    break;
                }
                case 3:
                {
                    ammo += 2;
                    if (ammo > 3) { ammo = 3; }
                    brawlerHP += ((int)brawler[1] / 100 * 15);
                    if (brawlerHP > (int)brawler[1]) { brawlerHP = (int)brawler[1];  }
                    System.out.println(brawler[0] + " відновлює 2 набої та 15% HP");
                    break;
                }
                case 4:
                {
                    if (Math.random() > 0.4)
                    {
                        powerCubes++;
                        System.out.println(brawler[0] + " знайшов енергетичний куб!");
                    }
                    else
                    {
                        System.out.println("пошуки пройшли даремно");
                    }
                    break;
                }
                default:
                {
                    System.out.println("боєць не діє");
                }
            };
            if (bossHP <= 0) { break; }
            double hpPercent = (double) bossHP / MAX_BOSS_HP * 100;
            if (hpPercent >= 30 && hpPercent <= 60) {
                phaseModifier = 1.3;
                bossPhaseString = " ANGRY! (+30% атаки)";
            } else if (hpPercent < 30) {
                phaseModifier = 1.7;
                bossPhaseString = " ENRAGED!!! (+70% атаки)";
            }
            if (currentMove == 2)
            {
                System.out.println("Хід Боса:");
                if (Math.random() > 0.15)
                {
                    if (brawler[0].equals("Шеллі"))
                    {
                        brawlerHP -= (int)(BOSS_DAMAGE * phaseModifier) / 2;
                        System.out.println("Робо-Бос завдає удару механічним кулаком! " + brawler[0] + " отримує " + (int)(BOSS_DAMAGE * phaseModifier) / 2 + " шкоди!");
                    }
                    else if (brawler[0].equals("Кольт"))
                    {
                        brawlerHP -= (int)(BOSS_DAMAGE * phaseModifier);
                        System.out.println("Робо-Бос завдає удару механічним кулаком! " + brawler[0] + " отримує " + (int)(BOSS_DAMAGE * phaseModifier) + " шкоди!");
                    }
                    else
                    {
                        System.out.println("Робо-бос приголомшений та пропускає хід");
                    }
                }
                else
                {
                    System.out.println("Робо-Бос промахнувся!");
                }
            }
            else if (currentMove != 3)
            {
                System.out.println("Хід Боса:");
                if (Math.random() > 0.15)
                {
                    brawlerHP -= (int)(BOSS_DAMAGE * phaseModifier);
                    System.out.println("Робо-Бос завдає удару механічним кулаком! " + brawler[0] + " отримує " + (int)(BOSS_DAMAGE * phaseModifier) + " шкоди!");
                }
                else
                {
                    System.out.println("Робо-Бос промахнувся!");
                }
            }

        }
        round--;
        if (bossHP <= 0)
        {
            System.out.println("\n======================================================");
            System.out.println("\uD83C\uDFC6 ПЕРЕМОГА! РОБО-БОСА ЗНИЩЕНО!");
            System.out.println("Раундів зіграно: " + round);
            System.out.println("Зібрано Power Cubes: " + powerCubes + " шт.");
            System.out.println("Нагорода: +10 Трофеїв \uD83C\uDFC6, 100 Starr Drops! Ви - Зірковий Гравець!");
            System.out.println("======================================================");
        }
        else
        {
            System.out.println("\n======================================================");
            System.out.println("ПОРАЗКА! ВАС ВИБИВ РОБО-БОС!");
            System.out.println("Раундів зіграно: " + round);
            System.out.println("Зібрано Power Cubes: " + powerCubes + " шт.");
            System.out.println("Нагорода: 0 Трофеїв \uD83C\uDFC6, 0 Starr Drops!");
            System.out.println("Робо-Бос святкує перемогу... А ви повертайтеся на арену! ");
            System.out.println("======================================================");
        }

        scanner.close();
    }
}
