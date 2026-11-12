package semester1.practice10;

public abstract class AbstractMilitaryUnit
{
    private final String unitName;
    protected int hp;

    public AbstractMilitaryUnit(String unitName, int hp)
    {
        this.unitName = unitName;
        this.hp = hp;
    }
    public abstract int getMoveSpeed();

    @Override
    public String toString()
    {
        return unitName + " HP=" + hp + " speed=" + getMoveSpeed();
    }
}

interface RangedAttacker
{
    int getAttackRange();
    int fireShot();
}

interface FieldHealer
{
    int healAlly();
}

class HeavySniper extends AbstractMilitaryUnit implements RangedAttacker
{
    public HeavySniper()
    {
        super("Снайпер", 100);
    }
    @Override
    public int getMoveSpeed()
    {
        return 4;
    }
    @Override
    public int getAttackRange()
    {
        return 1000;
    }
    @Override
    public int fireShot()
    {
        return 90;
    }
}

class CombatMedic extends AbstractMilitaryUnit implements FieldHealer
{
    public CombatMedic()
    {
        super("Медик", 120);
    }
    @Override
    public int getMoveSpeed()
    {
        return 5;
    }
    @Override
    public int healAlly()
    {
        return 40;
    }
}

class PaladinCaptain extends AbstractMilitaryUnit implements RangedAttacker, FieldHealer
{
    public PaladinCaptain()
    {
        super("Паладин", 200);
    }
    @Override
    public int getMoveSpeed()
    {
        return 3;
    }
    @Override
    public int getAttackRange()
    {
        return 50;
    }
    @Override
    public int fireShot()
    {
        return 60;
    }
    @Override
    public int healAlly()
    {
        return 30;
    }
}
