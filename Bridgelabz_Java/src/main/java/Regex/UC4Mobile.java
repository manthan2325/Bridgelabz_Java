
@FunctionalInterface 
interface MobileValidate{
    boolean isValid(String mobile);
}
public class UC4Mobile {
    public static void main(String[] args){
        MobileValidate mv = number -> number != null && number.matches("^[0-9]{2}[0-9]{10}$");

        System.out.println(mv.isValid("+917219551703"));
    }
}
