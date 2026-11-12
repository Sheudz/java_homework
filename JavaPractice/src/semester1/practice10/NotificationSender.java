package semester1.practice10;

public class NotificationSender
{
    private final String recipient;

    public NotificationSender(String recipient)
    {
        this.recipient = recipient;
    }
    public String send(String message)
    {
        return recipient + ": " + message;
    }
}

class EmailSender extends NotificationSender
{
    private final String subject;

    public EmailSender(String recipient, String subject)
    {
        super(recipient);
        this.subject = subject;
    }
    @Override
    public String send(String message)
    {
        return "Email [" + subject + "] " + super.send(message);
    }
}

class SmsSender extends NotificationSender
{
    public SmsSender(String recipient)
    {
        super(recipient);
    }
    @Override
    public String send(String message)
    {
        return "SMS " + super.send(message.length() > 70 ? message.substring(0, 70) : message);
    }
}

class TelegramBotSender extends NotificationSender
{
    public TelegramBotSender(String recipient)
    {
        super(recipient);
    }
    @Override
    public String send(String message)
    {
        return "Telegram " + super.send("⚠️ **" + message + "**");
    }
}
