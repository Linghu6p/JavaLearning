package Day12;

import Day11.JScrollPaneTest;

import javax.swing.*;
import java.awt.*;

public class JListTest extends JFrame {
    public JListTest() {
        String S = "姓名" + "       " + "学号";
        JLabel jla = new JLabel(S);
        jla.setFont(new Font("包图小白体", Font.PLAIN, 24));
        jla.setBounds(50, 0, 200, 100);
        setBounds(600, 200, 700, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        JList<String> jl = new JList<>(new MyListModel());
        JScrollPane js = new JScrollPane(jl);
        js.setBounds(50, 80, 200, 100);
        c.add(js);
        c.add(jla);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JListTest();
    }
}

class MyListModel extends AbstractListModel<String> {
    String space = "                    ";
    private String[] contents = {"AAA" + space + "18130500173", "BBB" + space + "18130500170",
            "CCC" + space + "18130500170", "DDD" + space + "18130500170",
            "EEE" + space + " 18130500170", "FFF" + space + "  18130500170",
            "GGG" + space + "18130500170"};

    public String getElementAt(int x) {
        if (x < contents.length)
            return contents[x++];
        else
            return null;
    }

    public int getSize() {
        return contents.length;
    }
}