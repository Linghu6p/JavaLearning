package Day23;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.net.URL;

public class ExampleFrame_03 extends JFrame {
    JDesktopPane desktopPane = null; //定义一个桌面面板
    InternalFrame pInFrame = null;// 定义一个人事管理内部窗体对象
    InternalFrame rInFrame = null;// 定义一个账套管理内部窗体对象
    InternalFrame tInFrame = null;// 定义一个待遇报表内部窗体对象
    public ExampleFrame_03() {
        super();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Container c = getContentPane();
        c.setLayout(null);

        desktopPane = new JDesktopPane();//为桌面面板创建对象
        desktopPane.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);//设置拖拽方式

        final JLabel backLabel = new JLabel();
        URL url = getClass().getResource("back.JPG");
        ImageIcon icon = new ImageIcon(url);
        backLabel.setIcon(icon);
        backLabel.setBounds(0,0,icon.getIconWidth(),icon.getIconWidth());


        setBounds(600,200,icon.getIconWidth(),icon.getIconHeight()+72);
        desktopPane.setBounds(0,35,icon.getIconWidth(),icon.getIconHeight());
        desktopPane.add(backLabel,new Integer(Integer.MIN_VALUE));//永远将图片至于最底层

        final JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanel.setBounds(0,0,icon.getIconWidth(),35);
        jPanel.setBackground(Color.white);
        jPanel.setLayout(null);

        final JButton personnelButton = new JButton();
        personnelButton.setText("人事管理");
        personnelButton.addActionListener(new BAListener(pInFrame, "人事管理"));
        personnelButton.setBounds(10,10,90,20);

        final JButton reckoningButton = new JButton();
        reckoningButton.setText("账套管理");
        reckoningButton.addActionListener(new BAListener(rInFrame, "账套管理"));
        reckoningButton.setBounds(120,10,90,20);


        final JButton treatmentButton = new JButton();
        treatmentButton.setText("待遇报表");
        treatmentButton.addActionListener(new BAListener(tInFrame, "待遇报表"));
        treatmentButton.setBounds(230,10,90,20);


        jPanel.add(personnelButton);
        jPanel.add(reckoningButton);
        jPanel.add(treatmentButton);


        c.add(jPanel);
        c.add(desktopPane);

        setVisible(true);
    }
    public static void main(String[] args) {
        new ExampleFrame_03();
    }
    private class BAListener implements ActionListener {
        InternalFrame inFrame;
        String title;
        public BAListener(InternalFrame inFrame, String title) {
            this.inFrame = inFrame;
            this.title = title;
        }
        public void actionPerformed(ActionEvent e) {
            if (inFrame == null || inFrame.isClosed()) {
                // 获得桌面面板中的所有内部窗体
                JInternalFrame[] allFrames = desktopPane.getAllFrames();
                // 获得桌面面板中拥有内部窗体的数量
                int titleBarHight = 30 * allFrames.length;
                int x = 10 + titleBarHight, y = x;// 设置窗体的显示位置
                int width = 540, height = 334;// 设置窗体的大小
                inFrame = new InternalFrame(title);// 创建指定标题的内部窗体
                // 设置窗体的显示位置及大小
                inFrame.setBounds(x, y, width, height);
                inFrame.setVisible(true);// 设置窗体可见
                desktopPane.add(inFrame);// 将窗体添加到桌面面板中
            }
            try {
                inFrame.setSelected(true);// 选中窗体
            } catch (PropertyVetoException propertyVetoE) {
                propertyVetoE.printStackTrace();
            }
        }
    }
    private class InternalFrame extends JInternalFrame {

        public InternalFrame(String title) {
            super();
            setTitle(title);// 设置内部窗体的标题
            setResizable(true);// 设置允许自由调整大小
            setClosable(true);// 设置提供关闭按钮
            setIconifiable(true);// 设置提供图标化按钮
            setMaximizable(true);// 设置提供最大化按钮
            // 获得图片的路径
            URL resource = this.getClass().getResource("in_frame.png");
            ImageIcon icon = new ImageIcon(resource); // 创建图片对象
            setFrameIcon(icon); // 设置窗体图标
        }
    }
}
