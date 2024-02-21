package graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Spring2023_4b extends JPanel {
    public void paint(Graphics g) {
        super.paint(g);

        int squareX=150;
        int squareY=100;
        int SquareSize =100;
        
        // draw square
        g.fillRect(squareX, squareY, SquareSize, SquareSize);
        setForeground(Color.red);
        
        // draw circle
        g.setColor(Color.green);
       g.fillOval(175, 130, 50, 50);
       
       // writting font
       String text = "all the best";
       g.setColor(Color.BLACK);
       Font font = new Font("Arial", Font.BOLD, 14);
       g.setFont(font);
       g.drawString(text,160,125);
        

 
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Square with Circle and Text");
        Spring2023_4b panel = new Spring2023_4b();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
