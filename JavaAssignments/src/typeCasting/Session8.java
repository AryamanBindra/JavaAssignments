package typeCasting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import inheritancePolymorphism.Animal;

public class Session8 {

	public static void main(String[] args) {

		//int[] number = new int[5]; //static
		//ArrayList<Integer> numbers = new ArrayList<Integer>(); //Dynamic
		Set<Integer> numbers = new HashSet<>();
		numbers.add(5);
		numbers.add(6);
		numbers.add(10);
		numbers.add(6);
		numbers.add(null);
		
		Iterator itr = numbers.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Animal a = new Animal();
		String s = new String("Mithun");
		Integer i = new Integer(5);
		
		
		
		ArrayList<Object> num = new ArrayList<>();	
		num.add(i);
		num.add(s);
		num.add(a);
		
		HashSet<String> s1 = new HashSet<>();
		s1.add(s);
	}

}
