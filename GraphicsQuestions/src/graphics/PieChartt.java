package graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

class PercentSlice {
    double percentage; // Percentage of the whole pie
    Color color;

    public PercentSlice(double percentage, Color color) {
        this.percentage = percentage;
        this.color = color;
    }
}

class MyComponent extends JComponent {
    PercentSlice[] slices = {
            new PercentSlice(15, Color.yellow),   // 15% slice
            new PercentSlice(30, Color.GREEN),    // 30% slice
            new PercentSlice(25, Color.blue),     // 25% slice
            new PercentSlice(30, Color.red)        // 30% slice
    };

    MyComponent() {

    }

    public void paint(Graphics g) {
        drawPie((Graphics2D) g, getBounds(), slices);
    }

    void drawPie(Graphics2D g, Rectangle area, PercentSlice[] slices) {
        double totalPercentage = 100.0;
        double curPercentage = 0.0D;
        int startAngle = 0;

        for (int i = 0; i < slices.length; i++) {
            startAngle = (int) (curPercentage * 360 / totalPercentage);
            int arcAngle = (int) (slices[i].percentage * 360 / totalPercentage);

            g.setColor(slices[i].color);
            g.fillArc(area.x, area.y, area.width, area.height, startAngle, arcAngle);

            // Adding percentage labels
//            int labelX = area.x + area.width / 2;
//            int labelY = area.y + area.height / 2;
//            drawPercentageLabel(g, slices[i].percentage, labelX, labelY);

            curPercentage += slices[i].percentage;
        }
    }

//    void drawPercentageLabel(Graphics2D g, double percentage, int x, int y) {
//        String label = String.format("%.1f%%", percentage);
//        g.setColor(Color.BLACK);
//        g.setFont(new Font("Arial", Font.PLAIN, 12));
//        g.drawString(label, x, y);
//    }
}

public class PieChartt {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new MyComponent());
        frame.setSize(400, 400);
       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}