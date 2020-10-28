package Day24;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class WindowFocusListener_Example extends JFrame {
    public WindowFocusListener_Example() {
        super();
        setBounds(600,200,700,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new MyWindowFocusListener());
        setVisible(true);
    }
    private class MyWindowFocusListener implements WindowFocusListener{

        @Override
        public void windowGainedFocus(WindowEvent e) {
            System.out.println("窗口获得焦点嗷");
        }

        @Override
        public void windowLostFocus(WindowEvent e) {
            System.out.println("窗口失去焦点辣");

        }
    }
    public static void main(String[] args) {
        new WindowFocusListener_Example();
    }
}
