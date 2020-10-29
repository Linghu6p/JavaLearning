package Day24;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableModelEvent_Example extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;//声明一个表格模型

    private JTextField aTextField;
    private JTextField bTextField;

    public TableModelEvent_Example() {
        super();
        setBounds(600,200,700,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        final JScrollPane scrollPane = new JScrollPane();
        Container c = getContentPane();
        c.add(scrollPane,BorderLayout.CENTER);

        String[] columnNames = { "A", "B" };
        String[][] rowValues = { { "A1", "B1" }, { "A2", "B2" },
                { "A3", "B3" }, { "A4", "B4" } };

        tableModel = new DefaultTableModel(rowValues, columnNames);
        tableModel.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(javax.swing.event.TableModelEvent e) {
                int type = e.getType();
                int row = e.getFirstRow() + 1;// 获得触发此次事件的表格行索引
                int column = e.getColumn() + 1;// 获得触发此次事件的表格列索引
                if (type== TableModelEvent.INSERT)
                {
                    System.out.print("此次事件由 插入 行触发，");
                    System.out.println("此次插入的是第 " + row + " 行！");
                    // 判断是否有修改行触发
                } else if (type == TableModelEvent.UPDATE) {
                    System.out.print("此次事件由 修改 行触发，");
                    System.out.println("此次修改的是第 " + row + " 行第 " + column
                            + " 列！");
                    // 判断是否有删除行触发
                } else if (type == TableModelEvent.DELETE) {
                    System.out.print("此次事件由 删除 行触发，");
                    System.out.println("此次删除的是第 " + row + " 行！");
                } else {
                    System.out.println("此次事件由 其他原因 触发！");
                }
            }
        });
        table = new JTable(tableModel);// 利用表格模型对象创建表格对象
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollPane.setViewportView(table);
        final JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.SOUTH);
        final JLabel aLabel = new JLabel("A：");
        panel.add(aLabel);
        aTextField = new JTextField(15);
        panel.add(aTextField);
        final JLabel bLabel = new JLabel("B：");
        panel.add(bLabel);
        bTextField = new JTextField(15);
        panel.add(bTextField);
        final JButton addButton = new JButton("添加");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] rowValues = { aTextField.getText(),
                        bTextField.getText() };
                tableModel.addRow(rowValues);// 向表格模型中添加一行
                aTextField.setText(null);
                bTextField.setText(null);
            }
        });
        panel.add(addButton);
        final JButton delButton = new JButton("删除");
        delButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 获得表格中的选中行
                int[] selectedRows = table.getSelectedRows();
                for (int row = 0; row < selectedRows.length; row++) {
                    // 从表格模型中移除表格中的选中行
                    tableModel.removeRow(selectedRows[row] - row);
                }
            }
        });
        panel.add(delButton);



        setVisible(true);

    }

    public static void main(String[] args) {
        new TableModelEvent_Example();
    }
}
