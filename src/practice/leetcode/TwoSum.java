package practice.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 0, 3, -3, 4, -1 };
		int target = -1;
		int[] res = twoSum(nums, target);
		for (int r : res) {
			System.out.println(r);
		}
	}

	private static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(target-nums[i])) {
				result[0] = map.get(target-nums[i]);
				result[1] = i;
				return result;
			}
			map.put(nums[i], i);
		}
		return result;
	}

	private static int[] twoSumMy(int[] nums, int target) {
		boolean halfAlert = false;
		if (target % 2 == 0) {
			int half = target / 2;
			int[] res = new int[2];
			int index = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == half) {
					res[index] = i;
					index++;
				}
			}
			if (index == 2) {
				return res;
			} else {
				halfAlert = true;
			}
		}

		Set<Integer> set = new HashSet<>();
		Integer[] numsNew = new Integer[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (set.add(nums[i])) {
				numsNew[i] = target - nums[i];
			}
		}
		int[] res = new int[2];
		int index = 0;
		for (int i = 0; i < numsNew.length; i++) {
			if (!set.add(numsNew[i]) && numsNew[i] != null) {
				if (!(halfAlert && numsNew[i] == target / 2)) {
					res[index] = i;
					index++;
				}
			}
		}
		return res;
	}

}
