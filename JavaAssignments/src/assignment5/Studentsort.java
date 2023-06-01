package assignment5;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

import assignment2.Student;

public class Studentsort {
	public static void main(String[] args) {
		Student s1 = new Student("Ary",001,21,90);
		Student s2 = new Student("Rika",002,20,100);
		Student s3 = new Student("Mia",003,20,59);
		Student s4 = new Student("Peng",004,21,78);
		Student s5 = new Student("Megan",005,22,99);
		
		ArrayList<Student> lst = new ArrayList<>();
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);
		lst.add(s4);
		lst.add(s5);
		lst.sort(Comparator.comparing(Student::getName));
		
		Iterator<Student> itr = lst.iterator();
		while(itr.hasNext()) {
			itr.next().print();
		}
	}
}
