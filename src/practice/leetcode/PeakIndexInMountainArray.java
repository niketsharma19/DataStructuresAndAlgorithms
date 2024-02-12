package practice.leetcode;

class PeakIndexInMountainArray {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 1 };
		new PeakIndexInMountainArray().peakIndexInMountainArray(arr);
	}

	public int peakIndexInMountainArray(int[] arr) {
		int low = 0;
		int high = arr.length - 1;

		while (high > low) {
			int mid = (high - low) / 2 + low;

			if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
				return mid;
			}

			if (arr[mid] < arr[mid - 1]) {
				high = mid;
			}
			if (arr[mid] > arr[mid - 1]) {
				low = mid;
			}
		}
		return -1;
	}
}