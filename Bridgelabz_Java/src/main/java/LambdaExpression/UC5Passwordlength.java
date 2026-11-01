

@FunctionalInterface 
interface PasswordValidation{
    boolean isValid(String password);
}
public class UC5Passwordlength {
    public static void main(String[] args) {
        PasswordValidation ps = ele -> ele != null && ele.length() >= 8;
        System.out.println(ps.isValid("ManthanHan"));
    }
}
