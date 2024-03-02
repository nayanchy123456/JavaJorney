package layout;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Spring2023_4a  extends JFrame{
	
	public Spring2023_4a()
	{
		JFrame j = new JFrame();
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(200,175);
		
		// setting buttons 
		JButton button1= new JButton("Button1");
		JButton button2= new JButton("Button2");
		JButton button3= new JButton("Button3");
		JButton longNamedButton4= new JButton("LongNamedButton4");
		JButton button5= new JButton("5");
		
//		creating main panel
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		panel4.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		panel5.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		
		panel1.add(button1);
		panel2.add(button2);
		panel3.add(button3);
		panel4.add(longNamedButton4);
		panel5.add(button5);
		
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		mainPanel.add(panel3);
		mainPanel.add(panel4);
		mainPanel.add(panel5);
		
		j.add(mainPanel);
		
		j.setVisible(true);
		
	}
	public static void main(String[] args)
	{
		 new Spring2023_4a();
	}
}
