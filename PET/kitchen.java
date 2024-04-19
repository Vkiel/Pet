import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class kitchen implements ActionListener {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JLabel imageLabel;
    JButton button = new JButton("try");
    JButton rightButton = new JButton();

    kitchen() {

        JPanel redpanel = new JPanel();
        redpanel.setBounds(25, 600, 150, 150);
        redpanel.setLayout(new BorderLayout());

        JPanel greenpanel = new JPanel();
        greenpanel.setBounds(1000, 600, 150, 150);
        greenpanel.setLayout(new BorderLayout());

        ImageIcon rightarrow = new ImageIcon("arrowtest.png");
        ImageIcon arrow = new ImageIcon("arrowtestleft.png");
        ImageIcon icon = new ImageIcon("kitchen.png");
        ImageIcon resizedIcon = resizeIcon(icon, 1200, 800);

        imageLabel = new JLabel(resizedIcon);
        imageLabel.setBounds(0, 0, 1200, 800);

        label.setText("hi");
        label.setBounds(0, 0, 100, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));
        label.setIcon(arrow);
        frame.add(imageLabel);
        button.setIcon(arrow);
        label.setIcon(rightarrow);
        rightButton.setIcon(rightarrow);

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 800);
        frame.setLayout(null);
        redpanel.add(button);
        frame.setVisible(true);
        greenpanel.add(rightButton);

        frame.add(redpanel);
        frame.getContentPane().add(redpanel);
        frame.add(greenpanel);
        frame.getContentPane().add(greenpanel);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                bathroom bath = new bathroom();

            }
        });
        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                start living = new start();

            }
        });

    }

    private ImageIcon resizeIcon(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
    }
}
