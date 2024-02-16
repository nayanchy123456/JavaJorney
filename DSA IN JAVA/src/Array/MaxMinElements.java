package Array;

import java.util.Scanner;

//Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons.

public class MaxMinElements {

		public static void main(String [] args)
		{	
			int n ,i ,j;
			int temp;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the size of array:");
			n = sc.nextInt();
			int arr[] = new int[n];
			System.out.print("Enter the elements of array:");
			for( i = 0; i<n; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			System.out.print("The elements are:");
			for(i=0; i<n; i++)
			{
				System.out.print(" " + arr[i]);
			}
			
			// for sorting the elements in ascending order 
			for(i=0; i<n; i++)
			{
				for( j = i+1; j<n; j++)
				{
					if(arr[i] > arr[j])
					{
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}	
				System.out.println();
				System.out.print("The elements in ascending order :");
				for(i=0; i<n; i++)
				{
					System.out.print(" " + arr[i]);
				}
				
				System.out.println();
			
				// displaying the maximum and minimum element
					System.out.println("minimum element is :");
					System.out.println(arr[0]);
					System.out.println("maximum element is :");
					System.out.println(arr[n-1]);
				
			
				
		}
}
