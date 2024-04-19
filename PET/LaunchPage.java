import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton myButton = new JButton("Start");
    ImageIcon image = new ImageIcon();
    JLabel label = new JLabel();
    JLabel imageLabel;

    LaunchPage() {

        ImageIcon icon = new ImageIcon("starting page.png");
        ImageIcon resizedIcon = resizeIcon(icon, 420, 420);
        imageLabel = new JLabel(resizedIcon);
        imageLabel.setBounds(0, 0, 420, 420);
        frame.add(imageLabel);

        myButton.setBounds(100, 160, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.add(myButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);

        label.setIcon(image);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == myButton) {
            frame.dispose();
            start home = new start();
        }

    }

    private ImageIcon resizeIcon(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
    }

}
