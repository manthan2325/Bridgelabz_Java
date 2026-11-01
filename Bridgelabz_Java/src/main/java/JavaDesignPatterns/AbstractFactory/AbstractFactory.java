package JavaDesignPatterns.AbstractFactory;
interface Button
{
    void render();
}
interface Checkbox
{
    void render();
}
class WindowsButton implements Button
{
    public void render()
    {
        System.out.println("Rendering Windows Button");
    }
}
class WindowsCheckbox implements Checkbox
{
    public void render()
    {
        System.out.println("Rendering Windows Checkbox");
    }
}
class MacButton implements Button
{
    public void render()
    {
        System.out.println("Rendering Mac Button");
    }
}
class MacCheckbox implements Checkbox
{
    public void render()
    {
        System.out.println("Rendering Mac Checkbox");
    }
}
interface GUIFactory
{
    Button CreateButton();
    Checkbox CreateCheckbox();
}
class WindowsFactory implements GUIFactory
{
    public Button CreateButton()
    {
        return new WindowsButton();
    }
    public Checkbox CreateCheckbox()
    {
        return new WindowsCheckbox();
    }
}
class MacFactory implements GUIFactory
{
    public Button CreateButton()
    {
        return new MacButton();
    }
    public Checkbox CreateCheckbox()
    {
        return new MacCheckbox();
    }
}
public class AbstractFactory 
{
    public static void main(String[] args) 
    {
        GUIFactory f= new MacFactory();
        Button b= f.CreateButton();
        Checkbox c= f.CreateCheckbox();
        b.render();
        c.render();
    }
}
