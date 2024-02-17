package arrayquestions;
//Write a Java program to reverse an array.
public class Question4 {
	
	int a[] = {4,2,3,1,5};
	int b[] = new int[5];
	public static void main(String [] args)
	{
		Question4 q4 = new Question4();
		q4.reverseArr();
		q4.showarr();
	}
	
	public void reverseArr()
	{
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				b[b.length-j-1]=a[j];
			}
		}
		System.out.println();
	}
	
	public void showarr()
	{
		for(int i=0; i<5; i++)
		{
			System.out.print(b[i]);
		}
		System.out.println();
	}
	
}
