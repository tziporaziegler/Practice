package stack;

import java.util.Stack;

public class BalancedParentheses {

	public static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<Character>();

		for (char c : str.toCharArray()) {
			if (c == '[' || c == '(' || c == '{') {
				stack.push(c);
			}
			else if (c == ']') {
				if (stack.isEmpty() || stack.pop() != '[') {
					return false;
				}
			}
			else if (c == ')') {
				if (stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
			}
			else if (c == '}') {
				if (stack.isEmpty() || stack.pop() != '{') {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}
}
