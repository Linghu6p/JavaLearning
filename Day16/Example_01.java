package Day16;


//  构造方法
public class Example_01 {
    String s;
    int i1, i2, i3;

    private Example_01() {
    }

    protected Example_01(String s, int i1) {
        this.i1 = i1;
        this.s = s;
    }

    public Example_01(String... strings) throws NumberFormatException {
        if (strings.length>0)
            i1 = Integer.valueOf(strings[0]);
        if (strings.length>1)
            i2 = Integer.valueOf(strings[1]);
        if (strings.length>1)
            i3 = Integer.valueOf(strings[2]);
    }

    public void print() {
        System.out.println("s = " + s);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }
}
