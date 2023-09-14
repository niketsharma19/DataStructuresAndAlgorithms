package practice.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WaveArray {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(5, 1, 3, 2, 4);
		Collections.sort(A);
		int[] arr = new int[A.size()];
		for (int i = 0; i < A.size(); i++) {
			arr[i] = A.get(i);
		}
		for (int i = 0; i < A.size() - 1; i = i + 2) {
			int first = arr[i];
			int second = arr[i + 1];
			arr[i] = second;
			arr[i + 1] = first;
		}
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i : arr) {
			ans.add(i);
		}
		return;
	}

}
