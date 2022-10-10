package practice.leetcode;

public class SearchInRortatedSortedArray {

	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 3;
		System.out.println(search(nums, target));
	}

	private static int search(int[] nums, int target) {
		return binarySearch(nums, target, 0, nums.length - 1);
	}

	private static int binarySearch(int[] nums, int target, int start, int end) {
		int mid = (start + end) / 2;
		if (nums[mid] == target) {
			return mid;
		}
		if (end <= start) {
			return -1;
		}
		// Check if Left Array is sorted
		if (nums[start] <= nums[mid]) {
			if (nums[start] <= target && nums[mid] >= target) {
				return binarySearch(nums, target, start, mid - 1);
			} else {
				return binarySearch(nums, target, mid + 1, end);
			}
		} else {
			if (nums[end] >= target && nums[mid] <= target) {
				return binarySearch(nums, target, mid + 1, end);
			} else {
				return binarySearch(nums, target, start, mid - 1);
			}
		}
	}

}
