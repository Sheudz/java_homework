package semester1.practice08;

public final class ImmutableServerCredentials
{
    private final String host;
    private final int port;
    private final String apiKey;

    public ImmutableServerCredentials(String host, int port, String apiKey)
    {
        this.host = (host == null || host.isBlank()) ? "localhost" : host;
        this.port = (port >= 1 && port <= 65535) ? port : 8080;
        this.apiKey = (apiKey == null) ? "" : apiKey;
    }
    public String getHost()
    {
        return host;
    }
    public int getPort()
    {
        return port;
    }
    public String getApiKey()
    {
        return apiKey;
    }
    @Override
    public String toString()
    {
        return "ImmutableServerCredentials{host='" + host + "', port=" + port + ", apiKey='***SECRET***'}";
    }
}
