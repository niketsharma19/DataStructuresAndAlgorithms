package practice.leetcode;

class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 1, 1, 1, 1, 1 };
		int target = 11;
		System.out.println(minSubArrayLen(target, nums));
	}

	private static int minSubArrayLen(int target, int[] nums) {
		int min = Integer.MAX_VALUE;
		int i = 0;
		int j = 1;
		int sum = nums[i];
		while (i <= j) {
			if (sum >= target) {
				if (i >= nums.length) {
					break;
				}
				sum = sum - nums[i];
				if (min > (j - i)) {
					min = j - i;
				}
				i++;
			} else {
				if (j >= nums.length) {
					break;
				}
				sum = sum + nums[j];
				j++;
			}
		}
		return min == Integer.MAX_VALUE ? 0 : min;
	}
}