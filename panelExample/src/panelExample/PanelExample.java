package panelExample;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelExample {

	public PanelExample()
	{
		 JFrame f = new JFrame("frame");
		 JPanel p = new JPanel();
		 
		 
	
		 p.setBounds(300,300,200,2000);
		 p.setBackground(Color.yellow);
		 
		 f.add(p);
		 f.setSize(400,400);
		 f.setLayout(null);
		 f.setVisible(true);
	}
	
	public static void main(String[]args)
	{
		new PanelExample();
	}
	
}
