package semester1.practice09;

public class HeroCharacter
{
    private final String nickname;
    private int baseStrength;
    private WeaponItem equippedWeapon;

    public HeroCharacter(String nickname, int baseStrength)
    {
        this.nickname = nickname;
        this.baseStrength = baseStrength;
    }
    public void equip(WeaponItem newWeapon)
    {
        equippedWeapon = newWeapon;
    }
    public void unequip()
    {
        equippedWeapon = null;
    }
    public int attack()
    {
        return baseStrength + (equippedWeapon == null ? 0 : equippedWeapon.useWeapon());
    }
    @Override
    public String toString()
    {
        return nickname + " strength=" + baseStrength + " weapon=" + equippedWeapon;
    }
}

class WeaponItem
{
    private final String name;
    private final int bonusDamage;
    private int durability;

    public WeaponItem(String name, int bonusDamage, int durability)
    {
        this.name = name;
        this.bonusDamage = bonusDamage;
        this.durability = Math.max(0, Math.min(100, durability));
    }
    public int useWeapon()
    {
        if (durability == 0)
        {
            return 0;
        }
        durability = Math.max(0, durability - 10);
        return bonusDamage;
    }
    @Override
    public String toString()
    {
        return name + " bonus=" + bonusDamage + " durability=" + durability;
    }
}
