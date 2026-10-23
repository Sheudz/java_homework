package semester1.practice07;

public class BookItem
{
    String isbn;
    String title;
    String author;
    boolean isAvailable;

    BookItem(String isbn, String title, String author)
    {
        this.isbn = isbn;
        this.title = title;
        this.author = author;

        isAvailable = true;
    }
    public boolean borrowBook()
    {
        if (isAvailable)
        {
            isAvailable = false;
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean returnBook()
    {
        if (!isAvailable)
        {
            isAvailable = true;
            return true;
        }
        else
        {
            return false;
        }
    }
    public void printBook()
    {
        System.out.println("ISBN: " + isbn + " Назва: " + title + " Автор: " + author + " Доступна: " + isAvailable);
    }
}
