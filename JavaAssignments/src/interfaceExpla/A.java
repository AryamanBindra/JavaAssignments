package interfaceExpla;

public interface A {
	abstract void A1();
	
	default void A2() {
		System.out.println("From Interface A");
	}
}
