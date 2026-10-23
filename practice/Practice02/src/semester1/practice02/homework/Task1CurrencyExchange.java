package semester1.practice02.homework;

public class Task1CurrencyExchange
{
    public static void main(String[] args)
    {
        double usdAmount = 250.0;
        final double EXCHANGE_RATE = 41.25;
        final double COMMISSION_PERCENT = 1.5;

        double uahAmount = usdAmount * EXCHANGE_RATE;
        double finalsum = uahAmount - (usdAmount * EXCHANGE_RATE * (COMMISSION_PERCENT / 100));

        System.out.println("================ КВИТАНЦІЯ ОБМІНУ ================");
        System.out.println("Сумма до обміну:           " + usdAmount + " USD");
        System.out.println("Курс валют:                " + EXCHANGE_RATE + " UAH/USD");
        System.out.println("Нараховано до комісії:     " + uahAmount + " UAH");
        System.out.println("Комісія банку (1.5%):      " + uahAmount  * (COMMISSION_PERCENT / 100) + " UAH");
        System.out.println("--------------------------------------------------");
        System.out.println("Чиста сума до видачі:      " + finalsum + " UAH");
        System.out.println("До видачі готівкою:        " + Math.round(finalsum) + " UAH");
        System.out.println("==================================================");
    }
}
