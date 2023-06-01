package Abstraction;

/*
//Abstraction
 * 	Cannot create an object of abstract class.
 *  Abstract methods cannot contain body
 *  Abstract class can't contain static methods. (Pending confirm)
 *  Abstract class can have non-abstract methods.
 *  Abstract class cannot be final
 *  Abstract class can have the constructors but cannot be used. (Pending confirm)
 *  
 *  Abstract class --> (0% to 100% abstraction) --> extends
 *  Interface (100% abstraction) --> implements
*/
public abstract class Mobile {
	
	public Mobile() {
		System.out.println("Mobile");
		}
	
	abstract void makeCall();
	
	abstract void sendSms();
	
	abstract void recordVideo();
	
//	static void demo() {}
	
	void takePic() {
		System.out.println("Take a pic");
	}

}
