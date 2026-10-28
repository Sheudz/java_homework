package semester1.practice06;

public class CurrencyExchange
{
    public double usdRate = 41.5;

    public double toUSD(double uah)
    {
        if (usdRate <= 0)
        {
            System.out.println("Некоректний курс");
            return 0.0;
        }
        return uah / usdRate;
    }
    public double toUAH(double usd)
    {
        if (usdRate <= 0)
        {
            System.out.println("Некоректний курс");
            return 0.0;
        }
        return usd * usdRate;
    }
}
