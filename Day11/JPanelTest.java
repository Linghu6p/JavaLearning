package Day11;

import javax.swing.*;
import java.awt.*;

// JPanel 模板
public class JPanelTest extends JFrame {
    public JPanelTest() {
        Container c = getContentPane();
        c.setLayout(new GridLayout(2, 1, 10, 10));


        JPanel P1 = new JPanel(new GridLayout(1, 3, 10, 10));
        P1.add(new JButton("1"));
        P1.add(new JButton("2"));
        P1.add(new JButton("3"));
        c.add(P1);
        JPanel P2 = new JPanel(new GridLayout(1, 2, 10, 10));
        P2.add(new JButton("4"));
        P2.add(new JButton("5"));
        c.add(P2);
        JPanel P3 = new JPanel(new GridLayout(1, 2, 10, 10));
        P3.add(new JButton("6"));
        P3.add(new JButton("7"));
        c.add(P3);
        JPanel P4 = new JPanel(new GridLayout(2, 1, 10, 10));
        P4.add(new JButton("8"));
        P4.add(new JButton("9"));
        c.add(P4);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JPanelTest();
    }
}
