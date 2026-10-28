package semester1.practice08;

public class CharacterUnit
{
    private String name;
    protected int hp;
    protected int maxHp;
    protected int armor;

    public CharacterUnit(String name, int maxHp, int armor)
    {
        this.name = name;
        this.maxHp = Math.max(1, maxHp);
        this.hp = this.maxHp;
        this.armor = Math.max(0, armor);
    }
    public int getHp()
    {
        return hp;
    }
    public void takeDamage(int rawDamage)
    {
        if (rawDamage > 0)
        {
            hp -= Math.min(hp, Math.max(1, rawDamage - armor));
        }
    }
    protected String buildHealthBar()
    {
        String bar = "[";
        int filled = (int) ((double) hp / maxHp * 10);
        for (int i = 0; i < 10; i++)
        {
            bar += (i < filled) ? "█" : "░";
        }
        return bar + "]";
    }
    @Override
    public String toString()
    {
        return name + " HP: " + buildHealthBar() + " " + hp + "/" + maxHp + " Броня: " + armor;
    }
}

class ShieldedPaladin extends CharacterUnit
{
    private int shieldPoints;

    public ShieldedPaladin(String name, int maxHp, int armor, int shieldPoints)
    {
        super(name, maxHp, armor);
        this.shieldPoints = Math.max(0, shieldPoints);
    }
    public int getShieldPoints()
    {
        return shieldPoints;
    }
    @Override
    public void takeDamage(int rawDamage)
    {
        if (rawDamage <= 0)
        {
            return;
        }
        int absorbed = Math.min(shieldPoints, rawDamage);
        shieldPoints -= absorbed;
        int remainingDamage = rawDamage - absorbed;
        if (remainingDamage > 0)
        {
            super.takeDamage(remainingDamage);
        }
    }
    @Override
    public String toString()
    {
        return "ShieldedPaladin{" + super.toString() + ", shield=" + shieldPoints + "}";
    }
}
