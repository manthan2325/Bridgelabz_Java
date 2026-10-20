import java.util.*;

public class InvertMap {
    static <K,V> Map<V,List<K>> invert(Map<K,V> map){
        Map<V,List<K>> invertmap = new HashMap<>();
        for(Map.Entry<K,V> entry : map.entrySet()){
            V value = entry.getValue();
            K key =  entry.getKey();
            invertmap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }
        return invertmap;
    }
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",1);
        Map<Integer,List<String>> mpp = invert(map);
        System.out.println(mpp);
    }
}
