package assignment3;

abstract public class Vehicle {
	
	int NoOfWheels;
	String Name;
	String type;
	
	public Vehicle(String type) {
		this.type = type;
	}
	
	abstract void setName(String name);
	
	void setWheels(int wheels) {
		NoOfWheels = wheels;
	}
	
	abstract void printProperties();
	
	/*
	 * Compilation Error
	public static void main(String[] args) {
		Vehicle h = new Vehicle();
	}
	 */
	
	

}
