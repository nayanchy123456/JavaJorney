package questionBank;
//assume Fall2016_2a1 as Employee
public class Fall2016_2a1 extends Fall2016_2a {
	private double salary;
	
	public Fall2016_2a1(String name, int age, double salary)
	{
		super(name,age);
		this.salary = salary;
	}
	@Override
	public void showData()
	{
		System.out.println("Employee name is:" + getName()); // applying getter
		System.out.println("Employee age is:" + getAge());
		System.out.println("Employee salary is:" + salary);
		super.showData();
	}
	
	public static void main(String [] args)
	{
		Fall2016_2a1 employee = new Fall2016_2a1("ram", 20 , 20000);
		employee.showData();
		
	}
	
	
	
	

}
