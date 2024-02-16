package filewriter;
import java.io.FileOutputStream;
import java.io.IOException;
@SuppressWarnings("unused")
public class FOS {
	public static void main(String[] args) {
		String FileName = "myname.txt";
		String YourName = "Nayan";
		
	
		try
		{
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Nayan-Windows\\OneDrive\\Desktop\\myname.txt");
			byte [] nameBytes = YourName.getBytes();
			fos.write(nameBytes);
			System.out.println("your name has been written to " + FileName);
			fos.close();
		
		}
		catch(Exception e)
		{
			System.err.println("an error occured:"+ e.getMessage());
			

		}
		
		
		
	}
	
}
