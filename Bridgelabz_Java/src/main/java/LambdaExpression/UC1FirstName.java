

@FunctionalInterface
interface NameValidator{
    boolean isvalid(String name);
}

public class UC1FirstName {
    public static void main(String[] args){
        NameValidator func = name -> name != null && name.matches("^[A-Z][a-zA-Z]{2,}$");
        System.out.println(func.isvalid("Manthan"));
        System.out.println(func.isvalid("Rohan"));
    }
}
