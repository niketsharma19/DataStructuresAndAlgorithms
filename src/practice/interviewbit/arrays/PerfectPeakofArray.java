package practice.interviewbit.arrays;

import java.util.Arrays;
import java.util.List;

public class PerfectPeakofArray {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(5, 1, 4, 3, 6, 8, 10, 7, 9);
		int[] leftmax = new int[A.size()];
		int[] rightMin = new int[A.size()];
		int lm = A.get(0);
		for (int i = 1; i < A.size(); i++) {
			if (lm < A.get(i-1)) {
				lm = A.get(i-1);
			}
			leftmax[i] = lm;
		}
		int sm = A.get(A.size() - 1);
		for (int i = A.size() - 2; i >= 0; i--) {
			if (sm > A.get(i + 1)) {
				sm = A.get(i + 1);
			}
			rightMin[i] = sm;
		}
		for (int i = 1; i < A.size() - 1; i++) {
			if (A.get(i) > leftmax[i] && A.get(i) < rightMin[i]) {
				System.out.println(1);
				break;
			}
		}
		System.out.println(0);
	}

}
