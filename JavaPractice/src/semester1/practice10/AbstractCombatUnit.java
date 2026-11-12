package semester1.practice10;

public abstract class AbstractCombatUnit
{
    private final String name;
    protected int hp;

    public AbstractCombatUnit(String name, int hp)
    {
        this.name = name;
        this.hp = hp;
    }
    public final boolean isAlive()
    {
        return hp > 0;
    }
    public void takeDamage(int damage)
    {
        hp = Math.max(0, hp - damage);
    }
    public abstract int calculateDamage();

    @Override
    public String toString()
    {
        return name + " HP=" + hp;
    }
}

interface CriticalStriker
{
    double getCritMultiplier();
}

interface SelfRegenerating
{
    int regenerateHp();
}

interface ShieldBearer
{
    int absorbDamage(int incoming);
}

class BerserkerAssasin extends AbstractCombatUnit implements CriticalStriker
{
    public BerserkerAssasin()
    {
        super("Берсеркер", 150);
    }
    @Override
    public int calculateDamage()
    {
        return 50;
    }
    @Override
    public double getCritMultiplier()
    {
        return 2;
    }
}

class TrollWarlord extends AbstractCombatUnit implements CriticalStriker, SelfRegenerating
{
    public TrollWarlord()
    {
        super("Троль", 200);
    }
    @Override
    public int calculateDamage()
    {
        return 40;
    }
    @Override
    public double getCritMultiplier()
    {
        return 1.5;
    }
    @Override
    public int regenerateHp()
    {
        int restored = Math.min(20, 200 - hp);
        hp += restored;
        return restored;
    }
}

class RoyalPaladin extends AbstractCombatUnit implements ShieldBearer, SelfRegenerating
{
    private int shieldPoints = 80;

    public RoyalPaladin()
    {
        super("Паладин", 250);
    }
    @Override
    public int calculateDamage()
    {
        return 35;
    }
    @Override
    public int absorbDamage(int incoming)
    {
        int absorbed = Math.min(shieldPoints, incoming);
        shieldPoints -= absorbed;
        return incoming - absorbed;
    }
    @Override
    public int regenerateHp()
    {
        int restored = Math.min(15, 250 - hp);
        hp += restored;
        return restored;
    }
}
