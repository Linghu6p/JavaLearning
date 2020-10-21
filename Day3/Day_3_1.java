package Day3;

import java.text.DecimalFormat;

public class Day_3_1 {
    String name;

    public Day_3_1() {
        //this("aaa");//可以通过this调用有参
        //System.out.println(this.name);
    }

    public Day_3_1(String name) {
        // this.name = name;
        // System.out.println(name);
    }

    public static void main(String[] args) {
        //Charac();
        // GetBoolean();
        /*
        SimgleFormat("###,###.###",123456.789);
        SimgleFormat("00000000.###kg",123456.789);
        SimgleFormat("000000.78",123.78);
        UseApplyPaatternMethodFormat("#.###%",0.789);//见书155 将小数转为百分数
        UseApplyPaatternMethodFormat("###.##",123456.79);
        UseApplyPaatternMethodFormat("0.00\u2030",0.789);// 155 变成千分数
        */
        DecimalMethod();
    }

    //Integer 类
    static void Charac() {
        String Str1 = Integer.toString(456);
        String Str2 = Integer.toBinaryString(456);
        String Str3 = Integer.toHexString(456);
        String Str4 = Integer.toOctalString(456);
        String Str[] = {"5", "9", "62", "31"};
        int Sum = 0;
        for (int i = 0; i < Str.length; i++) {
            int NUm = Integer.parseInt(Str[i]);
            Sum += NUm;
        }
        System.out.println(Str1 + " " + Str2 + " " + Str3 + " " + Str4);
        System.out.println(Sum);
    }

    static void GetBoolean() {
        Boolean B1 = new Boolean(true);
        Boolean B2 = new Boolean("ok");
        System.out.println(B1.booleanValue());
        System.out.println(B2.booleanValue());
    }

    static void UpperOrLower() {
        Character mychar1 = new Character('A');
        Character mychar2 = new Character('a');
        System.out.println(Character.isUpperCase(mychar1));
        System.out.println(Character.isLowerCase(mychar2));

    }

    static public void SimgleFormat(String pattern, double value) {
        DecimalFormat myFormat = new DecimalFormat(pattern);
        String output = myFormat.format(value);
        System.out.println(value + " " + pattern + " " + output);
    }

    static public void UseApplyPaatternMethodFormat(String patttern, double value) {
        DecimalFormat myFormat = new DecimalFormat();
        myFormat.applyPattern(patttern);
        System.out.println(value + " " + patttern + " " + myFormat.format(value));
    }

    //数字分组
    static void DecimalMethod() {
        DecimalFormat myFormat = new DecimalFormat();
        myFormat.setGroupingSize(4);
        String output = myFormat.format(123456.789);
        System.out.println(output);
        myFormat.setGroupingUsed(false);
        String output2 = myFormat.format(123456.789);
        System.out.println(output2);
    }
}
