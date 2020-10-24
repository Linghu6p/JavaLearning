package Day21;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.Vector;

public class MFixedColumnTable extends JPanel {
    private Vector<String> columnNameV;
    private Vector<Vector<Object>> tableValueV;
    private int fixedColumn = 1;//表示永远可见的1 列

    private JTable fixedColumnTable;// 固定列表格对象
    private FixedColumn fixedColumnTableModel;// 固定列表格模型对象
    private JTable floatingColumnTable;// 移动列表格对象
    // 移动列表格模型对象
    private FloatingColumn floatingColumnTableModel;


    public MFixedColumnTable(Vector<String> columnNameV, Vector<Vector<Object>> tableValueV, int fixedColumn) {

        super();
        setLayout(new BorderLayout());
        this.columnNameV = columnNameV;
        this.tableValueV = tableValueV;
        this.fixedColumn = fixedColumn;

        // 创建固定列表格模型对象
        fixedColumnTableModel = new FixedColumn();
        fixedColumnTable = new JTable(fixedColumnTableModel);
        // 获得选择模型对象
        ListSelectionModel fixed = fixedColumnTable.getSelectionModel();
        // 选择模式为单选
        fixed.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // 添加行被选中的事件监听器
        fixed.addListSelectionListener(new MListSelectionListener(true));


        // 创建可移动列表格模型对象
        floatingColumnTableModel = new FloatingColumn();
        floatingColumnTable = new JTable(floatingColumnTableModel);
        floatingColumnTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        ListSelectionModel floating = floatingColumnTable.getSelectionModel();
        floating.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // 添加行被选中的事件监听器
        MListSelectionListener listener = new MListSelectionListener(false);
        floating.addListSelectionListener(listener);


        JScrollPane scrollPane = new JScrollPane();
        // 将固定列表格头放到滚动面版的左上方
        scrollPane.setCorner(JScrollPane.UPPER_LEFT_CORNER,
                fixedColumnTable.getTableHeader());
        // 创建一个用来显示基础信息的视口对象
        JViewport viewport = new JViewport();
        viewport.setView(fixedColumnTable);// 将固定列表格添加到视口中
        // 设置视口的首选大小为固定列表格的首选大小
        viewport.setPreferredSize(fixedColumnTable.getPreferredSize());
        // 将视口添加到滚动面版的标题视口中
        scrollPane.setRowHeaderView(viewport);
        // 将可移动表格添加到默认视口
        scrollPane.setViewportView(floatingColumnTable);
        add(scrollPane, BorderLayout.CENTER);

    }




    private class MListSelectionListener implements ListSelectionListener {
        boolean isFixedColumnTable = true; // 默认由选中固定列表格中的行触发

        public MListSelectionListener(boolean isFixedColumnTable) {
            this.isFixedColumnTable = isFixedColumnTable;
        }



        // 监听选中列表
        public void valueChanged(ListSelectionEvent e) {
            if (isFixedColumnTable) { // 由选中固定列表格中的行触发
                // 获得固定列表格中的选中行
                int row = fixedColumnTable.getSelectedRow();
                // 同时选中右侧可移动列表格中的相应行
                floatingColumnTable.setRowSelectionInterval(row,row);
            } else { // 由选中可移动列表格中的行触发
                // 获得可移动列表格中的选中行
                int row = floatingColumnTable.getSelectedRow();
                // 同时选中左侧固定列表格中的相应行
                fixedColumnTable.setRowSelectionInterval(row, row);
            }
        }
    }

    //可移动
    private class FloatingColumn extends AbstractTableModel{

        @Override
        public int getRowCount() {
            return tableValueV.size();
        }

        @Override
        public int getColumnCount() {
            return columnNameV.size()-fixedColumn;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return tableValueV.get(rowIndex).get(columnIndex+fixedColumn);
        }

        @Override
        public String getColumnName(int column) {
            return columnNameV.get(column+fixedColumn);
        }
    }


    //左侧固定类
    private class FixedColumn extends AbstractTableModel {

        @Override
        public int getRowCount() {
            return tableValueV.size();
        }

        @Override
        public int getColumnCount() {//返回指定列的数量
            return fixedColumn;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return tableValueV.get(rowIndex).get(columnIndex);
        }

        @Override
        public String getColumnName(int column) {//返回指定列的名称
            return columnNameV.get(column);
        }
    }
}
