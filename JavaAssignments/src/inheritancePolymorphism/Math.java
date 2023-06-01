package inheritancePolymorphism;

public class Math {
	// Method overloading methods should have a same name 
	// with different arguments.
	
	//compile time polimorphism
	
	void add(int a, int b) {
		System.out.println("Result: "+(a+b));
	}
	
	void add(int a, int b, int c) {
		System.out.println("Result: "+(a+b+c));
	}

	public static void main(String[] args) {
		
		Math cal = new Math();
		cal.add(5, 16); // binding with specific add at compile-time
		cal.add(4, 6, 89); // binding with specific add at compile-time

	}

}
