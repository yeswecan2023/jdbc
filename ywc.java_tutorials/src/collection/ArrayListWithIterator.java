package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWithIterator {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Hi");
		arr.add("test");
		Iterator itr = arr.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
