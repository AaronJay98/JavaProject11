import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ButtonViewer
{
        private static final int FRAME_WIDTH = 200;
        private static final int FRAME_HEIGHT = 100;
        public static void main(String[] args)
        {
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        frame.add(button1);
        frame.add(button2);
        ActionListener listener1 = new ClickListener();
        ActionListener listener2 = new ClickListener();
        button1.addActionListener(listener1);
        button2.addActionListener(listener2);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        }
}
