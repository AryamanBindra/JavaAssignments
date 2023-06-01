package interfaceExpla;

public interface B extends A{
	void B1();
	
	default void B2() {
		System.out.println("From Interface B");
	}

}
