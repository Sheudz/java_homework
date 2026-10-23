package semester1.practice06.homework;

public class Task1Fraction {
    public static void main(String[] args) {
        System.out.println("=== КАЛЬКУЛЯТОР ЗВИЧАЙНИХ ДРОБІВ ===");

        Fraction fraction = new Fraction();
        fraction.setValues(8, 12);
        System.out.print("Дріб 1: ");
        fraction.printFraction();

        fraction.simplify();
        System.out.print("Після скорочення: ");
        fraction.printFraction();
        System.out.println("Десятковий вигляд: " + fraction.toDecimal());

        System.out.println("\nДодаємо дріб 3/4 до 2/3...");
        fraction.add(3, 4);
        System.out.print("Результат додавання: ");
        fraction.printFraction();
        System.out.println("Десятковий вигляд: " + fraction.toDecimal());

        Fraction negativeFraction = new Fraction();
        negativeFraction.setValues(6, -8);
        negativeFraction.simplify();
        System.out.print("\nДріб із від'ємним знаменником (6/-8): ");
        negativeFraction.printFraction();

        Fraction wholeNumber = new Fraction();
        wholeNumber.setValues(4, 2);
        wholeNumber.simplify();
        System.out.print("Ціле число (4/2): ");
        wholeNumber.printFraction();

        Fraction invalidFraction = new Fraction();
        System.out.println("\nПеревірка нульового знаменника (5/0):");
        invalidFraction.setValues(5, 0);
        invalidFraction.printFraction();
    }
}

class Fraction {
    private int numerator;
    private int denominator = 1;

    public void setValues(int num, int den) {
        if (den == 0) {
            System.out.println("Помилка: знаменник не може дорівнювати 0!");
            den = 1;
        }

        if (den < 0) {
            numerator = -num;
            denominator = -den;
        } else {
            numerator = num;
            denominator = den;
        }
    }

    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void simplify() {
        int divisor = gcd(numerator, denominator);
        numerator /= divisor;
        denominator /= divisor;
    }

    public double toDecimal() {
        return (double) numerator / denominator;
    }

    public void add(int otherNum, int otherDen) {
        if (otherDen == 0) {
            System.out.println("Помилка: знаменник не може дорівнювати 0!");
            otherDen = 1;
        }

        int newNum = numerator * otherDen + otherNum * denominator;
        int newDen = denominator * otherDen;
        setValues(newNum, newDen);
        simplify();
    }

    public void printFraction() {
        if (denominator == 1) {
            System.out.println(numerator);
        } else {
            System.out.println(numerator + "/" + denominator);
        }
    }
}
