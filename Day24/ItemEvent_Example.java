package Day24;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEvent_Example extends JFrame {
    public ItemEvent_Example() {
        super();
        setBounds(600,200,700,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Container c= getContentPane();

        JComboBox<String> jComboBox = new JComboBox<>();//下拉框
        for (int i = 1; i < 6; i++) {// 通过循环添加选项
            jComboBox.addItem("选项" + i);
        }
        jComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int stateChange = e.getStateChange();// 获得事件类型
                String item = e.getItem().toString();// 获得触发此次事件的选项
                if (stateChange == ItemEvent.SELECTED) {// 查看是否由选中选项触发
                    System.out.println("此次事件由      选中  选项“" + item + "”触发！");
                    // 查看是否由取消选中选项触发
                } else if (stateChange == ItemEvent.DESELECTED) {
                    System.out.println("此次事件由  取消选中  选项“" + item + "”触发！");
                } else {// 由其他原因触发
                    System.out.println("此次事件由其他原因触发！");
                }
            }
        });
        c.setLayout(null);
        jComboBox.setBounds(100,100,100,50);
        c.add(jComboBox);

        setVisible(true);
    }
    public static void main(String[] args){
        new ItemEvent_Example();
    }
}
