package assignment1;

public class BetweenChar {

	public static void main(String[] args) {
		String given = "I love java programming";
		//String toExclude = "o";
		String newString = given.replaceAll("[ o]", "");
		System.out.println("No. of Char without ' ' & 'o': " + 
		newString.length());
	}
}



