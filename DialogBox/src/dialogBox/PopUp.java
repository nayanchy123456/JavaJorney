package dialogBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PopUp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Popup Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        // Create a label to display selected item
        JLabel label = new JLabel("Right-click to show popup menu");
        frame.add(label, BorderLayout.NORTH);
        
        // Create a popup menu
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem item1 = new JMenuItem("Item 1");
        JMenuItem item2 = new JMenuItem("Item 2");
        
        // Add action listeners to menu items
        item1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Item 1 is selected");
            }
        });
        
        item2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Item 2 is selected");
            }
        });
        
        // Add menu items to popup menu
        popupMenu.add(item1);
        popupMenu.add(item2);
        
        // Add a mouse listener to show popup menu on right-click
        frame.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                maybeShowPopup(e);
            }

            public void mouseReleased(MouseEvent e) {
                maybeShowPopup(e);
            }

            private void maybeShowPopup(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
        
        frame.setVisible(true);
    }
}
