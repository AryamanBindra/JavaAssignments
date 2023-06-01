package basics;

import java.util.Scanner;

public class InfoGather {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = reader.next();
		
		System.out.print("Age: ");
		int age = reader.nextInt();
		
		System.out.print("Gender: ");
		String gender = reader.next();
		
		reader.nextLine();
		
		System.out.print("Address: ");
		String address = reader.nextLine();
		
		System.out.println("\nName: " + name + "\nAge: " + age + "\nGender: " + 
		gender);
		
		System.out.println("Address: " + address);
		
		reader.close();

	}

}
