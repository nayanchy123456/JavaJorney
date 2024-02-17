package questionBank;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
	public static void main(String[] args)
	{
		final int port = 7777;
		try
		{
			DatagramSocket  ServerSide = new DatagramSocket (port);
			while(true)
			{
				byte a [] = new byte[1024];
				DatagramPacket receivePacket = new DatagramPacket(a,a.length);
				ServerSide.receive(receivePacket);
				
				String receivemsg = new String(receivePacket.getData(),0,receivePacket.getLength());
				System.out.print("packet received" + receivemsg);
				
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
