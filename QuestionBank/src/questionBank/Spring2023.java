package questionBank;


import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Spring2023 extends JFrame {

    public Spring2023() {
        setSize(200, 175);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating  a panel with BoxLayout for the JFrame
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Create a panel for each button with FlowLayout
        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
        JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("long button 3");
        JButton b4 = new JButton("5");
        


        // adding buttons to respective panel
        panel1.add(b1);
        panel2.add(b2);
        panel3.add(b3);
        panel4.add(b4);

        // adding panel to the main panel
        mainPanel.add(panel1);
        mainPanel.add(panel2);
        mainPanel.add(panel3);
        mainPanel.add(panel4);
       
        // adding main panel to the JFrame
        add(mainPanel);

        setVisible(true);
        setLocationRelativeTo(null); 
    }
    public static void main(String[] args) {
        new Spring2023();
    }
}



