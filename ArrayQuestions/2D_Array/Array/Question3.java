package Array;

import java.util.Scanner;

// find the transpose of a matrix 
public class Question3 {
	
	public static void main(String [] args)
	{
		int row,column;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows and column of array:");
		 row = sc.nextInt();
		 column = sc.nextInt();
		 int arr[][] = new int [row][column];
		 
		 System.out.println("Enter the elements of rows and column:");
		 // entering the rows and column 
		 for(int i=0; i<row; i++)
		 {
			 for(int j=0; j<column; j++)
			 {
				 arr[i][j] = sc.nextInt();
			 }
			
		 }
		 
		 // displaying rows and columns
		 System.out.println(" Elements of rows and columns are:");
		 for(int i=0; i<row; i++)
			{
				for(int j=0; j<column; j++)
				{
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		 System.out.println("Transpose of matrix is:");
		 
		 // transposing the matrix
		 
		 for(int j=0; j<column; j++)
		 {
			 for(int i=0; i<row; i++)
			 {
				 System.out.print(arr[i][j]);
			 }
			 System.out.println();
		 }
		 

	}
}
