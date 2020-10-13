package Day7;


class V {
    String name;
    String id;

    // 重构  equals
    public boolean equals(Object obj) {
        V v = (V) obj;
        boolean b1 = this.id.equals(v.id);
        boolean b2 = this.name.equals(v.name);
        return b1 && b2;
    }


}

// Object类
public class Day_7_1 {
    //重构toString
    public String toString() {
        return "A " + getClass().getName() + " BBB";//获取类名
    }

    public static void OverWriteEquals() {
        String S1 = "123";
        String S2 = "123";
        System.out.println(S1.equals(S2));
        V v1 = new V();
        V v2 = new V();
        v1.id="shabi";
        v1.name="wwy";
        v2.id="shabi";
        v2.name="wwy";
        System.out.println(v1.equals(v2));
    }

    public static void main(String[] args) {
        //System.out.println(new Day_7_1());
        OverWriteEquals();
    }

}