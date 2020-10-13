package Day4;

import java.util.Random;

public class Day_4_1 {

    public static void main(String[] args) {
        //TestMathFunction();
        //char c = (char)('a' + Math.random() * 27);
        //System.out.println(c);
        RandomDemo();
    }

    private static void TestMathFunction() {
        System.out.println(Math.sin(Math.PI / 2)); // sin 90
        System.out.println(Math.asin(0)); //arcsin 0
        System.out.println(Math.exp(2));//e^2
        System.out.println(Math.log(2));//ln2
        System.out.println(Math.log10(2));//lg2
        System.out.println(Math.cbrt(8));//8的力方根
        System.out.println(Math.ceil(5.6));//向上取整
        System.out.println(Math.floor(2.5));//向下取整
        System.out.println(Math.rint(2.7));//返回最接近的整数 3
        System.out.println(Math.rint(2.5));//2
        System.out.println(Math.round(3.4f));//加0.5取整 这里的取整是 向下取整
        System.out.println(Math.round(2.5));//加0.5取整并且转换为long型
    }

    public static int GetEvenNum(double num1, double num2) {
        int s = (int) num1 + (int) (Math.random() * (num2 - num1));
        if (s % 2 == 0)
            return s;
        else
            return s + 1;
    }
    public static void RandomDemo(){
        Random r = new Random();
        System.out.println(r.nextInt());//随机整数
        System.out.println(2+r.nextInt());//2-12(!=12)
        System.out.println(r.nextGaussian());//高斯分布高精度
        System.out.println(r.nextBoolean());
        System.out.println(r.nextDouble());
        System.out.println(r.nextFloat());
    }
}
