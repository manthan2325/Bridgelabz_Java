package JavaDesignPatterns.AdapterPattern;
interface TheNewTHing
{
    void NewMethod(String f);
}
class TheOldThing
{
    public void OldMethod(String f)
    {
        System.out.println("Helooo what is up my friend: " + f);
    }
}
class Adapter implements TheNewTHing
{
    private TheOldThing old;
    public Adapter(TheOldThing old)
    {
        this.old=old;
    }
    public void NewMethod(String f)
    {
        old.OldMethod(f);
    }
}

public class AdapterPattern 
{
    public static void main(String[] args) 
    {
        Adapter a= new Adapter(new TheOldThing());
        a.NewMethod("Hello");
    }
}
