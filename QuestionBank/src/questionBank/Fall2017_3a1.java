package questionBank;
// serialization

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Fall2017_3a1 {
	public static void main(String[] args) 
	{
		
	
	
		try
		{
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Nayan-Windows\\OneDrive\\Desktop\\Spring20163b.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Fall2017_3a Student = new Fall2017_3a("ram",22);
		oos.writeObject(Student);
		System.out.println("successfully written ");
		
		oos.close();
	
		}
		catch(Exception e)
		{
		System.out.println(e);
		}

	}

}
