package Day9;
// 内部类

public class Day_9_1 {

    protected static int k;
    private static int a = 0;
    Innerclass in = new Innerclass();
    class Innerclass{
        Innerclass()
        {
        }
        public void inf(){

        }
        int y = 0;
    }
    public Innerclass doit()
    {
        in.y = 4;
        return new Innerclass();
    }
    public static void main(String[] args)
    {
        int b = a;
        Day_9_1 out = new Day_9_1();
        Day_9_1.Innerclass in = out.doit();
        Day_9_1.Innerclass in2 = out.new Innerclass();
    }
}

