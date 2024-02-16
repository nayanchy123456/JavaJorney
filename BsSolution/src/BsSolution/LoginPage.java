package BsSolution;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;p
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class LoginPage extends JFrame{
		JTextField username,showusername,showpassword;
		JPasswordField password;
		JLabel l1,l2;
		JButton btn;
	
	public LoginPage()
	{
		setTitle("Login Form");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		  username = new JTextField(20);
		  password = new JPasswordField(20);
		  btn = new JButton("login");
		  l1 = new JLabel("Username:");
		  l2 = new JLabel("Password:");
		  showusername = new JTextField(20);
		  showpassword = new JTextField(20);
		  showusername.setEditable(false);
		  showpassword.setEditable(false);
		
		add(l1);
		add(username);
		add(l2);
		add(password);
		add(btn);
		add(showusername);
		add(showpassword);
		setVisible(true);
		
		btn.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						Connection conn = null;
						PreparedStatement stmt = null;
						try
						{
							Class.forName("com.mysql.cj.jdbc.Driver");
							conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/LoginPage","root","");
							
						}
						catch(Exception e1)
						{
							System.out.println(e1);
						}
						
						finally
						{
							try
							{
								conn.close();
								stmt.close();
							}
							catch(Exception ex)
							{
								System.out.print(e);
							}
						}
						
					}
		
				});
	}

	 	public static void main(String[] args)
	 	{
	 		new LoginPage();
	 	}
}
