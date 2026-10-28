package semester1.practice08;

public class Publication
{
    private String title;
    private String author;
    private int releaseYear;

    public Publication(String title, String author, int releaseYear)
    {
        this.title = title;
        this.author = author;
        this.releaseYear = Math.max(0, releaseYear);
    }
    @Override
    public String toString()
    {
        return "Publication{title='" + title + "', author='" + author + "', year=" + releaseYear + "}";
    }
}

class PrintedBook extends Publication
{
    private int pageCount;
    private String coverType;

    public PrintedBook(String title, String author, int releaseYear, int pageCount, String coverType)
    {
        super(title, author, releaseYear);
        this.pageCount = Math.max(0, pageCount);
        this.coverType = coverType;
    }
    @Override
    public String toString()
    {
        return "PrintedBook{" + super.toString() + ", pages=" + pageCount + ", cover='" + coverType + "'}";
    }
}

class AudioBook extends Publication
{
    private int durationMinutes;
    private String narrator;

    public AudioBook(String title, String author, int releaseYear, int durationMinutes, String narrator)
    {
        super(title, author, releaseYear);
        this.durationMinutes = Math.max(0, durationMinutes);
        this.narrator = narrator;
    }
    public String getFormattedDuration()
    {
        return durationMinutes / 60 + " год " + durationMinutes % 60 + " хв";
    }
    @Override
    public String toString()
    {
        return "AudioBook{" + super.toString() + ", duration='" + getFormattedDuration() + "', narrator='" + narrator + "'}";
    }
}
