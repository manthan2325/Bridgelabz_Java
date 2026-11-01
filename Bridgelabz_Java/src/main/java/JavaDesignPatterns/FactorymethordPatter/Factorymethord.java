package JavaDesignPatterns.FactorymethordPatter;
/*
 
public class Main {
    public static void main(String[] args) {
        String type = "EMAIL";

        if (type.equals("EMAIL")) {
            // Create EmailNotification
        } else if (type.equals("SMS")) {
            // Create SMSNotification
        }
    }
}
    The problem: Creating objects can make your code difficult to extend
    Suppose you're building a notification application. It can send messages by email or SMS.
    This works initially. But imagine adding WhatsApp notifications, push notifications, and more.

    The code that decides which object to create keeps growing. If that creation logic is repeated in multiple 
    places, maintenance becomes even harder.
    The important problem is that the calling code is tightly connected to the concrete classes it creates.

 */
interface Notification
{
    void send();
}
class Email implements Notification
{
    public void send()
    {
        System.out.println("Email notification sent");
    }
}
class SMS implements Notification
{
    public void send()
    {
        System.out.println("SMS notification sent");
    }
}
abstract class NotificationFactory
{
    public abstract Notification create();
    public void notifyUser()
    {
      Notification n = create();
      n.send();
    }
}
class EmailFactory extends NotificationFactory
{
    public Notification create()
    {
        return new Email();
    }
}
class SMSFactory extends NotificationFactory
{
    public Notification create()
    {
        return new SMS();
    }
}
public class Factorymethord 
{
    public static void main(String[] args) 
    {
        NotificationFactory f= new EmailFactory();
        f.notifyUser();

        f= new SMSFactory();
        f.notifyUser();
    }
    
}
