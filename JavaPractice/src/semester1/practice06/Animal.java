package semester1.practice06;

public class Animal
{
    public String species;
    public String name;

    public void makeSound()
    {
        System.out.println(name + " видає звук!");
    }
    public void printInfo()
    {
        System.out.println("Вид: " + species + " Кличка: " + name);
    }
}
