package Day21;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

// 提供行标题栏的表格 即左右滚动后左边的序号依然在
public class ExampleFrame_07 extends JFrame {
    public ExampleFrame_07() {
        super();
        setResizable(false);
        setTitle("提供行标题栏的表格");
        setBounds(100, 100, 500, 375);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Vector<String> columnNameV = new Vector<>();
        columnNameV.add("日期");
        for (int i = 1; i < 21; i++) {
            columnNameV.add("商品" + i);
        }
        Vector<Vector<Object>> tableValueV = new Vector<>();
        for (int row = 1; row < 31; row++) {
            Vector<Object> rowV = new Vector<>();
            rowV.add(row);
            for (int col = 0; col < 20; col++) {
                rowV.add((int) (Math.random() * 1000));
            }
            tableValueV.add(rowV);
        }
        final MFixedColumnTable panel = new MFixedColumnTable(columnNameV, tableValueV, 1);

        getContentPane().add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ExampleFrame_07();
    }
}
