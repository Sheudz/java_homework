package semester1.practice06;

public class UserAccount
{
    private String username;
    private String password;

    public void setCredentials(String u, String p)
    {
        if (u != null && !u.isEmpty() && p != null && !p.isEmpty())
        {
            username = u;
            password = p;
        }
        else
        {
            System.out.println("Логін та пароль не можуть бути порожніми");
        }
    }
    public boolean login(String enteredUser, String enteredPass)
    {
        return username != null && password != null && username.equals(enteredUser) && password.equals(enteredPass);
    }
    public void changePassword(String oldPass, String newPass)
    {
        if (password != null && password.equals(oldPass) && newPass != null && !newPass.isEmpty())
        {
            password = newPass;
            System.out.println("Пароль змінено");
        }
        else
        {
            System.out.println("Не вдалося змінити пароль");
        }
    }
}
