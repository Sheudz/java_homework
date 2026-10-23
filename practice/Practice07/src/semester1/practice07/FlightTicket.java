package semester1.practice07;

public class FlightTicket
{
    private String ticketNumber;
    private String passengerName;
    private String flightNumber;
    private String departureCity;
    private String arrivalCity;
    private String seatNumber;
    private boolean hasBaggage;

    FlightTicket(String ticketNumber, String passengerName, String flightNumber, String departureCity, String arrivalCity, String seatNumber, boolean hasBaggage)
    {
        this.ticketNumber = ticketNumber;
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.seatNumber = seatNumber;
        this.hasBaggage = hasBaggage;
    }
    public FlightTicket(String ticketNumber, String passengerName, String flightNumber, String departureCity, String arrivalCity)
    {
        this(ticketNumber, passengerName, flightNumber, departureCity, arrivalCity, "UNASSIGNED", false);
    }
    public void assignSeat(String seat)
    {
        this.seatNumber = seat;
    }
    public void printBoardingPass()
    {
        System.out.println("Квиток: " + ticketNumber + " Пасажир: " + passengerName + " Рейс: " + flightNumber);
        System.out.println(departureCity + " -> " + arrivalCity + " Місце: " + seatNumber + " Багаж: " + hasBaggage);
    }
}
