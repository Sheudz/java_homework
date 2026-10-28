package semester1.practice08;

public class Person
{
    private String fullName;
    private int birthYear;

    public Person(String fullName, int birthYear)
    {
        this.fullName = fullName;
        this.birthYear = Math.max(0, birthYear);
    }
    public int getAge(int currentYear)
    {
        return Math.max(0, currentYear - birthYear);
    }
    @Override
    public String toString()
    {
        return "Person{name='" + fullName + "', birthYear=" + birthYear + "}";
    }
}

class UniversityStudent extends Person
{
    private String studentId;
    private String major;
    private int scholarship;

    public UniversityStudent(String fullName, int birthYear, String studentId, String major, int scholarship)
    {
        super(fullName, birthYear);
        this.studentId = studentId;
        this.major = major;
        this.scholarship = Math.max(0, scholarship);
    }
    @Override
    public String toString()
    {
        return "UniversityStudent{" + super.toString() + ", id='" + studentId + "', major='" + major + "', scholarship=" + scholarship + "}";
    }
}

class Professor extends Person
{
    private String academicTitle;
    private int publicationsCount;

    public Professor(String fullName, int birthYear, String academicTitle, int publicationsCount)
    {
        super(fullName, birthYear);
        this.academicTitle = academicTitle;
        this.publicationsCount = Math.max(0, publicationsCount);
    }
    @Override
    public String toString()
    {
        return "Professor{" + super.toString() + ", title='" + academicTitle + "', publications=" + publicationsCount + "}";
    }
}
