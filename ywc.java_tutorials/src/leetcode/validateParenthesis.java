package leetcode;

import java.util.Stack;

public class validateParenthesis {

    public static void main(String[] args) {
    	String s = "asdfasdf"; // This should be considered valid

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '{' || ch == '(' || ch == '[') {
                st.push(ch);
            } else if (ch == '}' || ch == ')' || ch == ']') { 
                if (st.isEmpty()) {
                    System.out.println("Invalid445");
                    return;
                }

                char top = st.peek(); // Check the top element

                if ((ch == '}' && top == '{') ||
                    (ch == ')' && top == '(') ||
                    (ch == ']' && top == '[')) {
                    st.pop(); // Pop only if it's a valid match
                } else {
                    System.out.println("Invalid");
                    return;
                }
            } 
            // Else case: Ignore non-bracket characters
        }

        System.out.println(st.isEmpty() ? "Valid" : "Invalid");
    }
}
