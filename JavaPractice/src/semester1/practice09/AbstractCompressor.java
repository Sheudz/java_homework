package semester1.practice09;

public abstract class AbstractCompressor
{
    private final String algorithmName;

    public AbstractCompressor(String algorithmName)
    {
        this.algorithmName = algorithmName;
    }
    public abstract int estimateCompressedSize(int originalSizeBytes);

    public double getCompressionRatio(int originalSizeBytes)
    {
        return originalSizeBytes > 0 ? (1 - (double) estimateCompressedSize(originalSizeBytes) / originalSizeBytes) * 100 : 0;
    }
    @Override
    public String toString()
    {
        return algorithmName;
    }
}

class ZipCompressor extends AbstractCompressor
{
    public ZipCompressor()
    {
        super("ZIP");
    }
    @Override
    public int estimateCompressedSize(int originalSizeBytes)
    {
        return (int) Math.round(originalSizeBytes * 0.55);
    }
}

class UltraLzmaCompressor extends AbstractCompressor
{
    public UltraLzmaCompressor()
    {
        super("Ultra LZMA");
    }
    @Override
    public int estimateCompressedSize(int originalSizeBytes)
    {
        return (int) Math.round(originalSizeBytes * 0.30) + 128;
    }
}
