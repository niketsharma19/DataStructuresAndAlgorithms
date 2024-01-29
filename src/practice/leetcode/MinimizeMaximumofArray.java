package practice.leetcode;

public class MinimizeMaximumofArray {

	public static void main(String[] args) {
		int[] nums = { 3, 7, 1, 6 };
		System.out.println(minimizeArrayValue(nums));
	}

	private static int minimizeArrayValue(int[] nums) {
		int max = findMax(nums);
		int maxValue = nums[max];
		while(true) {
			doOp(nums, max);
			int newMax = findMax(nums);
			if(maxValue <= nums[newMax]) {
				return nums[max];
			} else {
				maxValue = nums[newMax];
				max = newMax;
			}
		}
	}

	private static int findMax(int[] nums) {
		int max = Integer.MIN_VALUE;
		int maxIndex = -1;
		for (int i = 0; i < nums.length; i++) {
			if(max < nums[i]) {
				max = nums[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	private static void doOp(int[] nums, int i) {
		if(i >= 1) {
			nums[i]--;
			nums[i - 1]++;
		}
	}
}
