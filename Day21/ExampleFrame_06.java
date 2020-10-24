package Day21;

import javax.swing.*;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/* 表格实时操作*/

public class ExampleFrame_06 extends JFrame {
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField aTextField = new JTextField();
    private JTextField bTextField = new JTextField();

    public ExampleFrame_06() {
        setBounds(600, 200, 700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setBounds(10, 10, 400, 300);

        Container c = getContentPane();
        c.setLayout(null);

        String[] columnNames = {"A", "B"};// 定义表格列名数组
        String[][] tableValues = {{"A1", "B1"}, {"A2", "B2"},
                {"A3", "B3"}, {"A4", "B4"}};// 定义表格数据数组


        tableModel = new DefaultTableModel(tableValues, columnNames);


        table = new JTable(tableModel);// 创建指定表格模型的表格
        table.setRowSorter(new TableRowSorter<>(tableModel));// 设置表格的排序器
        // 设置表格的选择模式为单选
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = table.getSelectedRow();
                // 从表格模型中获得指定单元格的值
                Object oa = tableModel.getValueAt(selectedRow, 0);
                // 从表格模型中获得指定单元格的值
                Object ob = tableModel.getValueAt(selectedRow, 1);
                aTextField.setText(oa.toString());// 将值赋值给文本框
                bTextField.setText(ob.toString());// 将值赋值给文本框
            }
        });

        jScrollPane.setViewportView(table);

        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jPanel.setBounds(10, 320, 400, 80);
        jPanel.setLayout(null);

        JLabel jLabel = new JLabel("A：");
        jLabel.setBounds(10, 15, 35, 20);
        jLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jLabel.setFont(new Font("楷体", Font.BOLD, 20));

        JLabel jLabel_new = new JLabel("B：");
        jLabel_new.setBounds(210, 15, 35, 20);
        jLabel_new.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jLabel_new.setFont(new Font("楷体", Font.BOLD, 20));

        aTextField = new JTextField("A4");
        aTextField.setBounds(60, 15, 80, 20);
        aTextField.setFont(new Font("楷体", Font.BOLD, 20));
        aTextField.setBorder(BorderFactory.createLineBorder(Color.PINK, 2));

        bTextField = new JTextField("B4");
        bTextField.setBounds(260, 15, 80, 20);
        bTextField.setFont(new Font("楷体", Font.BOLD, 20));
        bTextField.setBorder(BorderFactory.createLineBorder(Color.PINK, 2));

        final JButton addJButton = new JButton();
        addJButton.setText("添加");
        addJButton.setBounds(20, 40, 80, 20);
        addJButton.setFocusPainted(false);
        addJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] rowValues = {aTextField.getText(),
                        bTextField.getText()};// 创建表格行数组
                tableModel.addRow(rowValues);// 向表格模型中添加一行
                int rowCount = table.getRowCount() + 1;
                aTextField.setText("A" + rowCount);
                bTextField.setText("B" + rowCount);
            }
        });

        final JButton upJButton = new JButton();
        upJButton.setText("修改");
        upJButton.setFocusPainted(false);
        upJButton.setBounds(150, 40, 80, 20);
        upJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();// 获得被选中行的索引
                if (selectedRow != -1) {// 判断是否存在被选中行
                    tableModel.setValueAt(aTextField.getText(),
                            selectedRow, 0);// 修改表格模型当中的指定值
                    tableModel.setValueAt(bTextField.getText(),
                            selectedRow, 1);// 修改表格模型当中的指定值
                }
            }
        });

        final JButton delJButton = new JButton();
        delJButton.setText("删除");
        delJButton.setBounds(300,40,80,20);
        delJButton.setFocusPainted(false);
        delJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();// 获得被选中行的索引
                if (selectedRow != -1)// 判断是否存在被选中行
                    // 从表格模型当中删除指定行
                    tableModel.removeRow(selectedRow);
            }
        });



        jPanel.add(jLabel);
        jPanel.add(jLabel_new);
        jPanel.add(addJButton);
        jPanel.add(upJButton);
        jPanel.add(delJButton);
        jPanel.add(aTextField);
        jPanel.add(bTextField);

        c.add(jScrollPane);
        c.add(jPanel);
        setVisible(true);

    }

    public static void main(String[] args) {
        new ExampleFrame_06();
    }
}
