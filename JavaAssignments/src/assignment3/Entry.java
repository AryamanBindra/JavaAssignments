package assignment3;

public class Entry {
	
	void start(Vehicle vehicle) {
		vehicle.printProperties();
		System.out.println(vehicle.Name +" "+ vehicle.type+" Started");
	}

	public static void main(String[] args) {
		
		Entry entry = new Entry();
		
		//has-a inheritance
		Vehicle bike = new Bike("Bike");
		bike.setName("Honda");
		entry.start(bike);
		
		Vehicle car = new Car("Car");
		car.setName("Toyota");
		entry.start(car);
	}

}
