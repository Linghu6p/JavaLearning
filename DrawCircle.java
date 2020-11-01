package Day25;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame {
    private int OVAL_WIDTH = 80;
    private int OVAL_HEIGHT = 80;

    public DrawCircle() {
        super();
        setBounds(600, 200, 700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setContentPane(new DrawPanel());

        //c.add();

        setVisible(true);
    }

    class DrawPanel extends JPanel {
        public void paint(Graphics g) {
            super.paint(g);
            g.drawOval(10, 10, OVAL_WIDTH, OVAL_HEIGHT);
            g.drawOval(80, 10, OVAL_WIDTH, OVAL_HEIGHT);
            g.drawOval(150, 10, OVAL_WIDTH, OVAL_HEIGHT);
            g.drawOval(50, 70, OVAL_WIDTH, OVAL_HEIGHT);
            g.drawOval(120, 70, OVAL_WIDTH, OVAL_HEIGHT);
        }
    }

    public static void main(String[] args) {
        new DrawCircle();
    }

}
