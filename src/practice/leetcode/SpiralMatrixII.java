package practice.leetcode;

import java.util.Arrays;

public class SpiralMatrixII {

	public static void main(String[] args) {
		Arrays.asList(generateMatrix(4)).stream().forEach(x -> {
			for (int num : x) {
				System.out.println(num);
			}
		});
	}

	private static int[][] generateMatrix(int n) {
		int[][] ret = new int[n][n];
		int val = 0;
		int columnBegin = 0;
		int rowBegin = 0;
		int columnEnd = n - 1;
		int rowEnd = n - 1;
		while (rowBegin <= rowEnd && columnBegin <= columnEnd) {
			for (int i = columnBegin; i <= columnEnd; i++) {
				val++;
				ret[rowBegin][i] = val;
			}
			rowBegin++;
			for (int i = rowBegin; i <= rowEnd; i++) {
				val++;
				ret[i][columnEnd] = val;
			}
			columnEnd--;
			if (rowBegin <= rowEnd) {
				for (int i = columnEnd; i >= columnBegin; i--) {
					val++;
					ret[rowEnd][i] = val;
				}
			}
			rowEnd--;
			if (columnBegin <= columnEnd) {
				for (int i = rowEnd; i >= rowBegin; i--) {
					val++;
					ret[i][columnBegin] = val;
				}
			}
			columnBegin++;
		}
		return ret;
	}

}
