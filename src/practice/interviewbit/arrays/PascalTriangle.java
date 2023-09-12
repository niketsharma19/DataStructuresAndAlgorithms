package practice.interviewbit.arrays;

import java.util.ArrayList;

public class PascalTriangle {

	public static void main(String[] args) {
		int A = 6;
		ArrayList<int[]> triangle = new ArrayList<>();
		int[] last = { 1 };
		triangle.add(last);
		for (int i = 1; i <= A; i++) {
			int[] arr = new int[i + 1];
			arr[0] = 1;
			arr[i] = 1;
			for (int j = 1; j < (arr.length + 1) / 2; j++) {
				arr[j] = last[j - 1] + last[j];
				arr[arr.length - 1 - j] = arr[j];
			}
			triangle.add(arr);
			last = arr;
		}
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		for (int[] a : triangle) {
			ArrayList<Integer> inner = new ArrayList<>();
			for (int i : a) {
				inner.add(i);
			}
			ans.add(inner);
		}
		return;
	}

}
