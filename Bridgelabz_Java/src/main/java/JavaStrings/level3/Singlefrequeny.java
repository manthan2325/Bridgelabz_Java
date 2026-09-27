import java.util.*;

public class Singlefrequeny {
    public static char func(String s){
        int[] hash = new int[256];
        int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            hash[c]++;
        }
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(hash[c] == 1){
                return c;
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char firstunique = func(s);
        if(firstunique == '\0'){
            System.out.println("No character");
        }else{
            System.out.println("character is: " + firstunique);
        }
        sc.close();
    }
}
