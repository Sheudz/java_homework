package semester1.practice09;

public class PassengerTrain
{
    private final String route;
    private final TrainCarriage[] carriages;
    private int carriageCount;

    public PassengerTrain(String route, int capacity)
    {
        this.route = route;
        carriages = new TrainCarriage[capacity];
    }
    public boolean attachCarriage(TrainCarriage c)
    {
        if (c == null || carriageCount == carriages.length)
        {
            return false;
        }
        carriages[carriageCount++] = c;
        return true;
    }
    public int getTotalFreeSeats()
    {
        int seats = 0;
        for (int i = 0; i < carriageCount; i++)
        {
            seats += carriages[i].getFreeSeats();
        }
        return seats;
    }
    public boolean bookTicketsInCarriage(int carriageNumber, int seatsToBook)
    {
        for (int i = 0; i < carriageCount; i++)
        {
            if (carriages[i].getCarriageNumber() == carriageNumber)
            {
                return carriages[i].bookSeats(seatsToBook);
            }
        }
        return false;
    }
    @Override
    public String toString()
    {
        return route + " carriages=" + carriageCount + " freeSeats=" + getTotalFreeSeats();
    }
}

class TrainCarriage
{
    private final int carriageNumber;
    private final String type;
    private final int totalSeats;
    private int occupiedSeats;

    public TrainCarriage(int carriageNumber, String type, int totalSeats)
    {
        this.carriageNumber = carriageNumber;
        this.type = type;
        this.totalSeats = totalSeats;
    }
    public int getCarriageNumber()
    {
        return carriageNumber;
    }
    public int getFreeSeats()
    {
        return totalSeats - occupiedSeats;
    }
    public boolean bookSeats(int amount)
    {
        if (amount > 0 && amount <= getFreeSeats())
        {
            occupiedSeats += amount;
            return true;
        }
        return false;
    }
    @Override
    public String toString()
    {
        return carriageNumber + " " + type + " seats=" + occupiedSeats + "/" + totalSeats;
    }
}
