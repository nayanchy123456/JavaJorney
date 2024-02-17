package questionBank;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Spring2015_5bServer {
	
	public static void main(String [] args)
	{
		try
		{
			ServerSocket ss = new ServerSocket(7777);
			while(true)
			{
				Socket s = ss.accept();
				DataInputStream dis = new DataInputStream(s.getInputStream());
				String msgFromClient;
				while((msgFromClient = dis.readUTF())!= null)
				{
					System.out.println("msg from client is:" + msgFromClient);
				}
				
			// printing the recieved msg to client
				DataOutputStream dos = new DataOutputStream(s.getOutputStream());
				String msgToClient = "msg is recieved";
				dos.writeUTF(msgToClient);
				
				dis.close();
				ss.close();
						
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
