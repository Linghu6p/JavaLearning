package Day1;

public class Gess {
    public static void main(String[] args) {
        char word = 'd', word2 = '@';
        int p = 23045, p2 = 45213;
        int a = 48;
        char p3 = '\u0031';//转义字符 16进制转义
        char p4 = '\065';//转义字符 8进制转义字符
        System.out.println("" + (char) a); //强制转换 看ascii码 也可以说是unicode码
        System.out.println("" + (int) word);
        System.out.println((p3));
        System.out.println(p4);
    }
}
