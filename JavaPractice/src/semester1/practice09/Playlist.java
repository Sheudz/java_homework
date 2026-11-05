package semester1.practice09;

public class Playlist
{
    private String name;
    private final AudioTrack[] tracks;
    private int trackCount;

    public Playlist(String name, int capacity)
    {
        this.name = name;
        tracks = new AudioTrack[capacity];
    }
    public boolean addTrack(AudioTrack track)
    {
        if (track == null || trackCount == tracks.length)
        {
            return false;
        }
        tracks[trackCount++] = track;
        return true;
    }
    public int getTotalDurationSeconds()
    {
        int total = 0;
        for (int i = 0; i < trackCount; i++)
        {
            total += tracks[i].getDurationSeconds();
        }
        return total;
    }
    @Override
    public String toString()
    {
        String result = "Плейлист: " + name + "\n";
        for (int i = 0; i < trackCount; i++)
        {
            result += (i + 1) + ". " + tracks[i] + "\n";
        }
        int seconds = getTotalDurationSeconds();
        return result + "Разом: " + seconds / 60 + " хв " + seconds % 60 + " сек";
    }
}

class AudioTrack
{
    private final String title;
    private final String artist;
    private final int durationSeconds;

    public AudioTrack(String title, String artist, int durationSeconds)
    {
        this.title = title;
        this.artist = artist;
        this.durationSeconds = durationSeconds;
    }
    public int getDurationSeconds()
    {
        return durationSeconds;
    }
    public String getFormattedDuration()
    {
        return String.format("%02d:%02d", durationSeconds / 60, durationSeconds % 60);
    }
    @Override
    public String toString()
    {
        return artist + " - " + title + " " + getFormattedDuration();
    }
}
