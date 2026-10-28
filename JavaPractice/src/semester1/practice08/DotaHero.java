package semester1.practice08;

public class DotaHero
{
    private String name;
    private String primaryAttribute;
    private int baseHp;

    public DotaHero(String name, String primaryAttribute, int baseHp)
    {
        this.name = name;
        this.primaryAttribute = primaryAttribute;
        this.baseHp = Math.max(1, baseHp);
    }
    public int getMaxHp()
    {
        return baseHp;
    }
    @Override
    public String toString()
    {
        return "DotaHero{name='" + name + "', attribute='" + primaryAttribute + "', baseHp=" + baseHp + ", maxHp=" + getMaxHp() + "}";
    }
}

class StrengthHero extends DotaHero
{
    private int strength;

    public StrengthHero(String name, int baseHp, int strength)
    {
        super(name, "Сила", baseHp);
        this.strength = Math.max(0, strength);
    }
    @Override
    public int getMaxHp()
    {
        return super.getMaxHp() + strength * 22;
    }
    @Override
    public String toString()
    {
        return "StrengthHero{" + super.toString() + ", strength=" + strength + "}";
    }
}

class AlchemistHero extends StrengthHero
{
    private int greevilsGreedBonusGold;

    public AlchemistHero(String name, int baseHp, int strength, int greevilsGreedBonusGold)
    {
        super(name, baseHp, strength);
        this.greevilsGreedBonusGold = Math.max(0, greevilsGreedBonusGold);
    }
    public String chemicalRage()
    {
        return "Chemical Rage активовано! Алхімік прискорює атаки та відновлює здоров'я";
    }
    @Override
    public String toString()
    {
        return "AlchemistHero{" + super.toString() + ", bonusGold=" + greevilsGreedBonusGold + "}";
    }
}
