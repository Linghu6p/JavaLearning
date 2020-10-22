package Day18;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class SwingAndThread extends JFrame {
    private JLabel jl = new JLabel();
    private static Thread t;
    private int count = 0;
    private Container c = getContentPane();

    public SwingAndThread() {
        setBounds(600, 200, 700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        c.setLayout(null);
        URL url = SwingAndThread.class.getResource("QQ图片20201021191611.gif");
        Icon icon = new ImageIcon(url);
        jl.setIcon(icon);
        jl.setHorizontalAlignment(SwingConstants.LEFT);
        jl.setBounds(0, 0, 200, 100);
        jl.setOpaque(true);//表面为不透明
        t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (count <= 700) {
                    jl.setBounds(0, count, 200, 100);
                    try {
                        Thread.sleep(30);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    count += 20;
                    if (count == 700) {
                        count = 0;
                    }
                }
            }
        });
        t.start();
        c.add(jl);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingAndThread();
    }

}
