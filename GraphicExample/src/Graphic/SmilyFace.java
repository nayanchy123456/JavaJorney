package Graphic;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class SmilyFace extends JPanel {
public void paint(Graphics g) 
	{
		g.setColor(Color.yellow);
		g.fillOval(90, 70, 80, 80); // face fill with yellow color
		g.setColor(Color.black);
		g.drawOval(90, 70, 80, 80); // face
		g.drawOval(110, 95, 5, 5); // eye
		g.drawOval(145, 95, 5, 5); // eye
		g.drawLine(130, 95, 130, 115); // nose
		g.drawArc(113, 115, 35, 20, 0, -180); // mouth
	}
		public static void main(String[] args) {
				JFrame frame = new JFrame();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setSize(200, 200);
					frame.setLocationRelativeTo(null);
					frame.getContentPane().add(new SmilyFace());
					frame.setVisible(true);
		}
	}