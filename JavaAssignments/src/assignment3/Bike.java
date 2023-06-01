package assignment3;

public class Bike extends Vehicle{

	public Bike(String type) {
		super(type);
	}

	int MaxSpeed;
	
	void setName(String name) {
		Name = name;
	}

	void printProperties() {
		System.out.println("Name: "+Name+" | Type: "+type+" | MaxSpeed: "+MaxSpeed);
		
	}

}
