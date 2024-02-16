package nayan;

public class Athlete extends person {
	 @Override
	 void eat()
	 {
		 System.out.println("Athlete person eats diet food");
		 
	 }
	 
	 void exercise ()
	 {
		 System.out.println("Athlete person exercise daily");
	 }
	  @Override
	  public void show()
	  {
		  super.show();
		  System.out.println("show of athlete");
	  }
	 
}