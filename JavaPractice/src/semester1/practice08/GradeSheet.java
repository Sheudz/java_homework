package semester1.practice08;

import java.util.Arrays;

public class GradeSheet
{
    private String studentName;
    protected int[] grades;

    public GradeSheet(String studentName, int[] grades)
    {
        this.studentName = studentName;
        this.grades = (grades == null) ? new int[0] : Arrays.copyOf(grades, grades.length);
    }
    public double calculateScore()
    {
        double sum = 0;
        for (int grade : grades)
        {
            sum += grade;
        }
        return (grades.length == 0) ? 0 : sum / grades.length;
    }
    @Override
    public String toString()
    {
        return "GradeSheet{student='" + studentName + "', grades=" + Arrays.toString(grades) + ", score=" + calculateScore() + "}";
    }
}

class WeightedGradeSheet extends GradeSheet
{
    private double[] weights;

    public WeightedGradeSheet(String studentName, int[] grades, double[] weights)
    {
        super(studentName, grades);
        this.weights = new double[this.grades.length];
        for (int i = 0; i < this.weights.length; i++)
        {
            this.weights[i] = (weights != null && weights.length == this.weights.length && Double.isFinite(weights[i]) && weights[i] >= 0) ? weights[i] : 1;
        }
    }
    @Override
    public double calculateScore()
    {
        double weightedSum = 0;
        double weightSum = 0;
        for (int i = 0; i < grades.length; i++)
        {
            weightedSum += grades[i] * weights[i];
            weightSum += weights[i];
        }
        return (weightSum == 0) ? 0 : weightedSum / weightSum;
    }
    @Override
    public String toString()
    {
        return "WeightedGradeSheet{" + super.toString() + ", weights=" + Arrays.toString(weights) + "}";
    }
}
