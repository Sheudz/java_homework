package semester1.practice10;

public abstract class AbstractSecurityProtocol
{
    protected abstract boolean authenticateUser(String token);
    protected abstract String executePayload(String command);

    public final String runSecureCommand(String token, String command)
    {
        if (token == null || !authenticateUser(token))
        {
            return "403 FORBIDDEN";
        }
        return "[AUDITED] " + executePayload(command);
    }
}

class JwtSecurityProtocol extends AbstractSecurityProtocol
{
    private final String expectedToken;

    public JwtSecurityProtocol(String expectedToken)
    {
        this.expectedToken = expectedToken;
    }
    @Override
    protected boolean authenticateUser(String token)
    {
        return expectedToken.equals(token);
    }
    @Override
    protected String executePayload(String command)
    {
        return "JWT: " + command;
    }
}

class ApiKeySecurityProtocol extends AbstractSecurityProtocol
{
    private final String apiKey;

    public ApiKeySecurityProtocol(String apiKey)
    {
        this.apiKey = apiKey;
    }
    @Override
    protected boolean authenticateUser(String token)
    {
        return apiKey.equals(token);
    }
    @Override
    protected String executePayload(String command)
    {
        return "API: " + command;
    }
}
