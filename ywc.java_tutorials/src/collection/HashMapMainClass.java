package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapMainClass {

	public static void main(String[] args) {
		Map<String, Integer> student = new HashMap<String, Integer>();
		student.put("vishnu",10);
		student.put("pri",15);
		student.put("new", 9);
		
		System.out.println(student.get("new"));
		System.out.println(student.keySet());
		
		
		for(String key : student.keySet()) {
			System.out.println(student.get(key));
		}

	}

}
