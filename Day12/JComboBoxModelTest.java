package Day12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.AbstractList;

public class JComboBoxModelTest extends JFrame {
    JComboBox<String> jc = new JComboBox<>();
    JLabel jl = new JLabel("选择:");

    public JComboBoxModelTest() {
        setBounds(600, 200, 700, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jl.setBounds(260,100,80,20);
        Container c =  getContentPane();
        c.setLayout(null);

        JComboBox<String> comboBox = new JComboBox<>();
        String items[] = {"学生", "老师"};
        // JComboBox<String> comboBox = new JComboBox<>(items); 数组形式添加
        //comboBox.addItem("家属"); 直接添加
        ComboBoxModel cm = new DefaultComboBoxModel<>(items);//创建下拉列表模型 接口后面是实现类
        comboBox.setModel(cm);//Model添加

        JButton jb = new JButton("打印");

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = comboBox.getSelectedIndex();//获取选中的索引
                Object data = comboBox.getSelectedItem();//获取选中的值
                System.out.println(data+" "+n);
            }
        });

        c.add(comboBox);
        c.add(jb);
        c.add(jl);
        comboBox.setBounds(300, 100, 80, 20);
        jb.setBounds(400,100,60,20);

        setVisible(true);
    }
    public static void main(String[] args){
        new JComboBoxModelTest();
    }


}