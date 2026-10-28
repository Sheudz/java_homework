package semester1.practice05;

import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;

public class Practice05 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        // TASK 1
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        numbers[0] = 10;
        numbers[2] = 30;
        numbers[numbers.length - 1] = 50;
        System.out.println(Arrays.toString(numbers));

        System.out.print("\n");

        // TASK 2
        String[] days = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"};
        System.out.println("Кількість днів: " + days.length);
        System.out.println("Перший день: " + days[0]);
        System.out.println("Останній день: " + days[days.length - 1]);
        days[5] = "Вихідний (Сб)";
        days[6] = "Вихідний (Нд)";
        System.out.println(Arrays.toString(days));

        System.out.print("\n");

        // TASK 3
        double[] prices = {120.50, 45.00, 890.99, 15.30, 420.00};
        System.out.println("До знижки: " + Arrays.toString(prices));
        prices[2] = prices[2] * 0.8;
        System.out.println("Після знижки: " + Arrays.toString(prices));

        System.out.print("\n");

        // TASK 4
        int n;
        do
        {
            System.out.print("Введіть розмір масиву N (більше 0): ");
            n = scanner.nextInt();
        } while (n <= 0);
        int[] sequence = new int[n];
        for (int i = 0; i < sequence.length; i++)
        {
            sequence[i] = i + 1;
        }
        System.out.println(Arrays.toString(sequence));

        System.out.print("\n");

        // TASK 5
        int[] values = {4, 8, 15, 16, 23, 42};
        for (int i = values.length - 1; i >= 0; i--)
        {
            System.out.print(values[i]);
            if (i > 0)
            {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("\n");

        // TASK 6
        int[] powers = new int[10];
        powers[0] = 1;
        for (int i = 1; i < powers.length; i++)
        {
            powers[i] = powers[i - 1] * 2;
        }
        System.out.println(Arrays.toString(powers));

        System.out.print("\n");

        // TASK 7
        int[] original = {3, 7, 1, 9, 4};
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++)
        {
            copy[i] = original[i];
        }
        copy[0] = 999;
        System.out.println("Оригінал: " + Arrays.toString(original));
        System.out.println("Копія: " + Arrays.toString(copy));

        System.out.print("\n");

        // TASK 8
        int[] grades = {95, 84, 70, 99, 65, 88, 92};
        int sum = 0;
        for (int grade : grades)
        {
            sum += grade;
        }
        double average = (double) sum / grades.length;
        System.out.println("Сума: " + sum + ", Середній бал: " + average);

        System.out.print("\n");

        // TASK 9
        int[] temps = {18, 21, 15, 24, 13, 27, 20};
        int min = temps[0];
        int max = temps[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < temps.length; i++)
        {
            if (temps[i] < min)
            {
                min = temps[i];
                minIndex = i;
            }
            if (temps[i] > max)
            {
                max = temps[i];
                maxIndex = i;
            }
        }
        System.out.println("Мінімум: " + min + " Індекс дня: " + minIndex);
        System.out.println("Максимум: " + max + " Індекс дня: " + maxIndex);

        System.out.print("\n");

        // TASK 10
        int[] data = {12, -5, 0, 43, -19, 0, -2, 8, 0, 15};
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (int number : data)
        {
            if (number > 0)
            {
                positiveCount++;
            }
            else if (number < 0)
            {
                negativeCount++;
            }
            else
            {
                zeroCount++;
            }
        }
        System.out.println("Додатних: " + positiveCount + " Від'ємних: " + negativeCount + " Нулів: " + zeroCount);

        System.out.print("\n");

        // TASK 11
        int[] mixedNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evenCount = 0;
        int oddSum = 0;
        for (int number : mixedNumbers)
        {
            if (number % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddSum += number;
            }
        }
        System.out.println("Парних чисел: " + evenCount + " Сума непарних: " + oddSum);

        System.out.print("\n");

        // TASK 12
        int[] students = {1042, 2031, 3055, 4018, 5099};
        System.out.print("Введіть номер залікової книжки: ");
        int target = scanner.nextInt();
        int foundIndex = -1;
        for (int i = 0; i < students.length; i++)
        {
            if (students[i] == target)
            {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1)
        {
            System.out.println("Студента знайдено, індекс: " + foundIndex);
        }
        else
        {
            System.out.println("Студента з таким номером не знайдено");
        }

        System.out.print("\n");

        // TASK 13
        int[] rolls = {3, 6, 2, 6, 1, 4, 6, 5, 2, 6};
        do
        {
            System.out.print("Введіть число від 1 до 6: ");
            target = scanner.nextInt();
        } while (target < 1 || target > 6);
        int count = 0;
        for (int roll : rolls)
        {
            if (roll == target)
            {
                count++;
            }
        }
        System.out.println("Число " + target + " випало разів: " + count);

        System.out.print("\n");

        // TASK 14
        int[] departmentSalaries = {18000, 25000, 32000, 15000, 41000, 29000};
        sum = 0;
        for (int salary : departmentSalaries)
        {
            sum += salary;
        }
        average = (double) sum / departmentSalaries.length;
        System.out.println("Середня зарплата: " + average);
        System.out.print("Вищі за середню: ");
        for (int salary : departmentSalaries)
        {
            if (salary > average)
            {
                System.out.print(salary + " ");
            }
        }
        System.out.println();

        System.out.print("\n");

        // TASK 15
        double[] stockPrices = {42.5, 41.8, 44.1, 40.9, 43.6, 45.0};
        double minPrice = stockPrices[0];
        double maxPrice = stockPrices[0];
        for (double price : stockPrices)
        {
            if (price < minPrice)
            {
                minPrice = price;
            }
            if (price > maxPrice)
            {
                maxPrice = price;
            }
        }
        System.out.printf(Locale.US, "Розмах коливань: %.2f%n", maxPrice - minPrice);

        System.out.print("\n");

        // TASK 16
        String[] cities = {"Київ", "Львів", "Харків", "Одеса", "Дніпро"};
        for (String city : cities)
        {
            System.out.println("Ласкаво просимо до міста " + city + "!");
        }

        System.out.print("\n");

        // TASK 17
        double[] salaries = {20000.0, 25000.0, 18000.0, 30000.0};
        for (int i = 0; i < salaries.length; i++)
        {
            salaries[i] *= 1.10;
        }
        System.out.println(Arrays.toString(salaries));

        System.out.print("\n");

        // TASK 18
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr.length / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));

        System.out.print("\n");

        // TASK 19
        int[] base = {2, 4, 6, 8, 10};
        int[] squares = new int[base.length];
        for (int i = 0; i < base.length; i++)
        {
            squares[i] = base[i] * base[i];
        }
        System.out.println("Числа: " + Arrays.toString(base));
        System.out.println("Квадрати: " + Arrays.toString(squares));

        System.out.print("\n");

        // TASK 20
        int[] sortedNumbers = {1, 3, 3, 7, 10};
        boolean isSorted = true;
        for (int i = 0; i < sortedNumbers.length - 1; i++)
        {
            if (sortedNumbers[i] > sortedNumbers[i + 1])
            {
                isSorted = false;
                break;
            }
        }
        System.out.println("Масив відсортований: " + isSorted);

        System.out.print("\n");

        // TASK 21
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6, 7};
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++)
        {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++)
        {
            c[a.length + i] = b[i];
        }
        System.out.println(Arrays.toString(c));

        System.out.print("\n");

        // TASK 22
        int[] test = {45, 12, 89, 3, 27};
        System.out.println(Arrays.toString(test));
        Arrays.sort(test);
        System.out.println(Arrays.toString(test));
        Arrays.fill(test, -1);
        System.out.println(Arrays.toString(test));

        System.out.print("\n");

        // TASK 23
        int[][] table = new int[3][3];
        for (int i = 0; i < table.length; i++)
        {
            for (int j = 0; j < table[i].length; j++)
            {
                table[i][j] = i * 3 + j + 1;
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("\n");

        // TASK 24
        int[][] matrix = {
            {10, 20, 30, 40},
            {50, 60, 70, 80}
        };
        System.out.println("Рядків: " + matrix.length);
        System.out.println("Стовпчиків: " + matrix[0].length);
        System.out.println("Лівий верхній: " + matrix[0][0]);
        System.out.println("Правий верхній: " + matrix[0][matrix[0].length - 1]);
        System.out.println("Лівий нижній: " + matrix[matrix.length - 1][0]);
        System.out.println("Правий нижній: " + matrix[matrix.length - 1][matrix[0].length - 1]);

        System.out.print("\n");

        // TASK 25
        int[][] grid = new int[3][4];
        int counter = 1;
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[i].length; j++)
            {
                grid[i][j] = counter++;
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("\n");

        // TASK 26
        int[][] randomGrid = new int[4][3];
        for (int i = 0; i < randomGrid.length; i++)
        {
            for (int j = 0; j < randomGrid[i].length; j++)
            {
                randomGrid[i][j] = (int) (Math.random() * 90) + 10;
            }
        }
        System.out.println(Arrays.deepToString(randomGrid));
        for (int i = 0; i < randomGrid.length; i++)
        {
            for (int j = 0; j < randomGrid[i].length; j++)
            {
                System.out.print(randomGrid[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("\n");

        // TASK 27
        int[][] multTable = new int[9][9];
        for (int i = 0; i < multTable.length; i++)
        {
            for (int j = 0; j < multTable[i].length; j++)
            {
                multTable[i][j] = (i + 1) * (j + 1);
                System.out.printf("%4d", multTable[i][j]);
            }
            System.out.println();
        }

        System.out.print("\n");

        // TASK 28
        int[][] identity = new int[5][5];
        for (int i = 0; i < identity.length; i++)
        {
            for (int j = 0; j < identity[i].length; j++)
            {
                identity[i][j] = (i == j) ? 1 : 0;
                System.out.print(identity[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("\n");

        // TASK 29
        int[][] modified = new int[4][4];
        for (int i = 0; i < modified.length; i++)
        {
            Arrays.fill(modified[i], 1);
        }
        Arrays.fill(modified[1], 0);
        for (int i = 0; i < modified.length; i++)
        {
            modified[i][2] = 7;
        }
        for (int i = 0; i < modified.length; i++)
        {
            for (int j = 0; j < modified[i].length; j++)
            {
                System.out.print(modified[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("\n");

        // TASK 30
        matrix = new int[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        sum = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                sum += matrix[i][j];
            }
        }
        int elementCount = matrix.length * matrix[0].length;
        average = (double) sum / elementCount;
        System.out.println("Сума: " + sum + " Кількість: " + elementCount + " Середнє: " + average);

        System.out.print("\n");

        // TASK 31
        int[] rowSums = new int[grid.length];
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[i].length; j++)
            {
                rowSums[i] += grid[i][j];
            }
            System.out.println("Рядок " + i + ": сума = " + rowSums[i]);
        }

        System.out.print("\n");

        // TASK 32
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[row].length; col++)
            {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.println("Суми стовпчиків:");
        for (int col = 0; col < matrix[0].length; col++)
        {
            int columnSum = 0;
            for (int row = 0; row < matrix.length; row++)
            {
                columnSum += matrix[row][col];
            }
            System.out.print(columnSum + "\t");
        }
        System.out.println();

        System.out.print("\n");

        // TASK 33
        int[][] mixedMatrix = {
            {-5, 8, 3, -1},
            {12, -7, 25, 4},
            {6, 0, -9, 15}
        };
        max = mixedMatrix[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for (int row = 0; row < mixedMatrix.length; row++)
        {
            for (int col = 0; col < mixedMatrix[row].length; col++)
            {
                if (mixedMatrix[row][col] > max)
                {
                    max = mixedMatrix[row][col];
                    maxRow = row;
                    maxCol = col;
                }
            }
        }
        System.out.println("Максимум: " + max + " у комірці [" + maxRow + ", " + maxCol + "]");

        System.out.print("\n");

        // TASK 34
        int[][] diagonalMatrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int mainSum = 0;
        int secondarySum = 0;
        for (int i = 0; i < diagonalMatrix.length; i++)
        {
            mainSum += diagonalMatrix[i][i];
            secondarySum += diagonalMatrix[i][diagonalMatrix.length - 1 - i];
        }
        System.out.println("Головна діагональ: " + mainSum);
        System.out.println("Побічна діагональ: " + secondarySum);
        if (mainSum > secondarySum)
        {
            System.out.println("Сума головної діагоналі більша");
        }
        else if (mainSum < secondarySum)
        {
            System.out.println("Сума побічної діагоналі більша");
        }
        else
        {
            System.out.println("Суми діагоналей рівні");
        }

        System.out.print("\n");

        // TASK 35
        int[][] transposed = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                transposed[j][i] = matrix[i][j];
            }
        }
        System.out.println("Початкова\t\tТранспонована");
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\t");
            for (int j = 0; j < transposed[i].length; j++)
            {
                System.out.print(transposed[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("\n");

        // TASK 36
        int[][] ladder = new int[4][];
        for (int i = 0; i < ladder.length; i++)
        {
            ladder[i] = new int[i + 1];
            for (int j = 0; j < ladder[i].length; j++)
            {
                ladder[i][j] = i;
                System.out.print(ladder[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\n");

        // TASK 37
        String[][] weekSchedule = new String[5][];
        weekSchedule[0] = new String[]{"Вища математика", "Основи програмування", "Фізика"};
        weekSchedule[1] = new String[]{"Англійська мова", "Історія України"};
        weekSchedule[2] = new String[]{"Основи програмування", "Основи програмування", "Бази даних", "Фізвиховання"};
        weekSchedule[3] = new String[]{"Дискретна математика"};
        weekSchedule[4] = new String[]{"Філософія", "Основи алгоритмізації", "Практикум"};
        for (int i = 0; i < weekSchedule.length; i++)
        {
            System.out.println(days[i] + " Кількість пар: " + weekSchedule[i].length);
            for (int j = 0; j < weekSchedule[i].length; j++)
            {
                System.out.println((j + 1) + ". " + weekSchedule[i][j]);
            }
        }

        System.out.print("\n");

        // TASK 38
        int[][] pascal = new int[5][];
        for (int i = 0; i < pascal.length; i++)
        {
            pascal[i] = new int[i + 1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;
            for (int j = 1; j < i; j++)
            {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
            for (int value : pascal[i])
            {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.print("\n");

        // TASK 39
        int[][][] cube = new int[3][3][3];
        for (int x = 0; x < cube.length; x++)
        {
            System.out.println("--- Шар " + x + " ---");
            for (int y = 0; y < cube[x].length; y++)
            {
                for (int z = 0; z < cube[x][y].length; z++)
                {
                    cube[x][y][z] = x + y + z;
                    System.out.print(cube[x][y][z] + "\t");
                }
                System.out.println();
            }
        }

        System.out.print("\n");

        // TASK 40
        String[] weatherCities = {"Київ", "Львів", "Одеса"};
        double[][][] weather = new double[3][7][2];
        for (int city = 0; city < weather.length; city++)
        {
            for (int day = 0; day < weather[city].length; day++)
            {
                weather[city][day][0] = 16 + city * 2 + day % 3;
                weather[city][day][1] = 8 + city * 2 - day % 2;
            }
        }
        double coldestNight = weather[0][0][1];
        int coldestCity = 0;
        int coldestDay = 0;
        for (int city = 0; city < weather.length; city++)
        {
            double daySum = 0;
            for (int day = 0; day < weather[city].length; day++)
            {
                daySum += weather[city][day][0];
                if (weather[city][day][1] < coldestNight)
                {
                    coldestNight = weather[city][day][1];
                    coldestCity = city;
                    coldestDay = day;
                }
            }
            System.out.printf(Locale.US, "%s: середня денна температура %.2f°C%n", weatherCities[city], daySum / weather[city].length);
        }
        System.out.println("Найхолодніша ніч: " + coldestNight + "°C Місто: " + weatherCities[coldestCity] + " День: " + (coldestDay + 1));

        scanner.close();
    }
}
