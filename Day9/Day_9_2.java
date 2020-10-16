package Day9;

// 接口实现内部类

interface OutInterface{
    public void f();
}

public class Day_9_2 {
    public static void main(String[] args)
    {
        Day_9_2_new out = new Day_9_2_new();
        OutInterface outinter = out.doit();
        outinter.f();
    }
}
class Day_9_2_new{
    /*当且仅当内部类才能被声明为private和protect*/
    private class Innerclass implements OutInterface{
        Innerclass(String S)
        {
            System.out.println(S);
        }
        public void f()
        {
            System.out.println("使用内部类的f()");
        }
    }
    public OutInterface doit()
    {
        return new Innerclass("访问内部构造方法");
    }
}