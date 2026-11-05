package semester1.practice09;

public class Bookshelf
{
    private final String genre;
    private final BookItem[] books;
    private int bookCount;

    public Bookshelf(String genre, int capacity)
    {
        this.genre = genre;
        books = new BookItem[capacity];
    }
    public boolean putBook(BookItem book)
    {
        if (book == null || bookCount == books.length)
        {
            return false;
        }
        books[bookCount++] = book;
        return true;
    }
    public BookItem findLongestBook()
    {
        BookItem longest = null;
        for (int i = 0; i < bookCount; i++)
        {
            if (longest == null || books[i].getPages() > longest.getPages())
            {
                longest = books[i];
            }
        }
        return longest;
    }
    public int getTotalPagesOnShelf()
    {
        int total = 0;
        for (int i = 0; i < bookCount; i++)
        {
            total += books[i].getPages();
        }
        return total;
    }
    @Override
    public String toString()
    {
        return genre + " books=" + bookCount + " pages=" + getTotalPagesOnShelf();
    }
}

class BookItem
{
    private final String title;
    private final String author;
    private final int pages;

    public BookItem(String title, String author, int pages)
    {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    public int getPages()
    {
        return pages;
    }
    @Override
    public String toString()
    {
        return title + " | " + author + " | " + pages + " сторінок";
    }
}
