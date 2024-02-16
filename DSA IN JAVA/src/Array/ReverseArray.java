package Array;
// reverse the array elements

import java.util.Scanner;

public class ReverseArray {
	public static void  main(String [] args)
	{
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		n = sc.nextInt();
		
		int array1[] = new int[n];
		int array2[] = new int [n];
		System.out.println("Enter the array elements:");
		for(i=0; i<n; i++)
		{
			array1[i] = sc.nextInt();
		}
		// displaying the array elements
		System.out.print("Array elements are:");
		for(i=0; i<n; i++)
		{
			System.out.print(" " + array1[i]);
		}
		
		// reversing the array elements 
		for(i=0; i<n; i++)
		{
			 array2[i]= array1[n-1-i];
		}
		System.out.println();
		// displaying after reversing
		System.out.println("The elements after reversing are:");
		for(i=0; i<n; i++)
		{
			System.out.print(array2[i]);
		}
	}

}
