package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetMainClass {

	public static void main(String[] args) {
		Set<Integer> num = new TreeSet<Integer>();
		num.add(52);
		num.add(80);
		num.add(1);
		num.add(222);
		
		Iterator<Integer> values = num.iterator();
		while(values.hasNext()) {
			System.out.println(values.next());
		}
		System.out.println("-----------");
		for(Integer n : num) {
			System.out.println(n);
		}
	}

}
