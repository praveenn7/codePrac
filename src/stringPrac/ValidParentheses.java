package stringPrac;

import java.util.Stack;

public class ValidParentheses {

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray()) {
			// Push opening brackets onto stack
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				// Check for matching opening bracket
				if (stack.isEmpty())
					return false;

				char top = stack.peek();
				if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
					return false;
				}

				stack.pop();
			}
		}

		// Stack should be empty if all brackets matched
		return stack.isEmpty();
	}

	public static void main(String[] args) {

		System.out.println(isValid("{[()]}"));
		System.out.println(isValid("{[()}]"));

	}

}
