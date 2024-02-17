package questionBank;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Spring2015_5bClient {

	public static void main(String [] args)
	{
		try
		{
			Socket s = new Socket("localhost", 7777);
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			String msgToServer = "I am Client";
			byte b[] = msgToServer.getBytes();
			dos.write(b);
			
			System.out.println("msg is written");
			
			// reciving msg from server
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String msgFromServer;
			while((msgFromServer=dis.readUTF())!=null)
			{
				System.out.println("msg is received" +msgFromServer);
			}

			
			dos.flush();
			dos.close();
			s.close();
		
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
