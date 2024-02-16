package Graphic;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class DrawingExample extends JFrame {

    public DrawingExample() {
        setTitle("Drawing Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(new DrawingPanel());
    }

    class DrawingPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g;

            // Draw square in red
            g2d.setColor(Color.RED);
            g2d.fillRect(50, 50, 200, 200);

            // Draw circle in green
            g2d.setColor(Color.GREEN);
            Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 100, 100);
            g2d.fill(circle);

            // Write a string above the circle
            g2d.setColor(Color.BLACK);
            g2d.drawString("All the best", 85, 90);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DrawingExample example = new DrawingExample();
            example.setVisible(true);
        });
    }
}
