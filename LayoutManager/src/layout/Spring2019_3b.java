package layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Spring2019_3b extends JFrame {
	public Spring2019_3b()
	{
		JFrame frame = new JFrame();
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// creating buttons
		JButton northButton = new JButton("NORTH");
		JButton southButton = new JButton("SOUTH");
		JButton eastButton = new JButton("EAST");
		JButton westButton = new JButton("WEST");
		JButton centerButton = new JButton("CENTER");
		
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new BoxLayout(northPanel,BoxLayout.Y_AXIS));
		northPanel.add(northButton, BorderLayout.NORTH);
		
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new BoxLayout(southPanel,BoxLayout.Y_AXIS));
		southPanel.add(southButton,BorderLayout.SOUTH);
		
		frame.add(northPanel);
		frame.add(southPanel);
		
		frame.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args)
	{
		new Spring2019_3b();
	}
}
