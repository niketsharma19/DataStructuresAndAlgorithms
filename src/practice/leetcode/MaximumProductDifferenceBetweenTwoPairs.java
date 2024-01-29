package practice.leetcode;

class MaximumProductDifferenceBetweenTwoPairs {

	public static void main(String[] args) {
		int[] nums = { 1, 6, 7, 5, 2, 4, 10, 6, 4 };
		System.out.println(maxProductDifference(nums));
	}

	private static int maxProductDifference(int[] nums) {
		int biggest = 0;
		int secondBiggest = 0;
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int num : nums) {
			if (num > biggest) {
				secondBiggest = biggest;
				biggest = num;
			} else {
				secondBiggest = Math.max(secondBiggest, num);
			}

			if (num < smallest) {
				secondSmallest = smallest;
				smallest = num;
			} else {
				secondSmallest = Math.min(secondSmallest, num);
			}
		}
		return biggest * secondBiggest - smallest * secondSmallest;
	}
}