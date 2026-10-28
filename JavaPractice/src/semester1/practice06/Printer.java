package semester1.practice06;

public class Printer
{
    public String model;
    public int paperCount;

    public void printDocument(String title, int pages)
    {
        if (pages <= 0)
        {
            System.out.println("Некоректна кількість сторінок");
        }
        else if (pages <= paperCount)
        {
            paperCount -= pages;
            System.out.println("Документ " + title + " надруковано, сторінок: " + pages);
        }
        else
        {
            System.out.println("Помилка: Недостатньо паперу в принтері " + model + "!");
        }
    }
}
