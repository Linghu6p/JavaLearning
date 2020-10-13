package Day6;
// 继承

class One {
    One() {
        System.out.println("One");
    }
}

class Two extends One {
    Two() {
        System.out.println("Two");
    }
}

public class Day6_2 extends Two {
    Day6_2() {
        System.out.println("王文尧是个傻逼");
    }
    public static void main(String[] args)
    {
        Day6_2 D = new Day6_2();
    }


}
