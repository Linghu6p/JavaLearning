package Day24;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowStateListener;
// 状态变化监听

public class WindowStateListener_Example extends JFrame {
    public WindowStateListener_Example() {
        super();
        setBounds(600, 200, 700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addWindowStateListener(new MyWindowStateListener());

        setVisible(true);
    }

    public static void main(String[] args) {
        new WindowStateListener_Example();
    }

    private class MyWindowStateListener implements WindowStateListener {

        @Override
        public void windowStateChanged(WindowEvent e) {
            int oldState = e.getOldState();
            int newState = e.getNewState();
            String from = "";
            String to = "";
            switch (oldState) {
                case Frame.NORMAL:
                    from = "正常";
                    break;
                case Frame.MAXIMIZED_BOTH:
                    from = "最大化";
                    break;
                default:
                    from = "最小化";
                    /*
                case Frame.ICONIFIED://最小化
                    from ="最小化";
                    break;
                     */
            }
            switch (newState) {// 判断窗台现在的状态
                case Frame.NORMAL:// 窗体处于正常化
                    to = "正常化";
                    break;
                case Frame.MAXIMIZED_BOTH:// 窗体处于最大化
                    to = "最大化";
                    break;
                default:// 窗体处于最小化
                    to = "最小化";
            }
            System.out.println(from + "---->" + to);
        }
    }
}
