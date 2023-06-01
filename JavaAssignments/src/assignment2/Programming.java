package assignment2;

public class Programming {
	
	public Programming() {
		System.out.println("I love Programming!");
	}
	
	public Programming(String message) {
		System.out.println("I love " + message + "!");
	}

	public static void main(String[] args) {
		Programming p1 = new Programming();
		Programming p2 = new Programming("eating out");

	}

}
