package practice.leetcode;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

class ContainsDuplicateII {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1, 2, 3 };
		System.out.println(containsNearbyDuplicate(nums, 2));
	}

	private static boolean containsNearbyDuplicate(int[] nums, int k) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (i > k)
				set.remove(nums[i - k - 1]);
			if (!set.add(nums[i]))
				return true;
		}
		return false;
	}

	public boolean containsNearbyDuplicateNestedLoop(int[] nums, int k) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < k + i + 1; j++) {
				if (j >= nums.length) {
					break;
				}
				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean containsNearbyDuplicateQueue(int[] nums, int k) {
		if (k == 0) {
			return true;
		}
		Deque<Integer> queue = new LinkedList<>();
		for (int i = 0; i < nums.length; i++) {
			if (queue.contains(nums[i])) {
				return true;
			} else {
				if (queue.size() >= k) {
					queue.removeFirst();
				}
				queue.addLast(nums[i]);
			}
		}
		return false;
	}
}