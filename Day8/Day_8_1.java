import java.util.Scanner;


// 抽象类与接口


// 定义接口
interface drawTest {
    public void draw();

    public void doAnyThing();//必须在接口内定义了 才能引用要不然方法引用不了
}

interface ti extends drawTest {

}

class ParallelogaramgleUseInterface extends Day_8_1 implements drawTest {
    public void draw() {
        System.out.println("AAAA");
    }

    public void doAnyThing() {
        System.out.println("aaaa");
    }
}


class Anything extends Day_8_1 implements drawTest {
    public void draw() {
        System.out.println("WWWW");
    }

    public void doAnyThing() {
        System.out.println("wwww");
    }
}

class AnyThingUseInterface extends Day_8_1 {
    public void doAnyThing() {
        System.out.println("QQQQ");
    }
}

class Test extends Day_8_1 implements ti {
    public void draw() {
        System.out.println("WWYSB");
    }
}

public class Day_8_1 {
    public void doAnyThing() {
        System.out.println("ZZZZ");
    }

    public static void main(String[] args) {
        /*
        drawTest[] d = {new ParallelogaramgleUseInterface(), new Anything()};
        for (drawTest i : d)
        {
            i.draw();
            i.doAnyThing();
        }
         */
        ti Q = new Test();
        Q.draw();
        Q.doAnyThing();
    }
}
