package leetcode;

import java.util.Stack;

public class validateParenthesis {

    public static void main(String[] args) {
    	String s = "[]";
    	Stack<Character> st = new Stack<>();
    	for (int i = 0; i < s.length(); i++) {
    		char ch = s.charAt(i);
    		
    		if (ch == '{' || ch == '(' || ch == '[') {
    			st.push(ch);
    		} else if (ch == '}' || ch == ')' || ch == ']') {
    			if (st.isEmpty()) {
    				System.out.println("Invalid Sting");
    				return;
    			}
    			
    			char top = st.peek();
    			
    			if ((ch == '}' && top == '{' ) ||
    				(ch == ')' && top == '(') ||
    				(ch == ']' && top == '[')) {
    				st.pop();
    			} else {
    				System.out.println("Invalid String");
    				return;
    			}
    		}
    	}
    	System.out.println(st.isEmpty() ? "valid" : "Invalid");
    }
}
