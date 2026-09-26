import java.util.Scanner;

public class Convertlowercase {
    public static String func(String s){
        int n = s.length();
        String result = "";
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch  >= 'A' && ch <= 'Z'){
                ch= (char)(ch + 32);
            }
            result += ch;
        }
        return result;
    }
    public static boolean func1(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String manual = func(s);
        String method = s.toLowerCase();

        boolean comp = func1(manual,method);
        if(comp){
            System.out.println("String are Same");
        }else{
            System.out.println("String are not Same");
        }
        sc.close();
    }
}
