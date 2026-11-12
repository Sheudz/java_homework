package semester1.practice10;

public interface DataValidator
{
    boolean isValid(String input);

    default String validateOrDefault(String input, String fallback)
    {
        return isValid(input) ? input : fallback;
    }
    static boolean isNotNullOrBlank(String s)
    {
        return s != null && !s.isBlank();
    }
}

class EmailValidator implements DataValidator
{
    @Override
    public boolean isValid(String input)
    {
        return DataValidator.isNotNullOrBlank(input) && input.contains("@") && input.contains(".");
    }
}

class PositiveNumberValidator implements DataValidator
{
    @Override
    public boolean isValid(String input)
    {
        if (!DataValidator.isNotNullOrBlank(input))
        {
            return false;
        }
        try
        {
            return Double.parseDouble(input) > 0;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }
}
