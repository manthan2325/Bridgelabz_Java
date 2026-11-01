
@FunctionalInterface 
interface PasswordValidate2{
    boolean isValid(String pass);
}
public class UC5Password2 {
    public static void main(String[] args) {
        PasswordValidate2 ps = ele -> ele != null && ele.matches("^.*[A-Z].*$");
        System.out.println(ps.isValid("manthan"));
        System.out.println(ps.isValid("Manthan"));
    }
}
