package questionBank;
// assume Spring2014_2a1 as student

public class Spring2014_2a1 extends Spring2014_2a {
	private String freshman;
	private String sophomore;;
	private String junior;

	public Spring2014_2a1(String name, String address, int phoneNumber, String EmailAddress , String freshman, String sophomore, String junior) 
	{
		super(name, address, phoneNumber, EmailAddress);
		this.freshman = freshman;
		this.sophomore = sophomore;
		this.junior = junior;
	}

	@Override
	void to_String() {
		// TODO Auto-generated method stub
		
		
	}

}
