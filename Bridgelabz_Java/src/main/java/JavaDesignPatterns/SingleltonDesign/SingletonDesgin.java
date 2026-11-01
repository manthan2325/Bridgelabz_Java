package JavaDesignPatterns.SingleltonDesign;
class Config
{
    private static final Config instance = new Config();
    private Config()
    {
        System.out.println("config object created");
    }
    public static Config getInstance()
    {
        return instance;
    }
    public void display()
    {
        System.out.println("display method called");
    }
}
public class SingletonDesgin 
{
    public static void main(String[] args) 
    {
        Config c1= Config.getInstance();
        Config c2= Config.getInstance();
        c1.display();
        c2.display();
        System.out.println(c1==c2);
    }
}
