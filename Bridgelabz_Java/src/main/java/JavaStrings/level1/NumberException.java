import java.util.*;

public class NumberException{
    public static void gen(String s){
        int num = Integer.parseInt(s);
        System.out.println("Number" + num);
    }
    public static void handle(String s){
        try {
            int num = Integer.parseInt(s);
            System.out.println("Number: "+ num);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        } catch(java.lang.RuntimeException e){
            System.out.println("RuntimeException handled.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        //gen(s);

        handle(s);
        sc.close();
    }
}
