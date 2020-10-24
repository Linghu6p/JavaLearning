package Day21;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.util.Vector;

public class ExampleFrame_03 extends JFrame {
    public ExampleFrame_03() {
        super();
        setTitle("定义表格");
        setBounds(600, 200, 700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        final JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setBounds(50, 10, 500, 300);
        jScrollPane.setBorder(BorderFactory.createLineBorder(Color.white));

        String[] columnNames = {"A", "B", "C", "D", "E", "F", "G"};

        Vector<String> columnNameV = new Vector<>();
        for (int i = 0; i < columnNames.length; ++i) {
            columnNameV.add(columnNames[i]);
        }
        Vector<Vector<String>> tableValueV = new Vector<>();
        for (int rows = 1; rows < 21; rows++) {
            Vector<String> rowV = new Vector<>();
            for (int count = 0;count<columnNames.length;count++)
            {
                rowV.add(columnNames[count]+rows+"");
            }
            tableValueV.add(rowV);
        }

        JTable table = new MyTable(tableValueV,columnNameV);
        //table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);//关闭表格列的自动调整功能
        //table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//一次只能选择一行
        table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);//任意
        table.setSelectionBackground(Color.yellow);//被选择的时候是黄色
        table.setSelectionForeground(Color.RED);//被选中的前景 即顶上那一栏是红色
        //table.setBounds(10,10,300,200);
        jScrollPane.setViewportView(table);
        Container c = getContentPane();
        c.setLayout(null);
        c.add(jScrollPane);


        setVisible(true);
    }

    public static void main(String[] args) {
        new ExampleFrame_03();
    }

    private class MyTable extends JTable {
        public MyTable(Vector<Vector<String>> rowData,Vector<String> columnNames){
            super(rowData,columnNames);
        }
        @Override
        public JTableHeader getTableHeader() {
            JTableHeader tableHeader = super.getTableHeader();
            tableHeader.setReorderingAllowed(false);//设置表格的列不能重排
            DefaultTableCellRenderer hr = (DefaultTableCellRenderer) tableHeader.getDefaultRenderer();//设置居中显示
            hr.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            return tableHeader;
        }

        @Override
        // 设置单元格内容居中显示
        public TableCellRenderer getDefaultRenderer(Class<?> columnClass) {
            DefaultTableCellRenderer cr = (DefaultTableCellRenderer) super.getDefaultRenderer(columnClass);
            cr.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            return cr;
        }

        @Override
        //设置不可编辑
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    }
}

