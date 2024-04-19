import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class menu extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;

    menu() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon("file.jpg");
        saveIcon = new ImageIcon("save.jpg");
        exitIcon = new ImageIcon("exit.jpg");

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        fileMenu.setMnemonic(KeyEvent.VK_F);// Alt + f for file
        editMenu.setMnemonic(KeyEvent.VK_E);// Alt + e for edit
        helpMenu.setMnemonic(KeyEvent.VK_H);// Alt + h for help
        loadItem.setMnemonic(KeyEvent.VK_L);// L for load
        saveItem.setMnemonic(KeyEvent.VK_S);// S for save
        exitItem.setMnemonic(KeyEvent.VK_E);// E for exit

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("interesting");
        }
        if (e.getSource() == saveItem) {
            System.out.println("saving...");
        }
        if (e.getSource() == exitItem) {
            System.exit(0);
            ;
        }

    }

}
