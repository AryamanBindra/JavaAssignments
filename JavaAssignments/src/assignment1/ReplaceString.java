package assignment1;

public class ReplaceString {

	public static void main(String[] args) {
		String given = "Dog chases cat, Cat chases rat";
		System.out.println(given.replaceAll("(?i)cat", "rat"));

	}

}
