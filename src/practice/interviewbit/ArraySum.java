package practice.interviewbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySum {

	public static void main(String[] args) {

		List<Integer> A = Arrays.asList(4, 3, 6, 7, 9, 9, 1, 7, 8);
		List<Integer> B = Arrays.asList(7, 5, 8, 9);

		int[] arr = new int[Math.max(A.size(), B.size()) + 1];
		int aIndex = A.size() - 1;
		int bIndex = B.size() - 1;
		int index = arr.length - 1;
		int carry = 0;
		while (aIndex >= 0 || bIndex >= 0) {
			int val = carry + (aIndex > -1 ? A.get(aIndex) : 0) + (bIndex > -1 ? B.get(bIndex) : 0);
			carry = val / 10;
			if (carry != 0) {
				val = val % 10;
			}
			arr[index] = val;
			index--;
			aIndex--;
			bIndex--;
		}
		arr[0] = carry;

		boolean isAdded = false;
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i : arr) {
			if (i == 0 && isAdded) {
				ans.add(i);
			} else if (i != 0) {
				ans.add(i);
				isAdded = true;
			}
		}
		return;

	}
}
