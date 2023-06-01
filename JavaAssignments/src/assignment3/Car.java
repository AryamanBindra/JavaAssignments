package assignment3;

public class Car extends Vehicle{
	
	public Car(String type) {
		super(type);
	}

	double TurningRadius;

	void setName(String name) {
		Name = name;
	}

	void printProperties() {
		System.out.println("Name: "+Name+" | Type: "+type+" | Turning Radius: "+TurningRadius);		
	}
	
	
	
	
	
	
	
	

}
