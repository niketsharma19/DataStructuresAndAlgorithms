package practice.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

class SlidingWindowMaximum {

	public static void main(String[] args) {
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		for (int num : maxSlidingWindow(nums, 3))
			System.out.println(num);
	}

	// Solution -> https://leetcode.com/problems/sliding-window-maximum/solutions/65884/java-o-n-solution-using-deque-with-explanation/
	// Text Book Explanation -> https://leetcode.com/problems/sliding-window-maximum/description/comments/1566657
	private static int[] maxSlidingWindow(int[] nums, int k) {
		int len = nums.length;
		int[] ans = new int[len - k + 1];
		int index = 0;
		Deque<Integer> q = new ArrayDeque<>();
		for (int i = 0; i < len; i++) {

			while (!q.isEmpty() && q.peekFirst() < i - k + 1) {
				q.poll();
			}

			while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
				q.pollLast();
			}

			q.offerLast(i);
			if (i >= k - 1) {
				ans[index++] = nums[q.peek()];
			}
		}
		return ans;
	}
}