package Day11;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MyImageIcon extends JFrame {
    public MyImageIcon() {
        Container container = getContentPane();
        JLabel jl = new JLabel("AAAAAAAAA");
        URL url = MyImageIcon.class.getResource("客户端.png");
        Icon icon = new ImageIcon(url);
        jl.setIcon(icon);
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        jl.setOpaque(true);
        container.add(jl);
        setSize(1980, 1080);
        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new MyImageIcon();
    }
}
