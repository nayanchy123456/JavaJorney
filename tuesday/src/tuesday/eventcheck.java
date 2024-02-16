package tuesday;

import javax.swing.JButton;
import javax.swing.JFrame;

public class eventcheck {

	
	public static void main(String[]args)
	{
		
		JFrame j = new JFrame("button");
		
		JButton b = new JButton("click here");
		b.setBounds(50,50,40,30);
		j.add(b);
		b.setSize(40,40);
		b.setVisible(true);
	}
	
}

