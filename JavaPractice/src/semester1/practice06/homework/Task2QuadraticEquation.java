package semester1.practice06.homework;

public class Task2QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("=== РОЗВ'ЯЗУВАЧ КВАДРАТНИХ РІВНЯНЬ ===");

        QuadraticEquation twoRoots = new QuadraticEquation();
        twoRoots.setCoefficients(1, -5, 6);
        System.out.println("Тест 1: два різні корені");
        twoRoots.printSolution();

        QuadraticEquation oneRoot = new QuadraticEquation();
        oneRoot.setCoefficients(1, -4, 4);
        System.out.println("\nТест 2: один корінь");
        oneRoot.printSolution();

        QuadraticEquation noRoots = new QuadraticEquation();
        noRoots.setCoefficients(1, 2, 5);
        System.out.println("\nТест 3: без дійсних коренів");
        noRoots.printSolution();

        QuadraticEquation invalidEquation = new QuadraticEquation();
        System.out.println("\nТест 4: перевірка a = 0");
        invalidEquation.setCoefficients(0, -5, 6);
        invalidEquation.printSolution();
    }
}

class QuadraticEquation {
    private double a = 1.0;
    private double b;
    private double c;

    public void setCoefficients(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Увага: коефіцієнт 'a' не може дорівнювати 0 (це лінійне рівняння)!");
            a = 1.0;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public boolean hasRealRoots() {
        return getDiscriminant() >= 0;
    }

    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return Double.NaN;
        }
        return (-b + Math.sqrt(discriminant)) / (2 * a);
    }

    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return Double.NaN;
        }
        return (-b - Math.sqrt(discriminant)) / (2 * a);
    }

    public void printSolution() {
        System.out.println("Рівняння: " + a + "*x^2 + (" + b + ")*x + (" + c + ") = 0");

        double discriminant = getDiscriminant();
        System.out.println("Дискримінант D = " + discriminant);
        if (discriminant > 0) {
            System.out.println("Рівняння має 2 дійсні корені:");
            System.out.println("x1 = " + getRoot1());
            System.out.println("x2 = " + getRoot2());
        } else if (discriminant == 0) {
            System.out.println("Рівняння має один дійсний корінь:");
            System.out.println("x = " + getRoot1());
        } else {
            System.out.println("Рівняння не має дійсних коренів (D < 0)");
        }
    }
}
