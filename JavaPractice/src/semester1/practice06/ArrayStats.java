package semester1.practice06;

public class ArrayStats
{
    private int[] numbers = new int[0];

    public void setNumbers(int[] nums)
    {
        numbers = (nums == null) ? new int[0] : nums;
    }
    public int countEvens()
    {
        int count = 0;
        for (int number : numbers)
        {
            if (number % 2 == 0)
            {
                count++;
            }
        }
        return count;
    }
    public int countOdds()
    {
        int count = 0;
        for (int number : numbers)
        {
            if (number % 2 != 0)
            {
                count++;
            }
        }
        return count;
    }
    public int calculateSum()
    {
        int sum = 0;
        for (int number : numbers)
        {
            sum += number;
        }
        return sum;
    }
}
