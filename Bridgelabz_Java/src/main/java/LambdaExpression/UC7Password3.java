
@FunctionalInterface 
interface UC7Validate{
    boolean isValid(String ele);
}
public class UC7Password3 {
    public static void main(String[] args) {
        UC7Validate s = ele -> ele != null && ele.matches("^.*[0-9]{1,}.*$");
        System.out.println(s.isValid("Manthan7"));
        System.out.println(s.isValid("7777Manthan"));

    }
}
