package semester1.practice08;

public class CinemaHall
{
    private String hallName;
    protected boolean[][] seats;
    protected double baseTicketPrice;

    public CinemaHall(String hallName, int rows, int cols, double baseTicketPrice)
    {
        this.hallName = hallName;
        seats = new boolean[Math.max(1, rows)][Math.max(1, cols)];
        this.baseTicketPrice = Math.max(0, baseTicketPrice);
    }
    public boolean bookSeat(int row, int col)
    {
        if (row < 0 || row >= seats.length || col < 0 || col >= seats[row].length || seats[row][col])
        {
            return false;
        }
        seats[row][col] = true;
        return true;
    }
    public int getOccupiedCount()
    {
        int count = 0;
        for (boolean[] row : seats)
        {
            for (boolean occupied : row)
            {
                if (occupied)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public double calculateRevenue()
    {
        return getOccupiedCount() * baseTicketPrice;
    }
    @Override
    public String toString()
    {
        String result = "Зал: " + hallName + "\n";
        for (int i = 0; i < seats.length; i++)
        {
            for (int j = 0; j < seats[i].length; j++)
            {
                result += seats[i][j] ? "[X]" : "[O]";
            }
            result += "\n";
        }
        return result + "Зайнято: " + getOccupiedCount() + " Виручка: " + calculateRevenue();
    }
}

class VipCinemaHall extends CinemaHall
{
    private double complimentaryBarCost;

    public VipCinemaHall(String hallName, int rows, int cols, double baseTicketPrice, double complimentaryBarCost)
    {
        super(hallName, rows, cols, baseTicketPrice);
        this.complimentaryBarCost = Math.max(0, complimentaryBarCost);
    }
    @Override
    public double calculateRevenue()
    {
        double revenue = super.calculateRevenue();
        for (boolean occupied : seats[seats.length - 1])
        {
            if (occupied)
            {
                revenue += complimentaryBarCost;
            }
        }
        return revenue;
    }
    @Override
    public String toString()
    {
        return "VIP " + super.toString() + " Доплата за бар в останньому ряду: " + complimentaryBarCost;
    }
}
