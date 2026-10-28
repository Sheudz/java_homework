package semester1.practice08;

public class Weapon
{
    private String title;
    private int baseDamage;

    public Weapon(String title, int baseDamage)
    {
        this.title = title;
        this.baseDamage = Math.max(0, baseDamage);
    }
    public int calculateDamage()
    {
        return baseDamage;
    }
    @Override
    public String toString()
    {
        return "Weapon{title='" + title + "', physicalDamage=" + baseDamage + "}";
    }
}

class EnchantedSword extends Weapon
{
    private String element;
    private int magicPower;
    private int enchantmentLevel;

    public EnchantedSword(String title, int baseDamage, String element, int magicPower, int enchantmentLevel)
    {
        super(title, baseDamage);
        this.element = element;
        this.magicPower = Math.max(0, magicPower);
        this.enchantmentLevel = Math.max(0, enchantmentLevel);
    }
    @Override
    public int calculateDamage()
    {
        return super.calculateDamage() + magicPower * enchantmentLevel;
    }
    @Override
    public String toString()
    {
        return "EnchantedSword{" + super.toString() + ", element='" + element + "', magic=" + magicPower + " * " + enchantmentLevel + ", total=" + calculateDamage() + "}";
    }
}
