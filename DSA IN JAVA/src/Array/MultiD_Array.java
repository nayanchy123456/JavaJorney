package Array;

import java.util.Scanner;

public class MultiD_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows:");
		n = sc.nextInt();
		System.out.println("Enter the no. of columns:");
		m=sc.nextInt();
		int a[][] = new int[n][m];
		System.out.print("Insert the array elements:");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		// displaying the array elements
		System.out.println("The array elements are:");
		for(int i=0; i<n; i++)  // n=2 and m = 3
		{
			for(int j=0; j<m; j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
			
		}

	}

}
