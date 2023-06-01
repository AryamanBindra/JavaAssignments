package assignment1;

public class Count {

	public static void main(String[] args) {
		String given = "Hello Java 8";
		int digit = 0;
		int low = 0;
		int up = 0;
		char[] divide = given.toCharArray(); //Check each char
		for(int i=0; i<divide.length; i++) {
			if(Character.isDigit(divide[i])) {
				digit++;
			}
			else if(Character.isUpperCase(divide[i])) {
				up++;
			}
			else if(Character.isLowerCase(divide[i])) {
				low++;
			}
		}
		System.out.println("No. of int: " + digit);
		System.out.println("No. of low: " + low);
		System.out.println("No. of up : " + up);
	}
}


