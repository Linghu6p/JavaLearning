package Day5;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Day5_1 {

    static final int location = 10;//代表保留几位

    public static void main(String[] args)
    {
        BigDecimalDemo();
        //BigIntegerDemo();
    }

    public static void BigIntegerDemo()
    {
        // 支持任意精度的整数
        BigInteger bigInstance = new BigInteger("4");
        System.out.println(bigInstance.add(new BigInteger("2")));//4+2
        System.out.println(bigInstance.subtract(new BigInteger("2")));//4-2
        System.out.println(bigInstance.multiply(new BigInteger("5")));//4*5;
        System.out.println(bigInstance.divideAndRemainder(new BigInteger("3"))[0]);//4/3的商
        System.out.println(bigInstance.divideAndRemainder(new BigInteger("3"))[1]);//余数

    }

    public static void BigDecimalDemo(){
        BigDecimal b = new BigDecimal(Double.toString(11));
        BigDecimal c = new BigDecimal(Double.toString(3));
        System.out.println(b.divide(c,2,BigDecimal.ROUND_HALF_UP));//保留两位数字 第三个表示四舍五入
    }
}
