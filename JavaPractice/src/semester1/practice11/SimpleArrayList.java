package semester1.practice11;

public class SimpleArrayList
{
    private Object[] data = new Object[10];
    private int size = 0;

    public void add(Object element)
    {
        if (size == data.length)
        {
            Object[] newData = new Object[data.length + (data.length >> 1)];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
        data[size++] = element;
    }
    public Object get(int index)
    {
        return data[index];
    }
    public int size()
    {
        return size;
    }
    public int getCapacity()
    {
        return data.length;
    }
}
