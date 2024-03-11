package eventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MousePointerFrame extends JFrame {
    private JTextField insideOutsideTextField;
    private JTextField coordinatesTextField;

    public MousePointerFrame() {
        super("Mouse Pointer Tracker");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        insideOutsideTextField = new JTextField("Mouse is outside");
        insideOutsideTextField.setEditable(false);

        coordinatesTextField = new JTextField("Coordinates: (0, 0)");
        coordinatesTextField.setEditable(false);

        getContentPane().setLayout(new GridLayout(2, 1));
        getContentPane().add(insideOutsideTextField);
        getContentPane().add(coordinatesTextField);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                insideOutsideTextField.setText("Mouse is inside");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                insideOutsideTextField.setText("Mouse is outside");
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                coordinatesTextField.setText("Coordinates: (" + e.getX() + ", " + e.getY() + ")");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	MousePointerFrame frame = new MousePointerFrame();
            frame.setVisible(true);
        });
    }
}


