package basics;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter 1: ");
		float val1 = reader.nextFloat();
		
		System.out.print("Enter 2: ");
		float val2 = reader.nextFloat();
		
		System.out.print("Enter 3: ");
		float val3 = reader.nextFloat();
		
		float sum = val1 + val2 + val3;
		
		float average = sum/3;
		
		System.out.println("Sum: " + sum + "\nAverage: " + average);
		
		reader.close();

	}

}
