package InExample;

public class Dog  extends Behaviour implements Animal{

	

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void eating() {
		// TODO Auto-generated method stub
		System.out.println("Eating called from dog");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eat method of interface");
	}
	
	public static void main(String [] args) {
		Dog d = new Dog();
		Animal a = new Dog();
		d.domestic();
		d.eating();
		a.eat();
		d.eat();
	}

	
	
}
