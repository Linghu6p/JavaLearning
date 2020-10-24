package Day21;

import javax.swing.*;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;

public class ExampleFrame_05 extends JFrame {

    public ExampleFrame_05() {
        setBounds(600, 200, 700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Container c = getContentPane();
        c.setLayout(null);

        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setBounds(10, 10, 400, 300);

        JTable jTable;
        String[] columnNames = {"A", "B"};
        String[][] tableValues = {{"A1","B1"},{"A2","B2"},{"A3","B3"},{"A4","B4"}};
        // 创建指定表格列名和表格数据的表格模型
        DefaultTableModel tableModel = new DefaultTableModel(tableValues, columnNames);

        jTable = new JTable(tableModel);
        jTable.setRowSorter(new TableRowSorter<>(tableModel));
        jScrollPane.setViewportView(jTable);

        c.add(jScrollPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ExampleFrame_05();
    }
}
