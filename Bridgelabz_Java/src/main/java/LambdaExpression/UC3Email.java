
//abc.xyz@bl.co.in

//^[a-zA-Z0-9]+([._+-][a-zA-Z0.9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$

@FunctionalInterface
interface emailValidator{
    boolean isValid(String email);
}
public class UC3Email {
    public static void main(String[] args) {
        emailValidator func = name -> name != null && name.matches("^[a-zA-Z0-9]+([+-_.][a-zA-Z0-9]+)*@[a-zA-Z0-9]+");
        System.out.println(func.isValid("manthanhanchate123@gmail.com"));
    }
}