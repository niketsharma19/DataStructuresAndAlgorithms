package practice.leetcode;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums) {
		int len = nums.length;
		int output = 0;
		for (int i = 0; i < len; i++) {
			if (i == 0 || nums[i] > nums[i - 1]) {
				nums[output] = nums[i];
				output++;
			}
		}
		return output;
	}

}
