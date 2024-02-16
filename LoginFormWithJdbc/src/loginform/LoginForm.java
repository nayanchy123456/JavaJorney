package loginform;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.mysql.cj.protocol.Resultset;

public class LoginForm extends JFrame{
		static JTextField username,showusername,showpassword;
		static JPasswordField password;
		JLabel l1,l2;
		JButton btn;
	
	public LoginForm()
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
		
		btn.addActionListener(new ActionListener()
				{

					@SuppressWarnings("resource")
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						 Connection con = null;
						 PreparedStatement stmt = null;
						 ResultSet rs = null;
						try {
							Class.forName("com.mysql.cj.jdbc.Driver");
							 con =  DriverManager.getConnection("jdbc:mysql://localhost:3308/LoginForm","root","");
							String query1 = "create table login(username varchar(255), password varchar(255))";
							 stmt = con.prepareStatement(query1);
							 
							 String query2 = "insert into login (username,password) values (?,?)";
							 stmt = con.prepareStatement(query2);
							 stmt.setString(1,"Nayan");
							 stmt.setString(2, "nayan1234");
							 
							 String query3 = "SELECT * FROM login WHERE username = ? AND password = ?";
							 
							 	stmt = con.prepareStatement(query3);
							    stmt.setString(1, username.getText());
							    stmt.setString(2, password.getText());
							    rs = stmt.executeQuery();
						     if(rs.next())
						     {
						    	 JOptionPane.showMessageDialog(null, "Login Sucessfull");
						    	 showusername.setText(username.getText());
						    	 showpassword.setText(password.getText());
						     }
						     else
						     {
						    	 JOptionPane.showMessageDialog(null, "Invalid Credentials");
						     }

							 
						}
						catch(Exception e1)
						{
							System.out.print(e1);
						}
						finally {
							try {
								stmt.close();
								con.close();
							}
							catch(Exception e1)
							{
								System.out.println(e1);
							}
						}

					}
				});
		setVisible(true);
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
				 new LoginForm();
	}
}
