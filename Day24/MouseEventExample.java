package Day24;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventExample extends JFrame {
    private JTextField jTextField = new JTextField();

    public MouseEventExample() {
        super();
        setBounds(600, 200, 700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        final JLabel label = new JLabel();
        label.setText("鼠标事件");
        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = e.getButton();//判断是哪个键
                if (i == MouseEvent.BUTTON1)
                    jTextField.setText("左键被点击了");
                if (i == MouseEvent.BUTTON2)
                    jTextField.setText("滑鼠被点击了");
                if (i == MouseEvent.BUTTON3)
                    jTextField.setText("右键被点击了");

            }

            @Override
            public void mousePressed(MouseEvent e) {//被按下时触发 并非单击
                int i = e.getButton();//判断是哪个键
                if (i == MouseEvent.BUTTON1)
                    System.out.println("左键被按了");
                if (i == MouseEvent.BUTTON2)
                    System.out.println("滑鼠被按了");
                if (i == MouseEvent.BUTTON3)
                    System.out.println("右键被按了");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                int i = e.getButton();//判断是哪个键
                if (i == MouseEvent.BUTTON1)
                    jTextField.setText("左键被释放了");
                if (i == MouseEvent.BUTTON2)
                    jTextField.setText("滑鼠被释放了");
                if (i == MouseEvent.BUTTON3)
                    jTextField.setText("右键被释放了");
            }

            @Override
            public void mouseEntered(MouseEvent e) {//光标移入组键 代表光标对着组键的意思.
                label.setToolTipText("您正在看标签哦！");

            }

            @Override
            public void mouseExited(MouseEvent e) {
                jTextField.setText("光标离开了");
            }
        });
        Container c = getContentPane();
        c.setLayout(null);
        jTextField.setBounds(200, 100, 100, 40);
        label.setBounds(100, 100, 100, 40);
        c.add(jTextField);
        c.add(label);

        setVisible(true);
    }


    public static void main(String[] args) {
        new MouseEventExample();
    }
}
