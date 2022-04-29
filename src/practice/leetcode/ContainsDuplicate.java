package practice.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		System.out.println(containsDuplicateSet(nums));
		System.out.println(containsDuplicateSort(nums));
	}

	// Time - O(n)
	// Space - O(n)
	private static boolean containsDuplicateSet(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			if (!set.add(num)) {
				return true;
			}
		}
		return false;
	}

	// Time - O(nLog(n))
	// Space - O(1)
	private static boolean containsDuplicateSort(int[] nums) {
		Arrays.sort(nums); // nlog(n)
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}
		return false;
	}

}
