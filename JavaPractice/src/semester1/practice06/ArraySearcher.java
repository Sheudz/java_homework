package semester1.practice06;

public class ArraySearcher
{
    private int[] data = new int[0];

    public void setData(int[] data)
    {
        this.data = (data == null) ? new int[0] : data;
    }
    public boolean contains(int target)
    {
        return findIndex(target) != -1;
    }
    public int findIndex(int target)
    {
        for (int i = 0; i < data.length; i++)
        {
            if (data[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
