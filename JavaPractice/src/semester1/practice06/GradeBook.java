package semester1.practice06;

public class GradeBook
{
    private String studentName;
    private int[] grades = new int[0];

    public void setData(String name, int[] g)
    {
        studentName = name;
        grades = (g == null) ? new int[0] : g;
    }
    public double getAverage()
    {
        if (grades.length == 0)
        {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades)
        {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
    public int getHighestGrade()
    {
        if (grades.length == 0)
        {
            return 0;
        }
        int max = grades[0];
        for (int grade : grades)
        {
            if (grade > max)
            {
                max = grade;
            }
        }
        return max;
    }
    public int getLowestGrade()
    {
        if (grades.length == 0)
        {
            return 0;
        }
        int min = grades[0];
        for (int grade : grades)
        {
            if (grade < min)
            {
                min = grade;
            }
        }
        return min;
    }
}
