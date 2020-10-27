package Day23;

import javax.swing.*;
import java.awt.*;
//
public class ExampleJFrame_001 extends JFrame {
    public ExampleJFrame_001() {
        super();
        setTitle("分割面板");
        setBounds(600, 200, 700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        final JSplitPane hSplitPane = new JSplitPane();//创建水平方向的面板
        hSplitPane.setDividerLocation(40);//左侧像素是40
        Container c = getContentPane();

        hSplitPane.setLeftComponent(new JLabel("    1"));//设置左标签

        final JSplitPane vSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);//创建垂直平方向的面板 setOrientation
        vSplitPane.setDividerLocation(30);//上方高度是30
        vSplitPane.setDividerSize(8);//分割条宽度
        vSplitPane.setOneTouchExpandable(true);//提供ui部件

        vSplitPane.setContinuousLayout(true);
        hSplitPane.setContinuousLayout(true);
        hSplitPane.setRightComponent(vSplitPane);
        vSplitPane.setLeftComponent(new JLabel("    2"));
        vSplitPane.setRightComponent(new JLabel("    3"));
        c.add(hSplitPane, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ExampleJFrame_001();
    }
}
