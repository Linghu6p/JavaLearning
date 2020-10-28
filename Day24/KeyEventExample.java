package Day24;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventExample extends JFrame {
    public KeyEventExample() {
        super();
        setBounds(600, 200, 700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);


        Container c = getContentPane();
        c.setLayout(null);


        final JLabel jLabel = new JLabel();
        jLabel.setText("备注：");
        jLabel.setBounds(0, 200, 50, 40);
        //jLabel.setBorder(BorderFactory.createLineBorder(Color.PINK,3));

        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setBounds(100, 50, 500, 309);

        JTextArea jTextArea = new JTextArea();
        jTextArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {//响应击键
                System.out.println("You entered key is: " + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                String keyText = KeyEvent.getKeyText(e.getKeyCode());//必写 获取描述keyCode的标签
                if (e.isActionKey()) {
                    System.out.println("按下动作键：" + keyText);
                } else {
                    System.out.println("按下非动作键:");
                    int keyCode = e.getKeyCode();
                    switch (keyCode) {
                        case KeyEvent.VK_CONTROL:
                            System.out.println(",Ctrl 被按了呢！");
                            break;
                        case KeyEvent.VK_ALT:
                            System.out.println(",Alt 被按了呢！");
                        case KeyEvent.VK_SHIFT:
                            System.out.println(",Shift 被按了呢！");
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {//响应释放按键

                System.out.println("释放的是："+KeyEvent.getKeyText(e.getKeyCode()));
            }
        });

        c.add(jLabel);
        c.add(jScrollPane);
        jTextArea.setLineWrap(true);
        jScrollPane.setViewportView(jTextArea);


        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyEventExample();
    }


}
