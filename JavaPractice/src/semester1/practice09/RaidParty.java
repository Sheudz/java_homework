package semester1.practice09;

public class RaidParty
{
    private final String guildName;
    private final AbstractHeroUnit[] members;
    private int memberCount;

    public RaidParty(String guildName, int capacity)
    {
        this.guildName = guildName;
        members = new AbstractHeroUnit[capacity];
    }
    public boolean addMember(AbstractHeroUnit member)
    {
        if (member == null || memberCount == members.length)
        {
            return false;
        }
        members[memberCount++] = member;
        return true;
    }
    public int getTotalCombatPower()
    {
        int total = 0;
        for (int i = 0; i < memberCount; i++)
        {
            total += members[i].getCombatPower();
        }
        return total;
    }
    public boolean isReady(int dungeonDifficulty)
    {
        boolean hasTank = false;
        for (int i = 0; i < memberCount; i++)
        {
            if (members[i].getRole().equals("Tank"))
            {
                hasTank = true;
            }
        }
        return hasTank && getTotalCombatPower() > dungeonDifficulty;
    }
    @Override
    public String toString()
    {
        String result = guildName + " combatPower=" + getTotalCombatPower();
        for (int i = 0; i < memberCount; i++)
        {
            result += "\n" + members[i];
        }
        return result;
    }
}

abstract class AbstractHeroUnit
{
    private final String name;
    protected int hp;

    public AbstractHeroUnit(String name, int hp)
    {
        this.name = name;
        this.hp = hp;
    }
    public abstract int getCombatPower();
    public abstract String getRole();

    @Override
    public String toString()
    {
        return name + " role=" + getRole() + " HP=" + hp + " power=" + getCombatPower();
    }
}

class TankWarrior extends AbstractHeroUnit
{
    private final int armor;

    public TankWarrior(String name, int hp, int armor)
    {
        super(name, hp);
        this.armor = armor;
    }
    @Override
    public int getCombatPower()
    {
        return hp / 10 + armor * 2;
    }
    @Override
    public String getRole()
    {
        return "Tank";
    }
}

class ArcaneMage extends AbstractHeroUnit
{
    private final int intelligence;
    private final int spellPower;

    public ArcaneMage(String name, int hp, int intelligence, int spellPower)
    {
        super(name, hp);
        this.intelligence = intelligence;
        this.spellPower = spellPower;
    }
    @Override
    public int getCombatPower()
    {
        return intelligence * 3 + spellPower * 2;
    }
    @Override
    public String getRole()
    {
        return "Mage";
    }
}
