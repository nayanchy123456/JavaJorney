package graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

// total number of students and male and female bar chart
public class Question4 extends JPanel {
	private int data[];
	 public Question4(int data[])
	 {
		 this.data = data;
	 }
	 
	 public void paint(Graphics g)
	 {
		 super.paint(g);
		 
		
		 int maxValue =0;
		 for(int i=1; i<data.length; i++ )
		 {
			 if(data[i] > maxValue)
			 {
				 maxValue = data[i];
			 }
		 }
		 int height = getHeight();
		 int width = getWidth();
		 int barWidth = width / data.length;
		 
		 /// draw bar
		 
		 for(int i=0; i<data.length; i++)
		 {
			 int barHeight = (int ) ((double) data[i] /maxValue * (height));
			g.fillRect(i*barWidth +10, height-barHeight, barWidth-20, barHeight);
			g.setColor(Color.black);
		 }
		 
	 }
	public static void main(String[] args)
	{
		int data [] = {45,25,20}; // totalStudent,male,female
		JFrame j = new JFrame("bar chart");
		Question4 q4 = new Question4(data);
		j.add(q4);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(800,400);
		j.setVisible(true);
	}
}
