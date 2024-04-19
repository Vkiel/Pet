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

public class gaming implements ActionListener {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JLabel imageLabel;
    JButton button = new JButton("try");
    JButton leftButton = new JButton("hi");
    JButton gameButton = new JButton("test");

    gaming() {

        JPanel redpanel = new JPanel();
        redpanel.setBounds(1000, 600, 150, 150);
        redpanel.setLayout(new BorderLayout());

        JPanel greenpanel = new JPanel();
        greenpanel.setBounds(25, 600, 150, 150);
        greenpanel.setLayout(new BorderLayout());

        JPanel bluepanel = new JPanel();
        bluepanel.setBounds(0, 0, 150, 150);
        bluepanel.setLayout(new BorderLayout());

        ImageIcon arrow = new ImageIcon("arrowtest.png");
        ImageIcon icon = new ImageIcon("gaming.png");
        ImageIcon arrowLeft = new ImageIcon("arrowtestleft.png");
        ImageIcon resizedIcon = resizeIcon(icon, 1200, 800);
        ImageIcon screen = new ImageIcon("gameover.png");

        imageLabel = new JLabel(resizedIcon);
        imageLabel.setBounds(0, 0, 1200, 800);

        label.setText("hi");
        label.setBounds(0, 0, 100, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));
        label.setIcon(arrow);
        frame.add(imageLabel);
        button.setIcon(arrow);
        label.setIcon(arrowLeft);
        leftButton.setIcon(arrowLeft);
        label.setIcon(screen);
        button.setIcon(screen);

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 800);
        frame.setLayout(null);
        redpanel.add(button);
        frame.setVisible(true);
        greenpanel.add(leftButton);
        bluepanel.add(gameButton);

        frame.add(redpanel);
        frame.getContentPane().add(redpanel);
        frame.add(greenpanel);
        frame.getContentPane().add(greenpanel);
        frame.add(bluepanel);
        frame.getContentPane().add(bluepanel);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                bedroom bed = new bedroom();

            }
        });
        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                start living = new start();

            }
        });
        gameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                tester test = new tester();

            }
        });

    }

    private ImageIcon resizeIcon(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
    }
}
