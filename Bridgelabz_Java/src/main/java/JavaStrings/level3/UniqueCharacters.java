import java.util.*;

public class UniqueCharacters {
    public static int findlen(String text){
        int cnt = 0;
        for(int i=0;i<text.length();i++){
            cnt++;
        }
        return cnt;
    }
    public static char[] func(String text){
        int len = findlen(text);
        char[] temp = new char[len];
        int uc = 0;
        for(int i=0;i<len;i++){
            char c = text.charAt(i);
            boolean flag = true;
            for(int j=0;j<i;j++){
                if(c == text.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                temp[i] = c;
                uc++;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char[] unique = func(text);    
        for(int i=0;i<unique.length;i++){
            System.out.println(unique[i] + " ");
        }    
        sc.close();
    }
}
