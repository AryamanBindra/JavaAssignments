package inheritancePolymorphism;

public class Animal {
	
//  Inheritance 
//	a. is-a relationship
//  b. Has-A relationship
	
//	Method Overriding:
	// a. Method should have same name as a parent's method
	// b. Parameter should also be same like parent's
	// c. It should have a is-a relationship
	int teeth;
	int legs;
	String name;
	int eyes;
	String color = "Black";
	String family;
	
	public void finalize() {
		System.out.println("Finalize method has been called...");
	}
	
	void printProperties() {
		System.out.println("Legs: "+legs+" Name: "+name
				+" Color: "+color+" family: "+family+" Teeth: "+teeth);
	}
	void bark() {
		System.out.println("Animal barks");
	}
	
	void walk() {
		System.out.println("Animal can walk");
	}
	
	void eat() {
		System.out.println("Animal can eat");
	}
	
	void printColor() {
		color = "Brown";
		System.out.println(color);
	}

}
