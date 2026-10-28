package semester1.practice07;

public class Student
{
    private String name;
    private int age;
    private double gpa;

    Student(String name, int age, double gpa)
    {
        this.name = name;
        this.age = (age > 80 || age < 15) ? 18 : age;
        this.gpa = (gpa < 0.0 || gpa > 5.0) ? 0.0 : gpa;
    }

    public boolean isHonorStudent()
    {
        return gpa >= 4.5;
    }
    public void printStudent()
    {
        String status = (gpa >= 4.5) ? "Відмінник" : "Звичайний студент";
        System.out.println("Студент: " + name + " вік: " + age + " Середня оцінка: " + gpa + " Статус: " + status);
    }
}
