package semester1.practice07;

public class GameSession
{
    private String sessionToken;
    private String hostPlayer;
    private boolean isActive;
    private static int activeSessionsCount = 0;
    private static int nextToken = 1;
    public static final int MAX_SESSIONS = 3;

    private GameSession(String host)
    {
        hostPlayer = host;
        sessionToken = "SESSION-" + nextToken++;
        isActive = true;
    }
    public static GameSession createSession(String host)
    {
        if (activeSessionsCount >= MAX_SESSIONS)
        {
            System.out.println("Помилка: усі сервера перевантажені!");
            return null;
        }
        activeSessionsCount++;
        return new GameSession(host);
    }
    public void terminate()
    {
        if (isActive)
        {
            isActive = false;
            activeSessionsCount--;
        }
    }
}
