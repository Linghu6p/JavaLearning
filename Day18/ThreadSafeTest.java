package Day18;

/* 线程安全*/
/* 此例为资源冲突*/
public class ThreadSafeTest implements Runnable{

    int num = 10;
    @Override
    public void run() {
        while (true) {
            if(num > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("tickets"+num--);
            }
        }
    }

    public static void main(String[] args){
        ThreadSafeTest threadSafeTest = new ThreadSafeTest();
        Thread tA = new Thread(threadSafeTest);
        Thread tB = new Thread(threadSafeTest);
        Thread tC = new Thread(threadSafeTest);
        Thread tD = new Thread(threadSafeTest);
        tA.start();
        tB.start();
        tC.start();
        tD.start();
    }
}
