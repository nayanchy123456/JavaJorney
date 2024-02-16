package questionBank;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spring2023_3b extends JFrame {
	
	 public Spring2023_3b()
	 {
		 JFrame jframe = new JFrame("textfield checker");
		 jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 jframe.setSize(300,400);
		 
		
		 
		// setting layout to the frame
		 jframe.setLayout(null);
		 
		 // creating a textFields
		 JTextField t1 = new JTextField(50);
		 t1.setBounds(100,10,100,30);
		 JTextField t2 = new JTextField( 50);
		 t2.setBounds(100,50,100,30);
	
		 // creating button
		 JButton b = new JButton("click me");
		 b.setBounds(100,100,100,30);
		 
		 //adding textFields and button in frame
		 jframe.add(t1);
		 jframe.add(t2);
		 jframe.add(b);
		 
		
		 
		 // adding actionListner in the button
		 
		 b.addActionListener(new ActionListener()
				 {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						String content1 = t1.getText();
						String content2 = t2.getText();
						if(content1.equals(content2))
						{
						    jframe.getContentPane().setBackground(Color.GREEN);
						}
						else
						{
						    jframe.getContentPane().setBackground(Color.RED);
						}
						
					}
						
			 
				 });
				
		 jframe.setVisible(true);
	 }
	 
	 public static void main(String[] args)
	 {
		 new  Spring2023_3b();
	 }
	
}
