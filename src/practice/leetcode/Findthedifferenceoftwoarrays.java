package practice.leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Findthedifferenceoftwoarrays {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 3 };
		int[] nums2 = { 1, 1, 2, 2 };
		System.out.println(findDifference(nums1, nums2));
	}

	private static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		List<List<Integer>> ret = new LinkedList<>();
		Set<Integer> set1 = new HashSet<>();
		for (int num : nums2) {
			set1.add(num);
		}
		LinkedList<Integer> f = new LinkedList<>();
		ret.add(f);
		Set<Integer> set2 = new HashSet<>();
		for (int num : nums1) {
			if (!set1.contains(num) && !f.contains(num)) {
				f.add(num);
			}
			set2.add(num);
		}
		LinkedList<Integer> e = new LinkedList<>();
		ret.add(e);
		for (int num : nums2) {
			if (!set2.contains(num) && !e.contains(num)) {
				e.add(num);
			}
		}
		return ret;
	}
}