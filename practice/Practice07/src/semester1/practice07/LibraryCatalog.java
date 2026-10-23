package semester1.practice07;

public class LibraryCatalog
{
    private BookItem[] books;
    private int size;

    LibraryCatalog(int capacity)
    {
        books = new BookItem[capacity];
        size = 0;
    }

    public void addBook(BookItem book)
    {
        if (book != null && size < books.length)
        {
            books[size] = book;
            size++;
        }
    }
    public BookItem findBookByTitle(String title)
    {
        for(int i = 0; i < size; i++)
        {
            if (books[i].title.equals(title))
            {
                return books[i];
            }
        }
        return null;
    }
    public boolean borrowBook(String title)
    {
        BookItem book = findBookByTitle(title);
        if (book != null)
        {
            return book.borrowBook();
        }
        return false;
    }
    public void printCatalog()
    {
        for(int i = 0; i < size; i++)
        {
            books[i].printBook();
        }
    }

}
