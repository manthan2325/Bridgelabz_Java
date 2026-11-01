package JavaDesignPatterns.DecoratorPattern;

interface Coffee
{
    String getDescription();
}
class SimpleCoffee implements Coffee
{
    public String getDescription()
    {
        return "Simple Coffee";
    }
}

class MilkDecorator implements Coffee
{
    private Coffee c;
    public MilkDecorator(Coffee c)
    {
        this.c=c;
    }
    public String getDescription()
    {
        return c.getDescription() + ", Milk";
    }
}
class SugarDecorator implements Coffee
{
    private Coffee c;
    public SugarDecorator(Coffee c)
    {
        this.c=c;
    }
    public String getDescription()
    {
        return c.getDescription() + ", Sugar";
    }
}

public class DecoratorPattern 
{
    public static void main(String[] args) 
    {
        MilkDecorator md= new MilkDecorator(new SimpleCoffee());
        SugarDecorator sd= new SugarDecorator(new SimpleCoffee());
        System.out.println(md.getDescription());
        System.out.println(sd.getDescription());
    }
   
}
