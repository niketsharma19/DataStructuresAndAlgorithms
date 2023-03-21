package practice.leetcode;

public class NumberofZeroFilledSubarrays {

	public static void main(String[] args) {
		int[] nums = { 0,0,0,2,0,0 };
		System.out.println(zeroFilledSubarray(nums));
	}

	private static long zeroFilledSubarray(int[] nums) {
		long ans = 0;
		long val = 0;
		for (int num : nums) {
			if (num == 0) {
				val++;
			} else if (val != 0) {
				ans = ans + val*(val +1)/2;
				val = 0;
			}
		}
		if (val != 0) {
			ans = ans + val*(val +1)/2;
		}
		return ans;
	}

}
