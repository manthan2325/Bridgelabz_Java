import java.util.*;

public class Subset {
    static <T> boolean issub(Set<T> s1,Set<T> s2){
        if(s1.containsAll(s2)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(7,8,9));
        System.out.println("Subset is : " + issub(s1,s2));
    }
}
