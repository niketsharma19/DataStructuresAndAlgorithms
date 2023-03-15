package practice.leetcode;

public class FindPivotIndex {

	public static void main(String[] args) {
		int[] nums = {1,7,3,6,5,6};
		System.out.println(pivotIndex(nums));
	}
	
	private static int pivotIndex(int[] nums) {
        int sum = 0;
        for(int n : nums){
            sum = sum + n;
        }
        sum = sum - nums[0];
        if(sum == 0){
            return 0;
        }
        for(int i =1;i<nums.length;i++){
            sum = sum-nums[i];
            if(nums[i-1] == sum){
                return i;
            }else {
                nums[i] = nums[i-1] + nums[i];
            }
        }
        return -1;
    }

}
