package semester1.practice08;

public class User
{
    private int id;
    private String email;

    public User(int id, String email)
    {
        this.id = id;
        this.email = email;
    }
    @Override
    public String toString()
    {
        return "User{id=" + id + ", email='" + email + "'}";
    }
}

class StudentUser extends User
{
    private String groupCode;
    private double gpa;

    public StudentUser(int id, String email, String groupCode, double gpa)
    {
        super(id, email);
        this.groupCode = groupCode;
        this.gpa = (gpa >= 0 && gpa <= 100) ? gpa : 0;
    }
    public double getGpa()
    {
        return gpa;
    }
    @Override
    public String toString()
    {
        return "StudentUser{" + super.toString() + ", group='" + groupCode + "', gpa=" + gpa + "}";
    }
}

class PostgraduateStudent extends StudentUser
{
    private String thesisTopic;
    private String supervisorName;

    public PostgraduateStudent(int id, String email, String groupCode, double gpa, String thesisTopic, String supervisorName)
    {
        super(id, email, groupCode, gpa);
        this.thesisTopic = thesisTopic;
        this.supervisorName = supervisorName;
    }
    public boolean canDefendThesis()
    {
        return getGpa() >= 85 && thesisTopic != null && !thesisTopic.isBlank();
    }
    @Override
    public String toString()
    {
        return "PostgraduateStudent{" + super.toString() + ", thesis='" + thesisTopic + "', supervisor='" + supervisorName + "', canDefend=" + canDefendThesis() + "}";
    }
}
