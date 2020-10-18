package Day11;

import javax.swing.*;
import java.awt.*;

// JScrollPane 面板

public class JScrollPaneTest extends JFrame {
    public JScrollPaneTest() {
        Container c = getContentPane();
        JTextArea ta = new JTextArea(20, 50);
        JScrollPane sp = new JScrollPane(ta);
        c.add(sp);
        setTitle("aaaaaa");
        setSize(600, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JScrollPaneTest();
    }
}
