package Day18;

import javax.swing.*;
import java.awt.*;

/* 线程中断*/
public class InterruptedTest extends JFrame{
    private Thread thread;
    private final JProgressBar jProgressBar = new JProgressBar();
    public InterruptedTest() {
        super();
        setBounds(600,200,700,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        jProgressBar.setStringPainted(true);
        jProgressBar.setBounds(200,200,100,20);

        thread = new Thread(new Runnable() {
            int count = 0;
            @Override
            public void run() {

                while (true)
                {
                    jProgressBar.setValue(++count);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        System.out.println("当前线程被中断");
                        break;
                    }
                    if (count == 45) {
                        thread.interrupt();
                    }
                }
            }
        });
        thread.start();

        Container c = getContentPane();
        c.setLayout(null);
        c.add(jProgressBar);


        setVisible(true);
    }



    public static void main(String[] args){
        new InterruptedTest();
    }

}
