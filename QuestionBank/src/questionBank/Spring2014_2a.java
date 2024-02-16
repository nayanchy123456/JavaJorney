package questionBank;

import java.util.Scanner;
// assume  Spring2014_2a as person

public  abstract class Spring2014_2a {
	
	String name;
	String address;
	int phoneNumber;
	String EmailAddress;
	abstract void to_String();
	
	public Spring2014_2a(String name,String address, int phoneNumber, String EmailAddress)
	{
		this.name = name;
		this.address= address;
		this.phoneNumber=phoneNumber;
		this.EmailAddress = EmailAddress;
		
	}
}
