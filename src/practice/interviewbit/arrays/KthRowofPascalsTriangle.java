package practice.interviewbit.arrays;

import java.util.ArrayList;

public class KthRowofPascalsTriangle {

	public static void main(String[] args) {
		int A = 6;
		int[] last = { 1 };
		for (int i = 1; i <= A; i++) {
			int[] arr = new int[i + 1];
			arr[0] = 1;
			arr[i] = 1;
			for (int j = 1; j < (arr.length + 1) / 2; j++) {
				arr[j] = last[j - 1] + last[j];
				arr[arr.length - 1 - j] = arr[j];
			}
			last = arr;
		}
		int[] arr = last;
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i : arr) {
			ans.add(i);
		}
		return;

	}

}
