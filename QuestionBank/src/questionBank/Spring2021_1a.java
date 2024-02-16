package questionBank;

import java.util.Scanner;

public class Spring2021_1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		int even[] = new int[10];
		int odd [] = new int[10];
		int evenCount =0;
		int oddCount = 0;
		
		System.out.print("Enter the elements of the array:"); // entering the 10 elements
		for(i=0; i<10; i++)
		{
			array[i] = sc.nextInt();
		}
		
		for(i=0; i<10; i++)  // checking the odd and even elements
		{
			if(array[i] %2==0)
			{
				even[evenCount++] = array[i];
			}
			else
			{
				odd[oddCount++] = array[i];
			}
			
		}
		
		// displaying the even array
		System.out.println("the even elements are:");
		for(i=0; i<evenCount; i++)
		{
			System.out.print(even[i]);
		}
		System.out.println();
		// displaying the odd array
		System.out.println("the odd elements are:");
		for(i=0; i<oddCount; i++)
		{
			System.out.print(odd[i]);
		}
		
		
		
		

	}

}
