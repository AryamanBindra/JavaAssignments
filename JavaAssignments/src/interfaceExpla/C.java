package interfaceExpla;

public class C implements B{

	@Override
	public void B1() {
		// TODO Auto-generated method stub
		System.out.println("Implements due to interface B");
		
	}

	@Override
	public void A1() {
		// TODO Auto-generated method stub
		System.out.println("Implements due to interface A");
		
	}
	
	/*
	 * public void B2() { System.out.println("From class C"); }
	 */
	
	void A3() {
		System.out.println("From class C");
		B.super.A2();
	}
	
	public static void main(String[] args) {
		C c = new C();
		
		c.A1();
		c.B1();
		c.A3();
		//c.B2();
		
	}
	
	

}
