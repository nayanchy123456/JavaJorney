package layout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;

public class GridBagLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating a panel with GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());

        // Adding buttons to the panel using GridBagConstraints
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(new JButton("Button 1"), constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(new JButton("Button 2"), constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(new JButton("Button 3"), constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(new JButton("Button 4"), constraints);

        // Adding the panel to the frame
        frame.getContentPane().add(panel);

//        frame.pack();
        frame.setVisible(true);
    }
}
