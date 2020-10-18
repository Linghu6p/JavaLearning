package Day11;

import javax.swing.*;
import java.awt.*;

// 自己绘制图标
public class DrawIcon implements Icon {
    private int height;
    private int width;

    public int getIconHeight() {
        return this.height;
    }

    public int getIconWidth() {
        return this.width;
    }

    public DrawIcon(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public void paintIcon(Component arg0, Graphics arg1, int x, int y) {
        arg1.fillOval(x, y, width, height);
    }
}
