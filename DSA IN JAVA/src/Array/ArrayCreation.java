package Array;

import java.util.Scanner;

public class ArrayCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements");
		n = sc.nextInt();
		int a[] =  new int[n];
		System.out.println("Enter the values:");
		for(i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		
		// displaying the array
		System.out.println("Array elements are:");
		for(i=0; i<n; i++)
		{
			System.out.print(a[i]);
			
		}
		
	}

}
