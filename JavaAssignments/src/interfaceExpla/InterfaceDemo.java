package interfaceExpla;

/*
 Interface:
 * Interface methods cannot have a body.
 * Interface will also represent Is-A relationship.
 * Cannot create an object out of interfaces, You are allowed to have a reference type
 * All variables are automatically changed to public static final.
 * Method can be created with body only if you make it as default.
 * To maintain the backward compatibility we have a default method in interface.
 */

public interface InterfaceDemo {
	int i = 10;
	
	public static final int j = 10;
	
	abstract void m1();
	
	abstract void m2();
	
	default void m3() {
		System.out.println("Default method");
	}
}
