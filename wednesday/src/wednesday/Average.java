package wednesday;
//2. Write a Java method to compute the average of three numbers.

import java.util.Scanner;

public class Average {
	
	public static void main(String [] args)
	{
		int num1, num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		num1 = sc.nextInt();
		System.out.println("Enter the 2nd number:");
		num2 = sc.nextInt();
		System.out.println("Enter the 3rd number:");
		num3 = sc.nextInt();
		
		Average a = new Average();
		a.findAvg(num1,num2,num3);
		
	}
	
	public void findAvg( int num1 , int num2 ,int num3)
	{
		int avg = (num1 + num2 + num3)/3;
		System.out.println("the average number is " + avg);
	}

	
}
