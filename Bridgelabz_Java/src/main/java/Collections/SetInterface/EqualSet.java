import java.util.*;

public class EqualSet {
    static <T> boolean areEqual(T a,T b){
        return a.equals(b);
    }
    public static void main(String[] args) {
        
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,2,1));

        System.out.println("They are : " + areEqual(s1,s2));

    }
}
