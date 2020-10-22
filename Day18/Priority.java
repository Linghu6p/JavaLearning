package Day18;

import javax.swing.*;
import java.awt.*;

/* 线程优先级*/

public class Priority extends JFrame {
    private JProgressBar jProgressBar_A = new JProgressBar();
    private JProgressBar jProgressBar_B = new JProgressBar();
    private JProgressBar jProgressBar_C = new JProgressBar();
    private JProgressBar jProgressBar_D = new JProgressBar();
    Thread thread_one, thread_two, thread_three, thread_four;


    public Priority() {
        setBounds(600, 200, 700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Container c = getContentPane();
        c.setLayout(null);
        c.add(jProgressBar_A);
        c.add(jProgressBar_B);
        c.add(jProgressBar_C);
        c.add(jProgressBar_D);

        jProgressBar_A.setBounds(200,100,100,20);
        jProgressBar_B.setBounds(200,150,100,20);
        jProgressBar_C.setBounds(200,200,100,20);
        jProgressBar_D.setBounds(200,250,100,20);
        jProgressBar_A.setStringPainted(true);
        jProgressBar_B.setStringPainted(true);
        jProgressBar_C.setStringPainted(true);
        jProgressBar_D.setStringPainted(true);


        thread_one = new Thread(new Create__thread(jProgressBar_A));
        thread_two = new Thread(new Create__thread(jProgressBar_B));
        thread_three = new Thread(new Create__thread(jProgressBar_C));
        thread_four = new Thread(new Create__thread(jProgressBar_D));



        setPriority("thread_one", 3, thread_one);
        setPriority("thread_two", 2, thread_two);
        setPriority("thread_three", 4, thread_three);
        setPriority("thread_four", 5, thread_four);


        setVisible(true);
    }

    public static void setPriority(String threadName, int priority, Thread t) {
        t.setPriority(priority);
        t.setName(threadName);
        t.start();
    }

    private class Create__thread implements Runnable {
        private final JProgressBar bar;
        int count = 0;

        private Create__thread(JProgressBar bar) {
            this.bar = bar;
        }

        @Override
        public void run() {
            while (true) {
                bar.setValue(count += 10);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("The Thread is interrupted!");
                }
            }

        }

    }

    public static void main(String[] args) {
        new Priority();
    }


}
