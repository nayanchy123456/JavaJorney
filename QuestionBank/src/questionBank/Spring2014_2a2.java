package questionBank;
//assume Spring2014_2a2 as Employee

public class Spring2014_2a2 extends Spring2014_2a {
	private String office;
	private int salary;
	private String hiredate;

	public Spring2014_2a2(String name, String address, int phoneNumber, String EmailAddress , String office , int salary, String hiredate)
	{
		super(name, address, phoneNumber, EmailAddress);
		this.office = office;
		this.salary = salary;
		this.hiredate = hiredate;
	}
	@Override
	void to_String() {
		// TODO Auto-generated method stub
		System.out.println("person name is:"+ name); 
		System.out.println("object class name is:" + this.getClass().getSimpleName() );
		
		
	}
	
	public static void main(String []  args)
	{
		Spring2014_2a2 Employee = new Spring2014_2a2("Ram" ,"ktm",98,"ram@gamil.com","lalitpur",2000,"feb13");
		Employee.to_String();
	}
	
}