package semester1.practice10;

public interface TextProcessor
{
    String process(String text);
}

interface ReversibleProcessor extends TextProcessor
{
    String reverseProcess(String text);
}

class CaesarCipherProcessor implements ReversibleProcessor
{
    private final int shift;

    public CaesarCipherProcessor(int shift)
    {
        this.shift = shift;
    }
    private String shiftText(String text, int amount)
    {
        String result = "";
        for (int i = 0; i < text.length(); i++)
        {
            result += (char) (text.charAt(i) + amount);
        }
        return result;
    }
    @Override
    public String process(String text)
    {
        return shiftText(text, shift);
    }
    @Override
    public String reverseProcess(String text)
    {
        return shiftText(text, -shift);
    }
}

class WhitespaceTrimmerProcessor implements TextProcessor
{
    @Override
    public String process(String text)
    {
        return text.trim().replaceAll("\\s+", " ");
    }
}
