package Day7;

class Quadrangle{
    String  name = "555";
    public static void draw(Quadrangle q)
    {
        System.out.println("ssssss");
    }
}
class Square extends Quadrangle{

}
class Anything{

}


public class Day_7_2 extends Quadrangle{

    public static void main(String[] args)
    {

        /*
        Day_7_2 P = new Day_7_2();
        draw(P);*/
        /*
        draw(new Day_7_2());
        Quadrangle q = new Day_7_2();
        Day_7_2 p = (Day_7_2) q;//父类赋给子类 并强制转换
        */

        Quadrangle q = new Quadrangle();
        Day_7_2 z = new Day_7_2();
        if(q instanceof Day_7_2)//判断 q 是不是 Day_7_2的父类
        {
            Day_7_2 p = (Day_7_2) q;
        }
        if(q instanceof Square)
        {
            Square s = (Square)q;
        }
        System.out.println(z instanceof Quadrangle);
    }

}
