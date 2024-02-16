package wednesday;

public class Hello {
	  static void helloFriend()
	{
		System.out.println("hello friends");
	}
	 
	 static void helloAgain()
	 {
		 helloFriend();
		 System.out.println("hello again");
	 }
	
	public static void main(String[]args)
	{
//		helloFriend();
		helloAgain();
		 
	}
}
