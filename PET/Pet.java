import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Pet extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    Pet() {

        ImageIcon icon = new ImageIcon("cat.jpg");

        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(120, 250, 250, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(120, 100, 250, 100);
        button.addActionListener(this);
        button.setText("Play");
        button.setFocusable(false);
        button.setHorizontalAlignment(JButton.CENTER);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setForeground(Color.black);
        button.setBackground(Color.cyan);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            label.setVisible(true);
            // button.setEnabled(false);//

        }
    }

}
