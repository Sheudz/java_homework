package semester1.practice08;

public class TeamLead extends Developer
{
    private Developer[] teamMembers;
    private int memberCount;

    public TeamLead(String name, double salary, String programmingLanguage, int capacity)
    {
        super(name, salary, programmingLanguage);
        teamMembers = new Developer[Math.max(0, capacity)];
    }
    public void addTeamMember(Developer dev)
    {
        if (dev == null || dev == this || memberCount >= teamMembers.length)
        {
            System.out.println("Не вдалося додати розробника до команди");
            return;
        }
        for (int i = 0; i < memberCount; i++)
        {
            if (teamMembers[i] == dev)
            {
                return;
            }
        }
        teamMembers[memberCount++] = dev;
    }
    public double getTotalTeamBudget()
    {
        double total = getSalary();
        for (int i = 0; i < memberCount; i++)
        {
            total += teamMembers[i].getSalary();
        }
        return total;
    }
    @Override
    public String toString()
    {
        String result = "TeamLead{" + super.toString() + ", budget=" + getTotalTeamBudget() + "}\nКоманда:";
        for (int i = 0; i < memberCount; i++)
        {
            result += "\n" + (i + 1) + ". " + teamMembers[i];
        }
        return result;
    }
}
