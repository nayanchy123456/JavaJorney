package questionBank;

public class UserDefinedException {
	
	public static void main(String [] args) 
	{
		try
		{
			validate(16);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	
	
	public static void validate(int age) throws InvalidAgeException
	{
		if(age<=16)
		{
			throw new InvalidAgeException("can not vote");
		}
		else
		{
			System.out.println("Eligible to cast vote");
		}
	}

}
