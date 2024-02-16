package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingExample1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Label, TextField, and Button Example");

        JLabel fname = new JLabel("First Name");
        JLabel lname = new JLabel("Last Name");
        JLabel dob = new JLabel("Date of Birth");

        fname.setBounds(50, 50, 200, 30);
        lname.setBounds(50, 80, 200, 30);
        dob.setBounds(50, 110, 200, 30);

        f.add(fname);
        f.add(lname);
        f.add(dob);

        JTextField t1 = new JTextField("First Name");
        JTextField t2 = new JTextField("Last Name");
        JTextField t3 = new JTextField("Date of Birth");

        t1.setBounds(250, 55, 120, 20);
        t2.setBounds(250, 85, 120, 20);
        t3.setBounds(250, 115, 120, 20);

        f.add(t1);
        f.add(t2);
        f.add(t3);

        JButton b = new JButton("Click Here");
        b.setBounds(50, 150, 95, 30);

//         Adding ActionListener to the button
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button is clicked!!");
            }
        });

        f.add(b);

        f.setSize(400, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}
