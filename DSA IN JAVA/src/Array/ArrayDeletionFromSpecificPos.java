package Array;

import java.util.Scanner;

public class ArrayDeletionFromSpecificPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,n,m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter the elements to be inserted:");
		for(i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		//displaying the elements
		for(i=0; i<n; i++)
		{
			System.out.println(a[i]);
		}
		
		// for deletion of element from array
		int b[] = new int[n-1]; // creating new array of size 1 less than original one
		System.out.println("Enter the index to be deleted:");
		m=sc.nextInt();
		for(i=0; i<a.length; i++)
		{
			if(i<m)
			{
				b[i] = a[i];
			}
			else if(i==m)
			{
				continue;
			}
			else
			{
				b[i-1] = a[i];
			}
		}
		//displaying the elements
		for(i=0; i<n-1; i++)
		{
			System.out.println(b[i]);
		}
		

	}

}
