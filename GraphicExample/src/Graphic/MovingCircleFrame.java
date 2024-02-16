package Graphic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovingCircleFrame extends JFrame {
    private int circleX = 200;
    private int circleY = 200;

    public MovingCircleFrame() {
        setTitle("Moving Circle Frame");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton leftButton = new JButton("Left");
        JButton rightButton = new JButton("Right");
        JButton topButton = new JButton("Top");
        JButton bottomButton = new JButton("Bottom");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(leftButton);
        buttonPanel.add(rightButton);
        buttonPanel.add(topButton);
        buttonPanel.add(bottomButton);

        add(buttonPanel, BorderLayout.SOUTH);

        MovingCirclePanel circlePanel = new MovingCirclePanel();
        add(circlePanel, BorderLayout.CENTER);

        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                circleX -= 10;
                circlePanel.repaint();
            }
        });

        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                circleX += 10;
                circlePanel.repaint();
            }
        });

        topButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                circleY -= 10;
                circlePanel.repaint();
            }
        });

        bottomButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                circleY += 10;
                circlePanel.repaint();
            }
        });
    }

    class MovingCirclePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.fillOval(circleX, circleY, 50, 50);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MovingCircleFrame frame = new MovingCircleFrame();
            frame.setVisible(true);
        });
    }
}
