package questionBank;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Spring2017_4b {
	public static void main(String [] args)
	{
		try
		{
			FileInputStream fis = new FileInputStream ("C:\\Users\\Nayan-Windows\\OneDrive\\Desktop\\TEXTS\\Spring2017_4b.txt");
			FileOutputStream fos = new FileOutputStream ("C:\\Users\\Nayan-Windows\\OneDrive\\Desktop\\TEXTS\\Spring2017_4b1.txt");
			
			int line;
			while((line = fis.read()) != -1)
			{
				fos.write(line);
			}
			
			fis.close();
			fos.close();
			System.out.println("successfully done");
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
