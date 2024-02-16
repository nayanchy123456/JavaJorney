package userDefinedException;

public class ExceptionExample {
	public static void main(String[] args)
	{
		try {
			oddExp(40);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void oddExp(int num) throws InvalidNumException
	{
		if(num% 2!= 0)
		{
			throw new InvalidNumException();
		}
		else
		{
			System.out.println("your number is even");
		}
	}
}
