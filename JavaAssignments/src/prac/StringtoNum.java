package prac;

import java.util.Iterator;

public class StringtoNum {

	public static void main(String[] args) {
		// String number to int number
		
		String number = "7689";
		int result =0;
		
		System.out.println(number);
		
		// '7' --> 55 - 48 == 7
		// '6' --> 54 - 48 == 6
		// 7 * 10 == 70 + 6 == 76 * 10 == 760+8 = 768*10
		// == 7680+9 = 7689
		

		for(int i=0; i<number.length();i++) {
			
			int digit = number.charAt(i) - 48;
			
			result = result*10+digit;
		
		}
		System.out.println("Int value is: "+result);

	}

}
