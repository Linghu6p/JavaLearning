package Day17;

public class EnumIndexTestAnother {
    enum Constants2 {
        CONSTANTS_A("我是枚举成员A"),
        CONSTANTS_B("我是枚举成员B"),
        CONSTANTS_C("我是枚举成员C"),
        CONSTANTS_D(3);
        private String description;
        private int i = 4;

        private Constants2(String description) {
            this.description = description;
        }

        private Constants2(int i) {

            this.i += i;
        }

        public String getDescription() {
            return description;
        }

        public int getI() {
            return i;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < Constants2.values().length; ++i) {
            System.out.println(Constants2.values()[i] + "调用的getDescription方法为:" + Constants2.values()[i].getDescription());
        }
        System.out.println(Constants2.valueOf("CONSTANTS_D") + "调用getI()的方法为：" + Constants2.valueOf("CONSTANTS_D").getI());
    }
}
