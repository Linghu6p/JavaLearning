package Day14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Collection 接口
public class Muster {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator<String> it = list.iterator(); //设置迭代器
        while (it.hasNext()) {
            String str = (String) it.next();
            System.out.println(str);
        }
    }
}
