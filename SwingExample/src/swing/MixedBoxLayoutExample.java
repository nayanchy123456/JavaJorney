package swing;

import java.awt.Button;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.*;
import java.awt.*;

public class MixedBoxLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mixed BoxLayout Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create buttons
        Button northButton = new Button("North");
        Button southButton = new Button("South");
        Button eastButton = new Button("East");
        Button westButton = new Button("West");
        Button centerButton = new Button("Center");

        // Create main panel with BoxLayout (Y_AXIS)
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.X_AXIS));

        // Add buttons to the sub-panels
        frame.add(northButton);
        centerPanel.add(eastButton);
        frame.add(southButton);
        centerPanel.add(centerButton);
        centerPanel.add(westButton);

        // Add sub-panels to the main panel
        mainPanel.add(northButton);
        mainPanel.add(centerPanel);
        mainPanel.add(southButton);

        // Add the main panel to the frame
        frame.add(mainPanel);

        frame.setVisible(true);
    }

}