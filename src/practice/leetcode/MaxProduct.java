package practice.leetcode;

public class MaxProduct {

	public static void main(String[] args) {
		int[] nums = { 3, -1, 4 };
		System.out.println(maxProduct(nums));
	}

	public static int maxProduct(int[] nums) {
		int highest = Integer.MIN_VALUE;
		int currentProduct = 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				currentProduct = 1;
				if (highest < 0) {
					currentProduct = 0;
				}
			} else if (nums[i] < 0) {
				currentProduct = currentProduct * nums[i];
			} else {
				currentProduct = currentProduct * nums[i];
			}
			if (currentProduct > highest) {
				highest = currentProduct;
				if (currentProduct == 0) {
					currentProduct = 1;
				}
			}
		}
		return highest;
	}

}
