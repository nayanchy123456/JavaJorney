package menuExample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuExample{
	public MenuExample()
	{
		JFrame f = new JFrame("menubar, menu,submenu and menuItems");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar mb = new JMenuBar();
		JMenu m = new JMenu("menu");
		JMenu sm = new JMenu("submenu");
		JButton b = new JButton("click here");
		
		JMenuItem i1 = new JMenuItem("item1");
		JMenuItem i2 = new JMenuItem("item2");
		JMenuItem i3 = new JMenuItem("item3");
		JMenuItem i4= new JMenuItem("item4");
		JMenuItem i5 = new JMenuItem("item5");
		
		b.setBounds(200,200,100,30);
		
		b.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						System.out.println("button is clicked");
					}
				}
		);
		
		m.add(i1);
		m.add(i2);
		m.add(i3);
		
		sm.add(i4);
		sm.add(i5);
		
		m.add(sm);
		
		mb.add(m);
		
		f.add(b);
		f.setJMenuBar(mb);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[]args)
	{
		new MenuExample();
		
	}

}
