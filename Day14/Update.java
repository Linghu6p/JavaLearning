package Day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Update implements Comparable<Object> {
    String name;
    long id;

    public Update(String name, long id) {
        this.id = id;
        this.name = name;
    }

    @Override
    // 用于排序
    public int compareTo(Object o) {
        Update upstu = (Update) o;
        int result = id > upstu.id ? 1 : (id == upstu.id ? 0 : -1);
        return result; // 如果return 1 就是按序输出
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getID() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public static void main(String[] args) {
        Update stu1 = new Update("王文尧1号",1111);
        Update stu2 = new Update("王文尧2号",2222);
        Update stu3 = new Update("王文尧3号",3333);
        Update stu4 = new Update("王文尧4号",4444);

        TreeSet<Update> tree = new TreeSet<>();
        tree.add(stu1);
        tree.add(stu2);
        tree.add(stu3);
        tree.add(stu4);
        Iterator<Update> it = tree.iterator();

        while (it.hasNext()) {
            Update stu = (Update)(it.next()); 
            System.out.println(stu.getID()+" "+stu.getName());
        }
        List<String> list= new ArrayList<>();
        list.add("1");
        list.add("5");
        list.add("3");
        Iterator<String> qt = list.iterator();
        while (qt.hasNext()) {
            System.out.println((String)qt.next());
        }
        
    }
}
