package practiceQuestion;
//Write  function to calculate the sum of first n natural numbers.
public class Question2 {

	public static void calcSum(int n)
	{
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			
			sum+=i;
		}
		System.out.println("the sum of  natural number of " + " "+ n + " " + "is " + sum);
		
	}
		
	public static void main(String[] args)
	{
		int n =10;
		calcSum(n);
	}
}
