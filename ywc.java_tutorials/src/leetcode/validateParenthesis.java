package leetcode;

import java.util.Stack;

public class validateParenthesis {

	public static void main(String[] args) {
		String s = "[[]]";
		Stack<Character> st = new Stack<Character>();
		for (int i=0; i < s.length(); i++) {
			char ch = s.charAt(i);
			System.out.println(" ch "+ch);
			if(ch == '{' || ch == '(' || ch == '[') {
				System.out.println(" st "+st);
				st.push(ch);
				System.out.println(" st -- "+st);
			} else {
				if(st.isEmpty()) {
					continue;
				} else if (ch == '}') {
					if(st.peek() == '{') {
						st.pop();
						continue;
					} else if(st.peek() == '(') {
						st.pop();
						continue;
					} else if(st.peek() == '[') {
						st.pop();
						continue;
					}
				}
			}
		}
		//System.out.println(st);
		if(st.size() == 0 ) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}

	}

}
