package collection;

import java.util.Stack;

public class stackMainClass {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();
		stk.add(1);
		stk.add(8);
		System.out.println(stk.peek());
		System.out.println(stk);
		stk.pop();
		System.out.println(stk);
	}

}
