package graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fall2014_4b  extends JPanel{
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		// drawing ellipse
		 	g.setColor(Color.green);
	       g.fillOval(100, 130, 250, 100);
	       
	       // writting font inside the ellipse
	     
	       String text = "Pokhara University";
	       Font font = new Font("serif",Font.BOLD,20);
	       g.setFont(font);
	       g.setColor(Color.black);
	       g.drawString(text,140,175);
	       
	       
	}

	  public static void main(String[] args) {
	        JFrame frame = new JFrame("Square with Circle and Text");
	        Fall2014_4b panel = new Fall2014_4b();
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(panel);
	        frame.setSize(400, 400);
	        frame.setVisible(true);
	    }
}
