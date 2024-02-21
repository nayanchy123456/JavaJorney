package graphics;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

// total number of students and male and female bar chart
public class Question4 extends JPanel {
	int data[];
	 public Question4(int data[])
	 {
		 this.data = data;
	 }
	 
	 public void paint(Graphics g)
	 {
		 super.paint(g);
		 
		 int height = getHeight();
		 int width = getWidth();
		 int barWidth = width / data.length;
		 
		 int maxValue =0;
		 for(int i=1; i<data.length; i++ )
		 {
			 if(data[i] > maxValue)
			 {
				 maxValue = data[i];
			 }
		 }
		 /// draw bar
		 
		 for(int i=0; i<data.legh)
		 
	 }
	public static void main(String[] args)
	{
		int data [] = {45,25,20};
		JFrame j = new JFrame("bar chart");
		Question4 q4 = new Question4(data);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setLayout(null);
		j.setSize(800,400);
		j.setVisible(true);
	}
}
