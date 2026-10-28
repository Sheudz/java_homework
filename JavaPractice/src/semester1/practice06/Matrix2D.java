package semester1.practice06;

public class Matrix2D
{
    private int[][] grid = new int[0][0];

    public void setGrid(int[][] grid)
    {
        if (grid == null)
        {
            System.out.println("Матриця не задана");
            return;
        }
        for (int[] row : grid)
        {
            if (row == null)
            {
                System.out.println("Рядок матриці не заданий");
                return;
            }
        }
        this.grid = grid;
    }
    public void printMatrix()
    {
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[i].length; j++)
            {
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public int getTotalSum()
    {
        int sum = 0;
        for (int[] row : grid)
        {
            for (int number : row)
            {
                sum += number;
            }
        }
        return sum;
    }
    public int getRowSum(int rowIndex)
    {
        if (rowIndex < 0 || rowIndex >= grid.length)
        {
            System.out.println("Некоректний індекс рядка");
            return 0;
        }
        int sum = 0;
        for (int number : grid[rowIndex])
        {
            sum += number;
        }
        return sum;
    }
}
