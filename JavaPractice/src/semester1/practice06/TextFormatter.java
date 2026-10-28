package semester1.practice06;

public class TextFormatter
{
    public String formatTitle(String text)
    {
        return "*** " + text.toUpperCase() + " ***";
    }
    public int countVowels(String text)
    {
        String vowels = "аоуеиіяюєїaeiou";
        String lowerText = text.toLowerCase();
        int count = 0;
        for (int i = 0; i < lowerText.length(); i++)
        {
            if (vowels.indexOf(lowerText.charAt(i)) != -1)
            {
                count++;
            }
        }
        return count;
    }
}
