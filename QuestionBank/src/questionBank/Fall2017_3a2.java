package questionBank;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

// deserialization
public class Fall2017_3a2 {
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\Nayan-Windows\\OneDrive\\Desktop\\Spring20163b.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Fall2017_3a student = (Fall2017_3a)ois.readObject();
			
			System.out.println(student.name + " " + student.age);
			ois.close();
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
