package swing;

import java.awt.*;
import javax.swing.*;
public class AllLayoutsExample extends JFrame 
{
   JPanel flowLayoutPanel1, flowLayoutPanel2, gridLayoutPanel1, gridLayoutPanel2, gridLayoutPanel3;
   
   JButton one, two, three, four, five, six;
   
   JLabel bottom, lbl1, lbl2, lbl3;
   
   public AllLayoutsExample() 
   {
	   
      setTitle("LayoutManager Test");
      setLayout(new BorderLayout()); // Set BorderLayout for JFrame
      
      flowLayoutPanel1 = new JPanel();
      one = new JButton("One");
      two = new JButton("Two");
      three = new JButton("Three");
      
      flowLayoutPanel1.setLayout(new FlowLayout(FlowLayout.CENTER)); // Set FlowLayout Manager
      //setting button to panel
      flowLayoutPanel1.add(one);
      flowLayoutPanel1.add(two);
      flowLayoutPanel1.add(three);
      
      // creating panel2 
      flowLayoutPanel2 = new JPanel();
      bottom = new JLabel("This is South");
      flowLayoutPanel2.setLayout (new FlowLayout(FlowLayout.CENTER)); // Set FlowLayout Manager
      flowLayoutPanel2.add(bottom);
      
      gridLayoutPanel1 = new JPanel();
      gridLayoutPanel2 = new JPanel();
      gridLayoutPanel3 = new JPanel();
      lbl1 = new JLabel("One");
      lbl2 = new JLabel("Two");
      lbl3 = new JLabel("Three");
      four = new JButton("Four");
      five = new JButton("Five");
      six = new JButton("Six");
      
      gridLayoutPanel2.setLayout(new GridLayout(1, 3, 5, 5)); // Set GridLayout Manager
      gridLayoutPanel2.add(lbl1);
      gridLayoutPanel2.add(lbl2);
      gridLayoutPanel2.add(lbl3);
      
      gridLayoutPanel3.setLayout(new GridLayout(3, 1, 5, 5)); // Set GridLayout Manager
      gridLayoutPanel3.add(four);
      gridLayoutPanel3.add(five);
      gridLayoutPanel3.add(six);
      
      gridLayoutPanel1.setLayout(new GridLayout(2, 1)); // Set GridLayout Manager
      gridLayoutPanel1.add(gridLayoutPanel2);
      gridLayoutPanel1.add(gridLayoutPanel3);
      
      add(flowLayoutPanel1, BorderLayout.NORTH);
      add(flowLayoutPanel2, BorderLayout.SOUTH);
      add(gridLayoutPanel1, BorderLayout.CENTER);
      setSize(400, 325);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//      setLocationRelativeTo(null);
      setVisible(true);
   }
   public static void main(String args[]) {
      new AllLayoutsExample();
   }
}