package Day25;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

public class DrawFrame extends JFrame {
    public DrawFrame(){
        super();
        setBounds(600,200,300,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        add(new CanvasPanel());
        setVisible(true);
    }
    public static void main(String [] args) {
        new DrawFrame();
    }
    class CanvasPanel extends JPanel{
        public void paint(Graphics graphics) {
            super.paint(graphics);
            Graphics2D graphics2D = (Graphics2D) graphics;
            Shape[] shapes = new Shape[4]; //图形数组
            shapes[0] = new Ellipse2D.Double(5,5,100,100);//创建圆形对象
            shapes[1] = new Rectangle2D.Double(110,5,100,100);//创建矩形
            shapes[2] = new Rectangle2D.Double(15,15,80,80);
            shapes[3] = new RoundRectangle2D.Double(120,15,80,120,0,0);
            for(Shape shape :shapes) {
                Rectangle2D bounds = shape.getBounds();//获取图形边界 并换成框框 大概这么个意思 就是把不规则得东西放框里面，做游戏就要用
                if (bounds.getWidth()==80)
                    graphics2D.fill(shape);
                else
                    graphics2D.draw(shape);
            }
            
        }
    }
}
