package inputfield;
import java.util.Scanner;

public class something {
	public static void main(String [] args)
	{	
		System.out.println("Enter your name");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("your name is " + name);
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		System.out.println("your age is " + age);
		
	}
}
