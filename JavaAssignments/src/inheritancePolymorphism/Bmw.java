package inheritancePolymorphism;

public class Bmw extends Car{
	String color;
	String model;
	int wheels;
	
	public Bmw(String color, String model, int wheels) {
		super(color, model);
		this.wheels = wheels;
		this.model = model;
		this.wheels = wheels;
		System.out.println("Color of the car: "+color+
				" Model: "+model+" Wheels: "+wheels);
	}
	
	 public static void main(String[] args) {
		Bmw x1 = new Bmw("Red", "X1", 4);
	}

}
