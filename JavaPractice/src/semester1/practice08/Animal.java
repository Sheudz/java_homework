package semester1.practice08;

public class Animal
{
    private String name;
    private int age;
    private double weight;

    public Animal(String name, int age, double weight)
    {
        this.name = name;
        this.age = Math.max(0, age);
        this.weight = Math.max(0, weight);
    }
    public String getName()
    {
        return name;
    }
    @Override
    public String toString()
    {
        return "Animal{name='" + name + "', age=" + age + ", weight=" + weight + "}";
    }
}

class Dog extends Animal
{
    private String breed;

    public Dog(String name, int age, double weight, String breed)
    {
        super(name, age, weight);
        this.breed = breed;
    }
    public String fetchStick()
    {
        return getName() + " приніс палицю";
    }
    @Override
    public String toString()
    {
        return "Dog{" + super.toString() + ", breed='" + breed + "'}";
    }
}

class Cat extends Animal
{
    private boolean isIndoor;

    public Cat(String name, int age, double weight, boolean isIndoor)
    {
        super(name, age, weight);
        this.isIndoor = isIndoor;
    }
    public String purr()
    {
        return getName() + " муркоче";
    }
    @Override
    public String toString()
    {
        return "Cat{" + super.toString() + ", indoor=" + isIndoor + "}";
    }
}
