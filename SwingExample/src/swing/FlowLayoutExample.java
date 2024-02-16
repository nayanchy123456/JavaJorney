package swing;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExample {

		JFrame j;
	
		FlowLayoutExample()
		{
			JFrame j = new JFrame("FlowLayoutExample");
			j.setSize(400,400);
			j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			
			JButton b1 = new JButton("Button1");
			JButton b2 = new JButton("Button2");
			JButton b3 = new JButton("Button3");
			JButton b4 = new JButton("Button4");
			j.add(b1);
			j.add(b2);
			j.add(b3);
			j.add(b4);
			j.setLayout(new FlowLayout());
			j.setVisible(true);
			
		}
		
		
		
		public static void main(String[] args)
		{
			new FlowLayoutExample();
		}
}
