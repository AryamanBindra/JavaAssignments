package inheritancePolymorphism;

public class Address {
	
	String city;
	int doorNo;
	String street;
	int pincode;
	
	public Address(String city, String street, int pincode,
			int doorNo) {
		this.city = city;
		this.doorNo = doorNo;
		this.pincode = pincode;
		this.street = street;
	}
	
	void printaddress() {
		System.out.println(doorNo+" "+city+" "+street+" "+pincode);
	}

}
