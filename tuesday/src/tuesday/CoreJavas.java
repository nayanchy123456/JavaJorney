package tuesday;

import java.util.Scanner;

public class CoreJavas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements of array:");
		int n = sc.nextInt();
		int[] arr = new int [n];
		System.out.println("Enter the  elements in array:");
		for( i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("the elements of the array are:");
		for(i=0; i<n; i++)
		{
			System.out.print(arr[i]);
		}
		
		int arr1[] = new int [n+1];
		for(i=0; i<n; i++)
		{
			if(arr[i] < arr[i+1])
			{
				arr1[i] = arr[i];
			}
			
			else
			{
				arr1[i] = arr[i+1];
			}
		}
		System.out.println("the elements after sorting ");
		for(i=0; i<n; i++)
		{
			System.out.println(arr1[i]);
		}
	}

}
