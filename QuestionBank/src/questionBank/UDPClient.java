package questionBank;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

	public static void main(String [] args)
	{
		try
		{
			String SERVER_ADDRESS = "localhost";
			int SERVER_PORT = 7777;
			DatagramSocket clientSide = new DatagramSocket();
			InetAddress serverAddress = InetAddress.getByName(SERVER_ADDRESS);
			
			while(true)
			{
				String msgToServer = "hello server";
				byte b[] = msgToServer.getBytes();
				DatagramPacket sendpacket = new DatagramPacket(b, b.length,serverAddress,SERVER_PORT);
				clientSide.send(sendpacket);
				
				
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
