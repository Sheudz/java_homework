package semester1.practice06;

public class MatrixDiagonals
{
    private int[][] matrix = new int[0][0];

    public void setMatrix(int[][] matrix)
    {
        if (matrix == null)
        {
            System.out.println("Матриця не задана");
            return;
        }
        for (int[] row : matrix)
        {
            if (row == null || row.length != matrix.length)
            {
                System.out.println("Матриця має бути квадратною");
                return;
            }
        }
        this.matrix = matrix;
    }
    public int getMainDiagonalSum()
    {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            sum += matrix[i][i];
        }
        return sum;
    }
    public int getAntiDiagonalSum()
    {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            sum += matrix[i][matrix.length - 1 - i];
        }
        return sum;
    }
    public boolean isDiagonalSymmetric()
    {
        return getMainDiagonalSum() == getAntiDiagonalSum();
    }
}
