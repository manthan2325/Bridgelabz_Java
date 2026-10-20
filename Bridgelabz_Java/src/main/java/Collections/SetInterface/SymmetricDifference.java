import java.util.*;

public class SymmetricDifference {
    static <T> Set<T> intersectionarr(Set<T> a,Set<T> b){
        Set<T> result = new TreeSet<>(a);
        result.retainAll(b);
        return result;
    }
    static <T> Set<T> unionarr(Set<T> a,Set<T> b){
        Set<T> result = new TreeSet<>(a);
        result.addAll(b);
        return result;
    }
    static <T> Set<T> Symmetric(Set<T> a,Set<T> b){
        Set<T> result = unionarr(a,b);
        result.removeAll(intersectionarr(a, b));
        return result;

    }
    public static void main(String[] args) {
        
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,4,5));

        System.out.println("They are : " + Symmetric(s1,s2));

    }
}
