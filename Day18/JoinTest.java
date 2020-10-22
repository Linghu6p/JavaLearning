package Day18;
/* 线程的加入*/

import javax.swing.*;
import java.awt.*;

public class JoinTest extends JFrame {
    private Thread A;
    private Thread B;
    final JProgressBar ProgressBar = new JProgressBar(); //定义两个进度条组件
    final JProgressBar jProgressBar = new JProgressBar();//第二个
    int count = 0;

    public JoinTest() {
        super();
        Container C = getContentPane();
        C.add(ProgressBar, BorderLayout.NORTH);
        C.add(jProgressBar, BorderLayout.SOUTH);
        ProgressBar.setStringPainted(true);//显示数字
        jProgressBar.setStringPainted(true);//显示数字
        A = new Thread(new Runnable() {
            int count = 0;

            @Override
            public void run() {
                while (true) {
                    ProgressBar.setValue(++count);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (count == 50) {
                        break;
                    }
                }
            }
        });
        A.start();
        B = new Thread(new Runnable() {
            int count = 0;

            @Override
            public void run() {
                while (true) {
                    jProgressBar.setValue(++count);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (count == 100)
                    {
                        count = 0;
                    }
                }
            }
        });
        B.start();
    }

    public static void init(JFrame jFrame) {
        jFrame.setBounds(600,200,100,100);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
    }
    public static void main(String[] args) {
        init(new JoinTest());
    }
}
