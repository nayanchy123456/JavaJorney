package questionBank;

public class OddNumException {
	public static void main(String [] args)
	{
		try
		{
			findOdd(51);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void findOdd(int num) throws InvalidOddException
	{
		if(num %2 !=0)
		{
			throw new InvalidOddException("this is odd number");
			
		}
		else
		{
			System.out.println( num +" "+ "is even number");
		}
		
	}

}
