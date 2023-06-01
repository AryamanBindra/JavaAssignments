package typeCasting;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Session9 {
	public static void main(String[] args) {
		HashMap<String, Integer> student = new HashMap<>();
		
		student.put("rollNo", 1234);
		student.put("Sem", 3);
		
		for(Entry<String, Integer> entry: student.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("Key is: "+key+" Value is: "+value);
		}
		
		
	}
}
