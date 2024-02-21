package recursion;
// print sum of first natural numbers
public class Question3 {
	
	public static void calcSum(int i, int n, int sum)
	{
		
		if(i==n)
		{
			sum+=i;
			System.out.println(sum);
			return;
		}
		sum+=i;
		calcSum(i+1,n,sum);
		
	}

	public static void main(String [] args)
	{
		int n=5;
		int sum =0;
		calcSum(1, n, 0);
		
		
	}
}
