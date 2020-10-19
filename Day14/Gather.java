package Day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Gather {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> LNode = new LinkedList<>();// 建立链表
        list.add("a");
        list.add("b");
        list.add("c");
        int i = (int)(Math.random()*list.size()); // 产生0-2的随机数
        System.out.println(list.get(i));
        list.remove(2);//将指定位置的元素移除
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println((String)(it.next()));
        }
        System.out.println();
        LNode.add("q");
        LNode.add("w");
        LNode.add("e");
        it = LNode.iterator();
        while (it.hasNext()) {
            System.out.println((String)(it.next()));
        }

        LNode.set(1,"r");//修改某个位置 但是不能修改没有值的位置
        System.out.println();
        it = LNode.iterator();
        while (it.hasNext()) {
            System.out.println((String)(it.next()));
        }

    }
}
