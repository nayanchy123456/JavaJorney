package questionBank;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Fall2018_5bServer {
	
	public static void main(String [] args)
	{
		try
		{
			ServerSocket ss = new ServerSocket(6666);
			while(true)
			{
				Socket s = ss.accept();
				DataInputStream dis = new DataInputStream(s.getInputStream());
				String msgFromClient;
				while((msgFromClient = dis.readUTF()) !=null)
				{
					System.out.println(msgFromClient);
				}
				System.out.println("msg recieved");
				
				dis.close();
				ss.close();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
