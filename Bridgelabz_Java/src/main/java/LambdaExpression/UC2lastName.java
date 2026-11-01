
@FunctionalInterface 
interface lastName{
    boolean isValid(String name);
}
public class UC2lastName {
    public static void main(String[] args) {
        lastName func = name -> name != null && name.matches("^[a-zA-Z]{2,}[A-Z]$");
        System.out.println(func.isValid("Man"));
        System.out.println(func.isValid("maN"));
    }
}
