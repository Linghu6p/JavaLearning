package Day21;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.util.Vector;

public class ExampleFrame_02 extends JFrame {
    public ExampleFrame_02() {
        super();
        setTitle("不可滚动的表格");
        setBounds(600,200,700,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Vector<String> columnNameV = new Vector<>();
        columnNameV.add("Name");
        columnNameV.add("Number");
        Vector<Vector<String>> tableValueV = new Vector<>();
        for(var i =0;i<6;++i) {
            Vector<String> rowV= new Vector<>();
            rowV.add("王文尧"+i+"号");
            rowV.add("傻逼"+i+"号");
            tableValueV.add(rowV);
        }
        JTable jTable = new JTable(tableValueV,columnNameV);
        JTableHeader jTableHeader = jTable.getTableHeader();

        Container c = getContentPane();
        c.setLayout(null);


        jTableHeader.setBounds(5,5,150,20);
        jTable.setBounds(5,25,150,100);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        jPanel.add(jTableHeader);
        jPanel.add(jTable);

        jPanel.setBounds(200,100,160,150);
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        c.add(jPanel);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ExampleFrame_02();
    }
}
