package Array;

import java.util.Scanner;

public class Question4 {
	
	int arr1[][] = new int[3][3];
	int arr2[][] = new int[3][3];
	int arr3[][] = new int[3][3];
	int rows, column;
	
	public void getMatrix()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and column for first matrix");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				arr1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the rows and column for second matrix");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				arr2[i][j]= sc.nextInt();
			}
		}
		
	}
	
	public void showMatrix()
	{
		System.out.println("the first matrix is:");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}
		

		System.out.println("the second matrix is:");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr2[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
	public void multiplyMatrix()
	{
		System.out.println();
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				arr3[i][j]=0;
				for(int k=0; k<3; k++)
				{
					arr3[i][j] = arr3[i][j] + arr1[i][k] * arr2[k][j];
				}
			}
		}
	}
	
	
	
	public void showMultiplyMatrix()
	{
		System.out.println("the multliplication of matrix is:");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr3[i][j] + " " + "");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args)
	{
		Question4 q4 = new Question4();
		q4.getMatrix();
		q4.showMatrix();
		q4.multiplyMatrix();
		q4.showMultiplyMatrix();
	}

}
