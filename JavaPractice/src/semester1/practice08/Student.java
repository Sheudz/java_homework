package semester1.practice08;

public class Student
{
    private String name;
    private int course;
    private double gpa;

    public Student(String name, int course, double gpa)
    {
        setName(name);
        setCourse(course);
        setGpa(gpa);
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = (name == null || name.isBlank()) ? "Невідомо" : name;
    }
    public int getCourse()
    {
        return course;
    }
    public void setCourse(int course)
    {
        this.course = (course >= 1 && course <= 6) ? course : 1;
    }
    public double getGpa()
    {
        return gpa;
    }
    public void setGpa(double gpa)
    {
        this.gpa = (gpa >= 0 && gpa <= 100) ? gpa : 60.0;
    }
    @Override
    public String toString()
    {
        return "Student{name='" + name + "', course=" + course + ", gpa=" + gpa + "}";
    }
}
