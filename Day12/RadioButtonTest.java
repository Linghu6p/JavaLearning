package Day12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonTest extends JFrame {
    public RadioButtonTest(){
        setBounds(600,200,700,500);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        Container C = getContentPane();
        C.setLayout(null);
        JRadioButton jr1 = new JRadioButton("1");
        JRadioButton jr2 = new JRadioButton("2");
        JPanel jp = new JPanel(new FlowLayout());
        jp.add(jr1);
        jp.add(jr2);
        jr1.setSelected(true);//默认选中
        jp.setBounds(100,100,100,50);
        /*有按钮组后多个按钮只能选一个*/
        ButtonGroup group  = new ButtonGroup();
        group.add(jr1);
        group.add(jr2);

        JButton jb = new JButton("AAAA");
        jb.setBounds(100,150,100,50);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(jr1.getText()+" "+jr1.isSelected());
                System.out.println(jr2.getText()+" "+jr2.isSelected());
                group.clearSelection();//输出后清空选项
            }
        });
        C.add(jb);
        C.add(jp);

        setVisible(true);

    }
    public static void main(String[] args){
        new RadioButtonTest();
    }
}
