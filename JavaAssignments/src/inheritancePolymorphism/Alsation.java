package inheritancePolymorphism;

public class Alsation extends Dog {
	
	int lifespan;
	
	void speed() {
		System.out.println("Can run very fast");
	}
	
	// Method Overriding
	  void bark() { 
		  System.out.println("Alsation can bark louder");
	 }

	public static void main(String[] args) {
		
		Alsation Gs = new Alsation();
		Gs.bark();

	}

}
