package semester1.practice07;

public class Book
{
    private String title;
    private String author;
    private int year;
    private double price;

    Book()
    {
        title = "Невідомо";
        author = "Невідомий";
        year = 2000;
        price = 0.0;
    }
    Book(String title, String author, int year, double price)
    {
        this.title = title;
        this.author = author;
        this.year = (year < 0) ? 2000 : year;
        this.price = (price < 0.0) ? 0.0 : price;
    }

    public void printInfo()
    {
        System.out.println("Назва: " + title + " Автор: " + author + " Рік видання: " + year + " Вартість: " + price);
    }
}
