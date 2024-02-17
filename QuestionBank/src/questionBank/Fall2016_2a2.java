package questionBank;
// assume Fall2016_2a2 as manager 
public class Fall2016_2a2 extends Fall2016_2a1 {

	public Fall2016_2a2(String name, int age, double salary) {
		super(name, age, salary);
		
	}
	@Override
	public void showData()
	{
		System.out.println("this is manager class");
		super.showData();
	}
	public static void main(String[] args)
	{
		Fall2016_2a2 manager = new Fall2016_2a2("hari" , 22,22000);
		manager.showData();
	}


}
