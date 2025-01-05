package collection;

import java.util.LinkedList;

public class linkedListMainClass {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(8);
		ll.add(5);
		ll.add(10);
		System.out.println(ll.peek());
		System.out.println(ll);
		ll.pop();
		System.out.println(ll);
		ll.remove(1);
		System.out.println(ll);
	}

}
