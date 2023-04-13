package practice.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

class ValidateStackSequences {

	public static void main(String[] args) {
		int[] pushed = { 1, 0 };
		int[] popped = { 1, 0 };
		System.out.println(validateStackSequences(pushed, popped));
	}

	private static boolean validateStackSequences(int[] pushed, int[] popped) {
		Deque<Integer> stack = new ArrayDeque<>();
		int firstIndex = 1;
		stack.push(pushed[0]);
		int secondIndex = 0;
		while (firstIndex < pushed.length || secondIndex < popped.length) {
			if (stack.peek() != null && stack.peek() == popped[secondIndex]) {
				stack.pop();
				secondIndex++;
			} else if (firstIndex < pushed.length) {
				stack.push(pushed[firstIndex]);
				firstIndex++;
			} else {
				return false;
			}
		}
		return stack.isEmpty();
	}
}