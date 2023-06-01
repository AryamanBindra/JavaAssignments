package basics;

import java.util.Scanner;

public class ScanIt {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter Int: ");
		int intval = reader.nextInt();
		
		System.out.print("Enter Double: ");
		double doubleval = reader.nextDouble();
		
		System.out.print("Enter Float: ");
		float floatval = reader.nextFloat();
		
		System.out.print("Enter Boolean: ");
		boolean boolval = reader.nextBoolean();
		
		System.out.println(" Int: " + intval + "\n Double: " + doubleval + 
				"\n Float: " + floatval + "\n Boolean: " + boolval);
		
		reader.close();

	}

}
