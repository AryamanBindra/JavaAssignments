package assignment5;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedSort {
	public static void main(String[] args) {
		LinkedList<Integer> lst = new LinkedList<>();
		lst.add(3);
		lst.add(24);
		lst.add(109);
		lst.add(25);
		lst.add(18);
		lst.sort(null);
		Iterator<Integer> itr = lst.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		String word = "hello";
		String center = "***";
		int half = word.length()/2;
		System.out.println(word.substring(0, half)+center+word.substring(half));
		
		
	}

}
