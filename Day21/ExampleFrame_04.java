package Day21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

/* 操作表格*/
public class ExampleFrame_04 extends JFrame {
    private JTable table;

    public ExampleFrame_04() {
        super();
        setBounds(600, 200, 700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("操作表格");

        Container c = getContentPane();
        c.setLayout(null);

        final JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setBounds(100, 10, 500, 300);


        String[] columnNames = {"A", "B", "C", "D", "E", "F", "G"};
        Vector<String> columnNameV = new Vector<>();
        for (int column = 0; column < columnNames.length; column++) {
            columnNameV.add(columnNames[column]);
        }
        Vector<Vector<String>> tableValueV = new Vector<>();
        for (int row = 1; row < 21; row++) {
            Vector<String> rowV = new Vector<>();
            for (int column = 0; column < columnNames.length; column++) {
                rowV.add(columnNames[column] + row);
            }
            tableValueV.add(rowV);
        }

        table = new JTable(tableValueV, columnNameV);
        table.setRowSelectionInterval(0, 3);// 设置选中行1-4
        table.addRowSelectionInterval(5, 5);// 添加选中行6
        //table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        jScrollPane.setViewportView(table);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(100, 320, 500, 40);
        //buttonPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        JButton selectAllButton = new JButton("全部选择");
        selectAllButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                table.selectAll();// 选中所有行
            }
        });

        JButton clearSelectionButton = new JButton("取消选择");
        clearSelectionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                table.clearSelection();// 取消所有选中行的选择状态
            }
        });

        buttonPanel.add(selectAllButton);
        buttonPanel.add(clearSelectionButton);

        c.add(buttonPanel);
        c.add(jScrollPane);


        System.out.println("表格共有" + table.getRowCount() + "行" + table.getColumnCount() + "列");//查询行列
        System.out.println("共有" + table.getSelectedRowCount() + "行被选中");
        System.out.println("第3行的选择状态为：" + table.isRowSelected(2));
        System.out.println("第5行的选择状态为：" + table.isRowSelected(4));
        System.out.println("被选中的第一行的索引是：" + table.getSelectedRow());
        int[] selectedRows = table.getSelectedRows();// 获得所有被选中行的索引
        System.out.print("所有被选中行的索引是：");
        for (int row = 0; row < selectedRows.length; row++) {
            System.out.print(selectedRows[row] + " ");
        }
        System.out.println();
        System.out.println("列移动前第2列的名称是：" + table.getColumnName(1));
        System.out.println("列移动前第2行第2列的值是：" + table.getValueAt(1, 1));
        table.moveColumn(1, 5);// 将位于索引1的列移动到索引5处
        System.out.println("列移动后第2列的名称是：" + table.getColumnName(1));
        System.out.println("列移动后第2行第2列的值是：" + table.getValueAt(1, 1));
        setVisible(true);
    }

    public static void main(String[] args) {
        new ExampleFrame_04();
    }
}
