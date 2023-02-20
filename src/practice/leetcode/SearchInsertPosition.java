package practice.leetcode;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6 };
		System.out.println(searchInsert(nums, 7));
	}

	private static int searchInsert(int[] nums, int target) {
		return binarySearch(nums, target, 0, nums.length-1);
	}

	private static int binarySearch(int[] nums, int target, int start, int end) {
		if(start > end) {
			return start;
		}
		int mid = start + ((end + 1 - start) / 2);
		if(nums[mid] == target) {
			return mid;
		} else if(nums[mid] > target) {
			return binarySearch(nums, target, start, mid-1);
		} else {
			return binarySearch(nums, target, mid+1, end);
		}
	}

}
