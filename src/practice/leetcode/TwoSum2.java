package practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 4 };
		int[] ans = twoSum(nums, 6);
		for (int a : ans) {
			System.out.println(a);
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				int[] ans = { i, map.get(nums[i]) };
				return ans;
			} else {
				map.put(target - nums[i], i);
			}
		}
		return nums;
	}

}
