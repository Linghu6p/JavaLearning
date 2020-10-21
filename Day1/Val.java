package Day1;

import java.time.Year;
import java.util.Date; // 获取今天日期 日期格式化 p93 时间格式化 p94

public class Val {
    static int times = 3; //静态变量 也可说成类变量
    static String S1 = "SSS";

    public static void main(String[] args) {
        String S1 = new String("Hello oop");
        String S = S1;
        int size = S.length();
        int where = S1.indexOf("o");//查找Hello中o的位置
        int last_where = S1.lastIndexOf("o");//o最后的位置
        char mychar = S1.charAt(6);//查找第6个位置
        int times = 4;
        // Find();
        // System.out.println(" " + where + " " + last_where + " " + mychar);
        // Func();
        // NewStr();
        // StartOrEnd();
        // Wordbook();
        // alp_exchange();
        // division();
        // Eval();
        // Judge();
        Jerque();
    }

    /* 字符串生成器*/
    static void Jerque() {
        StringBuilder S1 = new StringBuilder("");//和String功能一样 但是开销更低
        long starTime = System.currentTimeMillis();//计算开始时间
        S1.append("Hello");
        S1.insert(5,"world!");
        long endTime = System.currentTimeMillis();
        long Time = endTime - starTime;
        //System.out.println(S1 + " " + String.format("%S", Time));
        System.out.println(S1.toString());
        S1.delete(0,6); //删除S1[0]-S1[5]
        System.out.println(S1.toString());

    }

    /* 正则表达式匹配*/
    static void Judge() {
        // 正则表达式 \\w+ 字符有一到多个 @一个 \\w+ 一样 (\\.\\w{2,3})*代表 括号内的可以有0或多次 即.abc 或.ab \\w{2,3}字符出现二到三次
        String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";

        String S1 = "2635192486@qq.com";
        String S2 = "XJHLing@xidian.edu.cn";

        System.out.println(S1.matches(regex));//匹配正则表达式
        System.out.println(S2.matches(regex));
    }


    /* 格式化字符串*/
    static void Eval() {
        Date date = new Date(); // 创建对象
        String time = String.format("%tT", date);//时分秒
        String form = String.format("%tF", date);// 年-月-日
        String year = String.format("%tY", date);
        String month = String.format("%tB", date);
        String day = String.format("%td", date);
        String week = String.format("%tA", date);//ta tA 的区别在于 前面是MON 后面是 MONDAY（指定环境的都是）中文便是 周四和星期四的区别
        String hour = String.format("%tH", date);
        String minute = String.format("%tM", date);
        String second = String.format("%tS", date);
        System.out.println(year + " " + month + " " + day + " " + week);
        System.out.println(hour + ":" + minute + ":" + second);
        System.out.println(form + "\n" + time);
        System.out.println(String.format("%o", 9));//转八进制 %b转 bool %h 转hash
    }

    static void division() {
        String str = "192+168.1.1";
        String[] first = str.split("\\."); //正则表达式 可以理解为转义字符 遇到.就分割
        String[] second = str.split("\\.", 2);//意思是匹配一次 可以理解为分割为几部分
        System.out.println("[" + str + "]");
        System.out.print("");//输出不换行 ln 为输出后换行
        for (String a : first)
            System.out.print("[" + a + "]");
        System.out.println();
        for (String b : second)
            System.out.print("[" + b + "]");

    }

    static void Wordbook() {
        String s1 = "acd";
        String s2 = "acc";
        System.out.println(s1.equals(s2));//比较两个字符串是否相等 且不忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2));//和上面一样 但是忽略大小写
        System.out.println(s1.compareTo(s2)); //在Unicode里的顺序比较
    }


    static void alp_exchange() {
        String S1 = "abc DEF";
        String S2 = S1.toUpperCase();
        String S3 = S1.toLowerCase();
        System.out.println(S2 + " " + S3);
    }

    static void StartOrEnd() {
        String str_1 = "22045612";
        String str_2 = "21304578";
        boolean num_1 = str_1.startsWith("22");
        boolean num_2 = str_1.endsWith("12");
        boolean num_3 = str_2.startsWith("20");
        boolean num_4 = str_2.endsWith("79");
        System.out.println(num_1 + " " + num_2 + " " + num_3 + " " + num_4);
    }

    static void NewStr() {
        String str = "wwydashabi";
        String new_str = str.replace("w", "W");
        System.out.println(new_str);
    }

    static void Func() {
        String str = "Hello World";
        String substr = str.substring(3); //从 str[3]开始遍历
        String substr_1 = str.substring(0, 5);//到str[4] 不是5
        System.out.println(substr + "\n" + substr_1);
    }

    static void Find() {
        System.out.println(times);
    }

}
