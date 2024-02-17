package questionBank;
// assume Fall2016_2a as Human

public class Fall2016_2a {
	private String name;
	private int age;
	
	public Fall2016_2a(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void showData()
	{
		System.out.println("this is human class");
	}

}
