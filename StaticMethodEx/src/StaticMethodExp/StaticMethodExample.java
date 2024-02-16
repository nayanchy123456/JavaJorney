package StaticMethodExp;

public class StaticMethodExample {

	//non-static function   
	void display()  
	{  
	System.out.println("A non-static function is called.");  
	}  
	//static function  
	static void show()  
	{  
	System.out.println("The static function is called.");      
	}  

	
	
	public static void main(String [] args)
	{	
		@SuppressWarnings("unused")
		StaticMethodExample st = new StaticMethodExample();
		st.display();
		
		StaticMethodExample.show();
		
		
	}
}
