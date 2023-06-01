package assignment2;

public class Student {
	String studentName;
	int id;
	int age;
	int totalmarks;
	
	// Default  Constructor
	public Student() {
		studentName = "Unknown";
	}
	
	// Parameterized Constructor
	public Student(String name, int id, int age, int totalmarks) {
		studentName = name;
		this.id = id;
		this.age = age;
		this.totalmarks = totalmarks;
	}
	
	public String getName() {
		return studentName;
	}
	
	public int getMarks() {
		return totalmarks;
	}
	public void print() {
		System.out.println("Name: " + studentName+" | Id: "+
	id+" | Age: "+age+" | Total Marks: "+totalmarks);
	}
	
//	public static void main(String[] args) {
//		Student s1 = new Student();
//		s1.print();
//		
//		Student s2 = new Student("Aryaman");
//		s2.print();
//	}

}
