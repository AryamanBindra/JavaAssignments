package garbageCollector;

import inheritancePolymorphism.Animal;

/* 
 Garbage Collection:
 * How can object be unreferenced:
 * 		1. Reference of the object can be nullified. 
 * 		2. By assigning reference to another object.
 * 		3. By some anonymous object.
 */

public class Gb {
	
	public void finalize() {
		System.out.println("Finalize method has been called...");
	}
	
	
	//public static void main(String[] args) {
		
		//Animal a3 = new Animal();
		
		// a3 = null;   (1)
		
		//a3 = new Animal();   (2)
		
		
		
		
	//}

}
