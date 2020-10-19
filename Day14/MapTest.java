package Day14;

import java.util.*;

public class MapTest {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "John");
        map.put("2", "Lisa");
        map.put("3", "Mike ");
        map.put("4", "Joe");
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println((String) it.next());
        }
        Collection<String> coll = map.values();
        it = coll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
