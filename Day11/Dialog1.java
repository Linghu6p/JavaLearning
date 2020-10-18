package Day11;

import javax.swing.*;
import java.awt.*;

public class Dialog1 extends JDialog {
    public Dialog1(Ui_Main ui) {
        super(ui, "注册", true);
        Container container = getContentPane();
        JLabel jl = new JLabel("AAAAA");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        setResizable(false);
        setBounds(600, 200, 700, 500);
    }
}
