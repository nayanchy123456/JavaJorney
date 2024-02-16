package tuesday;

import java.util.Scanner;

public class CoreJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];
		System.out.println("Enter the no of elements in array:");
		for( i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("the elements of the array are:");
		for(i=0; i<n; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
