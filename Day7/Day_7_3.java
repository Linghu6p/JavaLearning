package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class Day_7_3 {
    private Day_7_3[] qtest = new Day_7_3[6];
    private int nextIndex = 0;

    public void draw(Day_7_3 q) {
        if (nextIndex < qtest.length) {
            qtest[nextIndex] = q;
            System.out.println(nextIndex);
            nextIndex++;
        }
    }


    public static int add(int... a)//意思是输入很多数字 调用不定长参数
    {
        int s = 0;
        for (int i = 0; i < a.length; ++i)
            s += a[i];
        return s;
    }

    public static int dd(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; ++i)
            sum += array[i];
        return sum;
    }


    public static void main(String[] args) {


        Day_7_3 One = new Day_7_3();
        One.draw(new SquareA());
        One.draw(new Parallelogramgle());
        One.draw(new SquareA());
        One.draw(new SquareA());
        One.draw(new SquareA());
        One.draw(new SquareA());
        One.draw(new SquareA());
        One.draw(new SquareA());


        /*
        int a[] = new int[5];
        for(int i=0;i<a.length;++i)
        {
            Scanner scan = new Scanner(System.in);
            a[i] = scan.nextInt();
        }
        System.out.println(dd(a));

         */
        //System.out.println("dddd "+add(1,2,3,4,5,6,7,8,9,10));
    }
}

class SquareA extends Day_7_3 {
    public SquareA() {
        System.out.println("正方形");
    }

}
class Parallelogramgle extends Day_7_3{
    public Parallelogramgle()
    {
        System.out.println("平行四边形");
    }
}
