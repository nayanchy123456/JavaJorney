package Array;

import java.util.Scanner;

// to ask array elements from user
public class Question1 {
	

	

	public static void main(String [] args)
	{
		int n,m;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows and column of array:");
		 n = sc.nextInt();
		 m = sc.nextInt();
		 int arr[][] = new int [n][m];
		 
		 System.out.println("Enter the elements of rows and column:");
		 // entering the rows and column 
		 for(int i=0; i<n; i++)
		 {
			 for(int j=0; j<m; j++)
			 {
				 arr[i][j] = sc.nextInt();
			 }
			
		 }
		 
		 // displaying rows and columns
		 for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++)
				{
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}

	}
}
