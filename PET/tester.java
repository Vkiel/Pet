import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class tester implements ActionListener {

    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JButton button = new JButton();

    tester() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 800);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}