package questionBank;


import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Fall2018_5bClient {

	public static void main(String[] args)
	{
		try
		{
			Socket s = new Socket("localhost",6666);
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			Scanner sc = new Scanner(System.in);
			System.out.println("enter input to be sent to the server");
			String msgToServer = sc.nextLine();
			dos.writeUTF(msgToServer);
			dos.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
