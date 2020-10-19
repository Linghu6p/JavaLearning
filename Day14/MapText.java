package Day14;

import java.util.*;

public class MapText {

    public static void main(String[] args) {

        Map map = new HashMap<>();

        map.put(6, "qwww");
        map.put(1, "qqq");
        map.put(5, "eee");
        map.put(3, "eee");
        map.put(2, "eee");


        Set set = map.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Object str = it.next();
            Object name = map.get(str);
            System.out.println(str + " " + name);
        }
        System.out.println();
        TreeMap treeMap = new TreeMap<>();
        treeMap.putAll(map);
        Iterator qt = treeMap.keySet().iterator();
        while (qt.hasNext()) {
            Object str = qt.next();
            Object name = treeMap.get(str);
            System.out.println(str + " " + name);
        }

    }
}

class Emp {
    private String e_id;
    private String e_name;

    public Emp(String e_id, String e_name) {
        this.e_id = e_id;
        this.e_name = e_name;
    }

    public String getE_id() {
        return e_id;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_id(String e_id) {
        this.e_id = e_id;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }
}
