package recursion;

import java.util.Scanner;

// print the numbers from n to 1 where n is taken by user
public class Question2 {
	public void printNum(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		printNum(n-1);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		Question2 q2 = new Question2();
		q2.printNum(n);
	}

}
