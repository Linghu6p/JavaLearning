package Day18;

public class ThreadTest extends Thread{
    private int count = 10;
    public void run(){
        while (true)
        {
            System.out.print(count+" ");
            if (--count==0)
            {
                return;
            }
        }
    }
    public static void main(String[] args){
        ThreadTest threadTest = new ThreadTest();
        threadTest.run();
    }
}
