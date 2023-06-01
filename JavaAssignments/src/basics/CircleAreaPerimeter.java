package basics;

import java.util.Scanner;
import java.lang.Math;

public class CircleAreaPerimeter {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter Radius: ");
		float radius = reader.nextFloat();
		
		double area = Math.PI * Math.pow(radius,2);
		
		double perimeter = 2 * Math.PI * radius;
		
		System.out.println("Area: " + area + "\nPerimeter: "+ perimeter);
		
		reader.close();
	}

}
