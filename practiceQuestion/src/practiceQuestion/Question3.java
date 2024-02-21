package practiceQuestion;
//****
//***
//**
//*
public class Question3 {
	
	public static void calcPattern()
	{
		for(int i=4; i>=1; i--)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		calcPattern();
	}
}
