package typeCasting;

//IMP: Java is not 100% OOP language because you cannot 
//create objects of any primitive data types.
// --> To solve this wrapper classes were created.

public class Generics <AnyType>{
	
	private AnyType at; // Instance variable of AnyType
	
	public Generics(AnyType t) {
		at = t;
	}
	
	AnyType getType() {
		return at;
	}
	
	void showType() {
		System.out.println("Type of data (AnyType) is: "+at.getClass().getName());
	}
	
	public static void main(String[] args) {
		Generics<String> st = new Generics<String>("Hello");
		System.out.println(st.getType());
		st.showType();
		
		Generics<Integer> it = new Generics<Integer>(1234);
		System.out.println(it.getType());
		it.showType();
		//Generics<int> s = new Generics<int>(null);
		//int i = new int(); --> Thats why we use wrapper class
		int c = 10; //Primitive int
		int i = new Integer(c); //auto boxing
		int b = i; //auto Unboxing
		System.out.println(b);
	}

}
