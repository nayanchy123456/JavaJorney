package questionBank;
// assume Fall2018_2a as Employee
public class Fall2018_2a {
	int id;
	String name;
	String post;
	double salary;
	
	public Fall2018_2a(int id, String name, String post, double salary)
	{
		this.id = id;
		this.name = name;
		this.post = post;
		this.salary = salary;
	}
	@Override
	public String toString()
	{
		System.out.println("name is:" + name +" " + "id is:" +id + " " + "post is:" + post + " " + " salary is:"  + salary);
		return name;
	}
	
	public static void main(String [] args) {
		Fall2018_2a Employee = new Fall2018_2a(1, "ram", "manager", 290000);
		Employee.toString();
		
	}

}
