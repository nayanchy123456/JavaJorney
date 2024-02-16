package questionBank;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Spring2019_4a extends JFrame 
{
    public Spring2019_4a() 
    {
        JTextField t1 = new JTextField(20);
        t1.setBounds(50, 50, 20, 20);
        JTextField t2 = new JTextField(20);
        t2.setBounds(50, 70, 20, 20);
        JButton b = new JButton("click");
        b.setBounds(50, 90, 20, 20);

        JPanel panel = new JPanel();

        panel.add(new JLabel("Radius:"));
        panel.add(t1);
        panel.add(new JLabel("Area:"));
        panel.add(t2);
        panel.add(b);

        t2.setEditable(false);

        // Add action listener to the button
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double radius = Double.parseDouble(t1.getText());
                double area = Math.PI * Math.pow(radius, 2);
                t2.setText(String.valueOf(area));
            }
        });

        add(panel); 
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Spring2019_4a();
    }
}
