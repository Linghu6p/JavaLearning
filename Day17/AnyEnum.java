package Day17;

interface d {
    public String getDescription();

    public int getI();
}

public enum AnyEnum implements d {

    Constants_A {
        @Override
        public String getDescription() {
            return ("我是枚举成员A");
        }

        @Override
        public int getI() {
            return i++;
        }
    },
    Constants_B {
        @Override
        public String getDescription() {
            return ("我是枚举成员B");
        }

        @Override
        public int getI() {
            return i++;
        }
    },
    Constants_C {
        @Override
        public String getDescription() {
            return ("我是枚举成员C");
        }

        @Override
        public int getI() {
            return i++;
        }
    },
    Constants_D {
        @Override
        public String getDescription() {
            return ("我是枚举成员D");
        }

        @Override
        public int getI() {
            return i++;
        }
    };
    private static int i = 5;

    public static void main(String[] args) {
        for (int i = 0; i < AnyEnum.values().length; ++i) {
            System.out.println(AnyEnum.values()[i]+"调用getDescription()的方法为: "+AnyEnum.values()[i].getDescription());
            System.out.println(AnyEnum.values()[i]+"调用getI()的方法为: "+AnyEnum.values()[i].getI());
        }

    }

}
