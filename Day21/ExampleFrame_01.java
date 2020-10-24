package Day21;

import javax.swing.*;
import java.awt.*;

public class ExampleFrame_01 extends JFrame {
    public ExampleFrame_01() {
        super();
        setTitle("可滚动的表格");
        setBounds(600,200,700,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        String[] columnNames = {"Name","Number"};//定义列名
        String[][] tableValues = {{"王文尧","傻逼一号"},{"狗头","傻逼二号"},
                {"王文rao","傻逼三号"},{"蒜娃","傻逼四号"}};
        JTable table = new JTable(tableValues,columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(0,0,240,200);
        Container c = getContentPane();
        c.setLayout(null);
        c.add(scrollPane);
        setVisible(true);

    }


    public static void main(String[] args) {
        new ExampleFrame_01();
    }
}
