package semester1.practice09;

public class DataCenterCluster
{
    private final String clusterLocation;
    private final ServerNode[] nodes;
    private int nodeCount;

    public DataCenterCluster(String clusterLocation, int capacity)
    {
        this.clusterLocation = clusterLocation;
        nodes = new ServerNode[capacity];
    }
    public boolean addNode(ServerNode node)
    {
        if (node == null || nodeCount == nodes.length)
        {
            return false;
        }
        nodes[nodeCount++] = node;
        return true;
    }
    public boolean deployContainer(int requiredRamGb)
    {
        for (int i = 0; i < nodeCount; i++)
        {
            if (nodes[i].allocateRam(requiredRamGb))
            {
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString()
    {
        String result = "Кластер: " + clusterLocation;
        for (int i = 0; i < nodeCount; i++)
        {
            result += "\n" + nodes[i];
        }
        return result;
    }
}

class ServerNode
{
    private final String ipAddress;
    private final int totalRamGb;
    private int usedRamGb;
    private boolean online;

    public ServerNode(String ipAddress, int totalRamGb, boolean online)
    {
        this.ipAddress = ipAddress;
        this.totalRamGb = totalRamGb;
        this.online = online;
    }
    public int getFreeRamGb()
    {
        return totalRamGb - usedRamGb;
    }
    public boolean allocateRam(int amount)
    {
        if (online && amount > 0 && amount <= getFreeRamGb())
        {
            usedRamGb += amount;
            return true;
        }
        return false;
    }
    @Override
    public String toString()
    {
        return ipAddress + " online=" + online + " RAM=" + usedRamGb + "/" + totalRamGb + " GB";
    }
}
