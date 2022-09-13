package practice.leetcode;

public class BinarySearch2 {

	public static void main(String[] args) {
		int[] nums = { -1, 0, 3, 5, 9, 12 };
		int target = 12;
		System.out.println(search(nums, target));
	}

	private static int search(int[] nums, int target) {
		return searchRecursion(nums, target, 0, nums.length - 1);
	}

	private static int searchRecursion(int[] nums, int target, int start, int end) {
		if (end < start) {
			return -1;
		}
		int mid = (end - start + 1) / 2 + start;
		if (nums[mid] == target) {
			return mid;
		} else if (nums[mid] > target) {
			return searchRecursion(nums, target, start, mid - 1);
		} else {
			return searchRecursion(nums, target, mid + 1, end);
		}
	}

}
