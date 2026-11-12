package semester1.practice10;

public class MediaItem
{
    protected String title;
    protected double sizeMb;

    public MediaItem(String title, double sizeMb)
    {
        this.title = title;
        this.sizeMb = sizeMb;
    }
    public double getSizeMb()
    {
        return sizeMb;
    }
    @Override
    public String toString()
    {
        return title + " " + sizeMb + " MB";
    }
}

class VideoFile extends MediaItem
{
    private final int resolutionHeight;
    private final int durationSec;

    public VideoFile(String title, double sizeMb, int resolutionHeight, int durationSec)
    {
        super(title, sizeMb);
        this.resolutionHeight = resolutionHeight;
        this.durationSec = durationSec;
    }
    public boolean is4K()
    {
        return resolutionHeight >= 2160;
    }
    @Override
    public String toString()
    {
        return super.toString() + " height=" + resolutionHeight + " duration=" + durationSec;
    }
}

class AudioFile extends MediaItem
{
    private final int bitrateKbps;

    public AudioFile(String title, double sizeMb, int bitrateKbps)
    {
        super(title, sizeMb);
        this.bitrateKbps = bitrateKbps;
    }
    public boolean isLossless()
    {
        return bitrateKbps >= 1000;
    }
}

class EBookFile extends MediaItem
{
    private final int pageCount;

    public EBookFile(String title, double sizeMb, int pageCount)
    {
        super(title, sizeMb);
        this.pageCount = pageCount;
    }
    @Override
    public String toString()
    {
        return super.toString() + " pages=" + pageCount;
    }
}
