
@FunctionalInterface
interface UC8Validate{
    boolean isValid(String ele);
}
public class UC8Password {
    public static void main(String[] args) {
        UC8Validate us = ele -> ele != null && ele.matches("^.*[+_%.#].*$");
        System.out.println(us.isValid("Manthan@#"));
        System.out.println(us.isValid("Manth123#"));
    }
}
