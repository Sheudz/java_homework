package semester1.practice06;

public class Player
{
    public String nickname;
    public int health = 100;

    public void takeDamage(int damage)
    {
        if (damage > 0)
        {
            health -= Math.min(damage, health);
            if (health == 0)
            {
                System.out.println(nickname + " загинув!");
            }
        }
    }
    public void heal(int amount)
    {
        if (amount > 0)
        {
            health += Math.min(amount, 100 - health);
        }
    }
}
