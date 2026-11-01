package JavaDesignPatterns.ObserverDesignPatter;
import java.util.ArrayList;
import java.util.List;
interface Observer
{
    void update(String message);
}
class Subscriber implements Observer
{
    private String name;
    public Subscriber(String name)
    {
        this.name=name;
    }
    public void update(String message)
    {
        System.out.println(name + " received message: " + message);
    }
}
class NewsChannel 
{
    private List<Observer> oarr = new ArrayList<>();
    public void subscribe(Observer o)
    {
        this.oarr.add(o);
    }
    public void NewUpdate(String m)
    {
        for(Observer obs: oarr)
        {
            obs.update(m);
        }
    }
}

public class ObserverDesignPatter 
{
    public static void main(String[] args) 
    {
        Subscriber s1= new Subscriber("Subscriber 1");
        Subscriber s2= new Subscriber("Subscriber 2");
        Subscriber s3= new Subscriber("Subscriber 3");
        NewsChannel nc= new NewsChannel();
        nc.subscribe(s1);
        nc.subscribe(s2);
        nc.subscribe(s3);
        nc.NewUpdate("Breaking News: Observer Design Pattern Implemented!");
    }
}
