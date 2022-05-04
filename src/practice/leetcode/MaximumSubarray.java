package practice.leetcode;

public class MaximumSubarray {

	public static void main(String[] args) {
		int[] nums = { 5, 4, -1, 7, 8 };
		// Kadane's Algorithm - O(n) Iterate over the array and sum the values, whenever
		// we n=get negative sum then it is sure that this will only decrease the whole
		// value thus neglect that sub array and again start to sum from 0 for remaining
		// values.
		int maxSum = Integer.MIN_VALUE;
		int currentSum = 0;
		for (int num : nums) {
			currentSum += num;
			if (currentSum > maxSum) {
				maxSum = currentSum;
			}
			if (currentSum < 0) {
				currentSum = 0;
			}
		}
		System.out.println(maxSum);
	}

}
