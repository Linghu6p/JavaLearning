package Day18;

/* 同步块和同步机制*/
public class SolveThreadSafe implements Runnable {

    int num = 10;

    @Override
    public void run() {
        while (true) {

            synchronized ("") {//同步块 也可以讲同步块更换为同步方法doit
                if (num > 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("tickets" + --num);
                }
            }
            //doIt();
        }
    }

    // 同步方法
    public synchronized void doIt() {
        if (num > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("tickets" + --num);
        }
    }

    public static void main(String[] args) {
        SolveThreadSafe t = new SolveThreadSafe();
        Thread tA = new Thread(t);
        Thread tB = new Thread(t);
        Thread tC = new Thread(t);
        Thread tD = new Thread(t);
        tA.start();
        tB.start();
        tC.start();
        tD.start();
    }
}
