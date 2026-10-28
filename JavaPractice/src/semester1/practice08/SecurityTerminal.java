package semester1.practice08;

public class SecurityTerminal
{
    public final String generateAuthHash(String user)
    {
        return "AUTH-SHA-" + user.toUpperCase(java.util.Locale.ROOT);
    }
    public String getWelcomeBanner()
    {
        return "Термінал безпеки";
    }
    @Override
    public String toString()
    {
        return getWelcomeBanner();
    }
}

class CustomTerminal extends SecurityTerminal
{
    @Override
    public String getWelcomeBanner()
    {
        return "Ласкаво просимо до CustomTerminal";
    }
    public String authorize(String user)
    {
        return getWelcomeBanner() + " | " + generateAuthHash(user);
    }
}
