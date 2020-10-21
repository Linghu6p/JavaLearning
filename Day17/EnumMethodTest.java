package Day17;

import static java.lang.System.out;

public class EnumMethodTest {
    enum Constants {
        Constants_A, Constants_B
    }

    public static void compare(Constants c) {
        for (int i = 0; i < Constants.values().length; ++i) {
            out.println(c + "与" + Constants.values()[i] + "的比较结果为: " + c.compareTo(Constants.values()[i]));
        }
    }
    public static void main(String[] args) {
        compare(Constants.valueOf("Constants_B"));
    }
}
