package practice.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindKthLargest {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 1, 5, 6, 4 };
		int k = 2;
		System.out.println(findKthLargest(nums, k));
	}

	private static int findKthLargest(int[] nums, int k) {
		Queue<Integer> q = new PriorityQueue<>((val1, val2) -> {
			return -val1.compareTo(val2);
		});
		q.addAll(Arrays.stream(nums).boxed().toList());
		int val = 0;
		for (int i = 0; i < k; i++) {
			val = q.poll();
		}
		return val;
	}

}
