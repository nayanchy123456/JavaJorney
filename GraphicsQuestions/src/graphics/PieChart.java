package graphics;

import javax.swing.*;
import java.awt.*;

public class PieChart extends JPanel {

    private int[] data;
    private String[] labels;
    private Color[] colors;

    public PieChart(int[] data, String[] labels, Color[] colors) {
        this.data = data;
        this.labels = labels;
        this.colors = colors;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (data == null || data.length == 0) {
            return;
        }

        int total = 0;
        for (int i=0;i<data.length; i++) {
            total += data[i];
        }

        int diameter = Math.min(getWidth(), getHeight()) - 20;
        int x = (getWidth() - diameter) / 2;
        int y = (getHeight() - diameter) / 2;

        int startAngle = 0;
        for (int i = 0; i < data.length; i++) {
            int arcAngle = (int) Math.round((double) data[i] / total * 360);
            g.setColor(colors[i]);
            g.fillArc(x, y, diameter, diameter, startAngle, arcAngle);
            startAngle += arcAngle;
        }

        // Draw legend
        int legendX = x + diameter + 20;
        int legendY = y;
        for (int i = 0; i < labels.length; i++) {
            g.setColor(colors[i]);
            g.fillRect(legendX, legendY, 20, 20);
            g.setColor(Color.BLACK);
            g.drawString(labels[i], legendX + 30, legendY + 15);
            legendY += 25;
        }
    }

    public static void main(String[] args) {
        int[] data = {40, 30, 20, 10};
        String[] labels = {"React", "Angular", "Vue", "Other"};
        Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};

        JFrame frame = new JFrame("Survey Pie Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);

        PieChart pieChart = new PieChart(data, labels, colors);
        frame.add(pieChart);

        frame.setVisible(true);
    }
}
