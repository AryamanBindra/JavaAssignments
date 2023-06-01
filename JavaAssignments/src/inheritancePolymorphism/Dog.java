package inheritancePolymorphism;

public class Dog extends Animal{
	String breed;
	String color = "Red";
	
	
	void bark() {  
		System.out.println("Dog barks"); 
	}
	 
	// Method Overriding
	void walk() {
		System.out.println("Dog can walk");
		super.walk();
	}
	
	// Method Overriding
	void eat() {
		System.out.println("Dog can eat");
	}
	
	void printColor() {
		System.out.println(super.color);
	}

	public static void main(String[] args) {
	/*	
		Dog breno = new Dog();
		breno.walk();
		breno.eat();
		breno.color = "black";
		breno.breed = "Doberman";
		breno.family = "Canids";
		breno.name = "Breno";
		breno.teeth = 3;
		breno.printProperties();
	
		
		Dog tiger = new Dog();
		tiger.teeth = 4;
		breno.printProperties();
		
//		Polymorphism
		Animal donkey = new Dog();
		donkey = new Alsation();
		donkey = new Animal();
		Dog d1 = new Alsation();
		Animal d2 = new Alsation();
		*/

//      Runtime polymorphism -> changed its form at runtime
		Animal a = new Dog();
		//a = new Alsation();
		a.walk(); // compile time binding happens to animal class walk method
		a.bark();
		
		
		Dog d = new Dog();
		d = new Alsation();
		d.bark();
		d.walk();
		d.printColor(); 
	}

}
