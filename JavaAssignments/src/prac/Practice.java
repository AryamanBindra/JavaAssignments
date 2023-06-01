package prac;

import java.util.HashSet;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ("$$$$","yes") -> $$yes$$
		
//		
//		String str1 = "$$$$";
//		String str2 = "yes";
//		int str1Len = str1.length();
//		System.out.println(str1.substring(0, str1Len/2)+str2+str1.substring(str1Len/2, str1Len));
		
		// duplicate entry
		
		String name[] = {"java", "c++", "c", "java"}; 
		
		HashSet<String> set = new HashSet<>();
		for(String str:name) {
			if(set.add(str)==false)
				System.out.println("Duplicate is: "+str);
		}
		
	}

}
