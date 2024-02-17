package questionBank;

import java.io.FileOutputStream;

public class Spring2016_3b {
	public static void main(String [] args)
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Nayan-Windows\\OneDrive\\Desktop\\Spring20163b.txt");
			String s = "Hello World";
			byte[] b = s.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("successfully written into file");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
