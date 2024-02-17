package questionBank;

import java.io.FileInputStream;

public class Spring2017_4b {
	public static void main(String [] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Nayan-Windows\\OneDrive\\Desktop\\TEXTS\\Spring2017_4b.txt");
		boolean i;
		while( i=fis.read()!=-1)
		{
			System.out.print(i);
		}
	}
}
