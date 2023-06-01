package typeCasting;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee>{
	
	int empID;
	int empAge;
	String empName;
	
	public Employee(int id, int age, String name) {
		this.empAge = age;
		this.empID = id;
		this.empName = name;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(12,45, "Mahesh");
		Employee e2 = new Employee(1,34, "xyz");
		Employee e3 = new Employee(20,50, "ABC");
		
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		Collections.sort(employees);
		
		for(Employee e : employees) {
			System.out.println("Age of employee is: "
		+e.empAge+" Name: "+e.empName+" Id: "+e.empID);
			
		}
		
		
		
	}

	@Override
	public int compareTo(Employee o) {
		if(this.empName == o.empName) {
			return 0;
		}		
		else if(this.empAge>o.empAge) {
			return 1;
		}
		else
			return -1;
	}
}
