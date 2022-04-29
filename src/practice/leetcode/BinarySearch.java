package practice.leetcode;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = {-1,0,3,5,9,12};
		int target = 10;
		System.out.println(search(0, nums.length-1, nums, target));
	}
	
	private static int search(int start, int end, int[] nums, int target) {
		if(start > end) {
			return -1;
		}
		int middle = start + (end - start + 1)/2;
		if(nums[middle] == target) {
			return middle;
		} else if (nums[middle] > target) {
			return search(start, middle - 1, nums, target);
		} else {
			return search(middle + 1, end, nums, target);
		}
	}

}
