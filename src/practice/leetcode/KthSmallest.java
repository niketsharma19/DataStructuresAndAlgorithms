package practice.leetcode;

public class KthSmallest {

	public static void main(String[] args) {
		int[][] matrix = { { -5 } };
		System.out.println(kthSmallest(matrix, 1));
	}

	public static int kthSmallest(int[][] matrix, int k) {
		int len = matrix.length;
//		List<Integer> list = new ArrayList<>();
		int[] arr = new int[len];
		for (int i = 0; i < len * len; i++) {
			int small = Integer.MAX_VALUE;
			int index = -1;
			for (int j = 0; j < len; j++) {
				if (arr[j] < len && small > matrix[j][arr[j]]) {
					index = j;
					small = matrix[j][arr[j]];
				}
			}
			if (i == k - 1) {
				return matrix[index][arr[index]];
			}
			arr[index]++;
		}
		return -1;
	}

}
