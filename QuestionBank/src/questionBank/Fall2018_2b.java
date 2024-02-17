package questionBank;

public class Fall2018_2b extends Exception {

		
	public static void main(String[] args) {
		
		try
		{
			AriException(2,0);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		

	}
	
	
	public static  void AriException(int num1, int num2)
	{
		try 
		{
			int result = num1 /num2;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
