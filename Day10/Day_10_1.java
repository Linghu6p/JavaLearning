package Day10;
// 异常处理
// 具体异常见p215

public class Day_10_1 {

    static int avg(int number1,int number2) throws MyException
    {
        if (number1<0||number2<0)
            throw new MyException("不可使用负数");
        if(number1>100||number2>100)
            throw new MyException("数值太大了");
        return (number1+number2)/2;
    }
    public static void main(String[] args)
    {
        try {
            int result = avg(102,150);
            System.out.println(result);
        }catch (MyException e)
        {
            System.out.println(e);
        }
        /*
        try{
            String str = "lili";
            System.out.println(str+" 年龄是:");
            int age = Integer.parseInt("20L");
            System.out.println(age);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("program over");

        */
    }
}
// 自定义异常
class MyException extends Exception{
    public MyException(String ErrorMessage)
    {
        super(ErrorMessage);
    }

}
