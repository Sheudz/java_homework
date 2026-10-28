package semester1.practice07;

public class StringUtils
{
    private StringUtils() {}

    public static boolean isPalindrome(String s)
    {
        String text = s.toLowerCase().replace(" ", "");
        return text.equals(reverse(text));
    }
    public static String reverse(String s)
    {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--)
        {
            result += s.charAt(i);
        }
        return result;
    }
    public static int countVowels(String s)
    {
        String vowels = "aeiouаеєиіїоуюяыэё";
        String text = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < text.length(); i++)
        {
            if (vowels.indexOf(text.charAt(i)) != -1)
            {
                count++;
            }
        }
        return count;
    }
    public static String maskCardNumber(String cardNumber)
    {
        int digits = 0;
        for (int i = 0; i < cardNumber.length(); i++)
        {
            if (Character.isDigit(cardNumber.charAt(i)))
            {
                digits++;
            }
        }
        String result = "";
        for (int i = 0; i < cardNumber.length(); i++)
        {
            char symbol = cardNumber.charAt(i);
            if (Character.isDigit(symbol))
            {
                result += (digits > 4) ? '*' : symbol;
                digits--;
            }
            else
            {
                result += symbol;
            }
        }
        return result;
    }
}
