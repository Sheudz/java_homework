package semester1.practice08;

public class Gamer
{
    private String nickname;
    private int hoursPlayed;

    public Gamer(String nickname, int hoursPlayed)
    {
        this.nickname = nickname;
        this.hoursPlayed = Math.max(0, hoursPlayed);
    }
    @Override
    public String toString()
    {
        return "Gamer{nickname='" + nickname + "', hours=" + hoursPlayed + "}";
    }
}

class ProEsportsPlayer extends Gamer
{
    private String teamName;
    private double prizeMoneyUSD;
    private int tournamentsWon;

    public ProEsportsPlayer(String nickname, int hoursPlayed, String teamName, double prizeMoneyUSD, int tournamentsWon)
    {
        super(nickname, hoursPlayed);
        this.teamName = teamName;
        this.prizeMoneyUSD = Math.max(0, prizeMoneyUSD);
        this.tournamentsWon = Math.max(0, tournamentsWon);
    }
    public double getAveragePrizePerWin()
    {
        return (tournamentsWon == 0) ? 0 : prizeMoneyUSD / tournamentsWon;
    }
    @Override
    public String toString()
    {
        return "ProEsportsPlayer{" + super.toString() + ", team='" + teamName + "', prize=" + prizeMoneyUSD + ", wins=" + tournamentsWon + ", average=" + getAveragePrizePerWin() + "}";
    }
}
