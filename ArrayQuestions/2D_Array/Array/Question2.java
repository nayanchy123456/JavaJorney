package Array;
// take a matrix from user and search for a given number x and print the indices at which it occur.

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args)
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
		 
		 // asking the value of x
		 System.out.println("Enter the value of x:");
		 int x = sc.nextInt();
		 boolean numberFound = false;
		 
		 // checking the index of x in the matrix
		 for(int i=0; i<n; i++)
		 {
			 for(int j=0; j<m; j++)
			 {
				 if(arr[i][j] == x)
				 {
					 System.out.print("the index of x is" + " " + i + " " + j );
					 numberFound = true;
				 }
				 
			 }
		 }
		 if(!numberFound)
		 {
			 System.out.println("number not found");
		 }

		
	}
}
