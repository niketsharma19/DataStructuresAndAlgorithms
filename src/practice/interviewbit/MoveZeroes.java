package practice.interviewbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeroes {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(0, 1, 0, 3, 12);
		int[] arr = new int[A.size()];
		for (int i = 0; i < A.size(); i++) {
			arr[i] = A.get(i);
		}

		int indexOfLastZero = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				indexOfLastZero = i;
				break;
			}
		}
		if (indexOfLastZero == -1) {
			return;
		}

		int index = indexOfLastZero + 1;
		while (index < arr.length && indexOfLastZero < arr.length) {
			if (arr[index] != 0) {
				arr[indexOfLastZero] = arr[index];
				arr[index] = 0;
				indexOfLastZero++;
			}
			index++;
		}

		ArrayList<Integer> ans = new ArrayList<>();
		for (int i : arr) {
			ans.add(i);
		}
		return;
	}

}
