package practice.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateMatrix {

	public static void main(String[] args) {
		List<List<Integer>> matrix = Arrays.asList(Arrays.asList(1, 2, 3, 4), Arrays.asList(5, 6, 7, 8),
				Arrays.asList(9, 10, 11, 12), Arrays.asList(13, 14, 15, 16));
		newArray(matrix);
		inPlace(matrix);
	}

	private static void inPlace(List<List<Integer>> A) {
		for (int i = 0; i < A.size(); i++) {
			for (int j = i; j < A.size(); j++) {
				if (i != j) {
					int temp = A.get(i).get(j);
					A.get(i).set(j, A.get(j).get(i));
					A.get(j).set(i, temp);
				}
			}
		}
		for (int i = 0; i < A.size() / 2; i++) {
			for (int j = 0; j < A.size(); j++) {
				int temp = A.get(j).get(i);
				A.get(j).set(i, A.get(j).get(A.size() - 1 - i));
				A.get(j).set(A.size() - 1 - i, temp);
			}
		}
		return;
	}

	private static void newArray(List<List<Integer>> matrix) {
		List<List<Integer>> ans = new ArrayList<>();
		for (Object o : matrix) {
			ans.add(new ArrayList<>());
		}
		for (int i = 0; i < matrix.size(); i++) {
			for (int j = 0; j < matrix.size(); j++) {
				ans.get(j).add(0, matrix.get(i).get(j));
			}
		}
		System.out.println(ans);
	}

}
