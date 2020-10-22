package Day18;


import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SleepMethodTest extends JFrame {
    private Thread T;
    private static Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.GREEN,
            Color.ORANGE, Color.YELLOW, Color.RED, Color.PINK, Color.LIGHT_GRAY};
    private static final Random rand = new Random();

    public static Color getC() {
        return colors[rand.nextInt(colors.length)];
    }

    public SleepMethodTest() {


        T = new Thread(new Runnable() {
            int x = 0;
            int y = 10;
            int z = 500;

            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(100); //!!!!!!!时间不宜短 否则会使得graphics 为null

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Graphics graphics = getGraphics();
                    graphics.setColor(getC());
                    graphics.drawLine(x, y, 700, y++);

                    if (y >= 250) {
                        y = 200;
                    }
                }
            }
        });
        T.start();

        setVisible(true);
    }


    public static void init(JFrame frame, int x, int y) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(600, 200, x, y);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        init(new SleepMethodTest(), 700, 500);
    }
}
