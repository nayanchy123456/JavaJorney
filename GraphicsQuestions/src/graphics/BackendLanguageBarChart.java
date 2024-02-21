	package graphics;
	
	import javax.swing.*;
	import java.awt.*;
	
	public class BackendLanguageBarChart extends JPanel {
	
	    private int[] data;
	
	    public BackendLanguageBarChart(int[] data) {
	        this.data = data;
	    }
	
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	
	        // Determine the maximum value in the data array
	        int maxValue = 0;
	        for (int i=1; i<data.length; i++)
	        {
	            if (data[i] > maxValue) {
	                maxValue = data[i];
	            }
	        }
	
	        int width = getWidth();
	        int height = getHeight();
	        int barWidth = width / data.length;
	
	        // Draw bars
	        for (int i = 0; i < data.length; i++) {
	            int barHeight = (int) ((double) data[i] / maxValue * (height ));
	            g.fillRect(i * barWidth + 10, height - barHeight , barWidth -20, barHeight);
	            g.setColor(Color.BLACK);
	            g.drawString(String.valueOf(data[i]), i * barWidth +20, height - barHeight);
//	            g.drawString("Java",10,20);
//	            g.drawString("PHP",210,20);
//	            g.drawString("Python",410,20);
//	            g.drawString("Go Lang",610,20);
	        }
	    }
	
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Backend Language Bar Chart");
	        int[] data = {20, 35, 30, 15}; // Java, PHP, Python, Go Lang
	        BackendLanguageBarChart chart = new BackendLanguageBarChart(data);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.add(chart);
	        frame.setSize(800, 400);
	        frame.setVisible(true);
	    }
	}
	
