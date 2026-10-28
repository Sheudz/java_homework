package semester1.practice08;

public class Developer extends Employee
{
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage)
    {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public String toString()
    {
        return "Developer{" + super.toString() + ", language='" + programmingLanguage + "'}";
    }
}
