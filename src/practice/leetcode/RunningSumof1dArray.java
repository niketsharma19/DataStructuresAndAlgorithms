package practice.leetcode;

import java.util.Arrays;

public class RunningSumof1dArray {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		Arrays.stream(runningSum(nums)).forEach(val -> {
			System.out.println(val);
		});
	}
	
	private static int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }

}
