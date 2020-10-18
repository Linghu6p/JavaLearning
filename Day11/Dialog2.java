package Day11;

import javax.swing.*;
import java.awt.*;

public class Dialog2 extends JDialog {
    public Dialog2(Ui_Main ui) {
        super(ui, "登录", true);
        Container container = getContentPane();
        JLabel jL = new JLabel("BBBB");
        container.add(jL);
        setResizable(false);
        jL.setHorizontalAlignment(SwingConstants.CENTER);
        setSize(700, 500);
        setBounds(600, 200, 700, 500);
        //setBounds(0,0,700,500);
    }
}
