package Array;

import java.util.Scanner;

public class ArrayInsertionInSpecificPos {
	
	public static void main(String [] args)
	{
		int i,n,m,p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements in array:");
		n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n+1];// creating new array of size n+1
		System.out.println("Enter the elements of array:");
		
		for(i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		
		// for display the array elements
		for(i=0; i<n; i++)
		{
			System.out.println(a[i]);
		}
		
		
		System.out.println("Enter the index where new value is to be inserted:");
		p = sc.nextInt();
		System.out.println("Enter the value to be inserted in position:");
		m = sc.nextInt();
		for(i=0; i<n+1; i++)
		{
			if(i<p)
			{
				b[i] = a[i];
			}
			else if(i==p)
			{
				b[i] = m;
			}
			else
			{
				b[i]= a[i-1]; 
			}
		}
		// displaying the new array
		for(i=0; i<n+1; i++)
		{
			System.out.println(b[i]);
		}
	}

}
