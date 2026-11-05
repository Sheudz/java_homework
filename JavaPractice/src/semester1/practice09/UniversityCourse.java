package semester1.practice09;

public class UniversityCourse
{
    private final String courseTitle;
    private final CourseModule[] modules;
    private int moduleCount;

    public UniversityCourse(String courseTitle, int capacity)
    {
        this.courseTitle = courseTitle;
        modules = new CourseModule[capacity];
    }
    public boolean addModule(CourseModule module)
    {
        if (module == null || moduleCount == modules.length)
        {
            return false;
        }
        modules[moduleCount++] = module;
        return true;
    }
    public double getEctsCredits()
    {
        double hours = 0;
        for (int i = 0; i < moduleCount; i++)
        {
            hours += modules[i].getTotalHours();
        }
        return hours / 30;
    }
    public boolean hasValidTotalScore()
    {
        double score = 0;
        for (int i = 0; i < moduleCount; i++)
        {
            score += modules[i].getMaxScore();
        }
        return Math.abs(score - 100) < 1e-9;
    }
    @Override
    public String toString()
    {
        return courseTitle + " ECTS=" + getEctsCredits() + " Сума балів 100: " + hasValidTotalScore();
    }
}

class CourseModule
{
    private final String topic;
    private final int lectureHours;
    private final int practiceHours;
    private double maxScore;

    public CourseModule(String topic, int lectureHours, int practiceHours, double maxScore)
    {
        this.topic = topic;
        this.lectureHours = lectureHours;
        this.practiceHours = practiceHours;
        this.maxScore = maxScore;
    }
    public double getTotalHours()
    {
        return (double) lectureHours + practiceHours;
    }
    public double getMaxScore()
    {
        return maxScore;
    }
    @Override
    public String toString()
    {
        return topic + " hours=" + getTotalHours() + " score=" + maxScore;
    }
}
