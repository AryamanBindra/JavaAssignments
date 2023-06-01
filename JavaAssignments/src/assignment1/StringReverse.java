package assignment1;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter String: ");
		String given = scan.nextLine();
		char[] cArray = given.toCharArray();
		System.out.print("Reversed:     ");
		for(int i=given.length()-1; i>=0; i--) {
			System.out.print(cArray[i]);
		}
		scan.close();
		
	}

}
