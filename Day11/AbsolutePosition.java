package Day11;

import javax.swing.*;
import java.awt.*;

// 绝对布局 分别还有流布局 边界布局 网格布局 网格组布局
public class AbsolutePosition extends JFrame {
    public AbsolutePosition() {
        setTitle("啊啊啊啊啊");
        setLayout(null);
        setBounds(0, 0, 700, 500);
        Container c = getContentPane();
        JButton B1 = new JButton("CCCC");
        B1.setBounds(500, 300, 100, 30);
        c.add(B1);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new AbsolutePosition();
    }
}
