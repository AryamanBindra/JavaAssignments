package inheritancePolymorphism;

public class Student {
	
	int id;
	String name;
	String section;
	Address address;
	
	void printStudent() {
		System.out.println("Id: "+id+" Name: "+name+"Section: "+section);
	}
	
	public Student(int id, String name, String section,
			Address adress) {
		this.id = id;
		this.name = name;
		this.section = section;
		this.address = adress;
	}

	public static void main(String[] args) {
		Address home = new Address("LA", "xyz", 9001, 500);
		Student gayathri = new Student(17, "Gayathri", "QA", home);
		gayathri.address.printaddress();
		// Student Has-a relationship with Address.
	}

}
