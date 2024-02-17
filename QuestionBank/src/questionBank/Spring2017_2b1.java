package questionBank;
// assume Spring2017_2b1 as B(child class)
public class Spring2017_2b1 extends Spring2017_2b {
	double salary;
	public Spring2017_2b1(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;

	}


	
	
	
	@Override
	public void show()
	{
		System.out.println("this is child class B");
		super.show();
	}
	public static void main(String[] args)
	{
		Spring2017_2b1 B = new Spring2017_2b1("hari",20,20000);
		B.show();
	}

}
