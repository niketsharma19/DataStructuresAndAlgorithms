package practice.interviewbit.arrays;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {
	public ArrayList<Integer> maxset(ArrayList<Integer> A) {
		int startIndex = 0;
		int[] maxIndex = new int[2];
		maxIndex[0] = -1;
		maxIndex[1] = -1;
		long max = Integer.MIN_VALUE;
		long currentMax = 0;
		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) < 0) {
				if (max < currentMax) {
					max = currentMax;
					maxIndex[0] = startIndex;
					maxIndex[1] = i - 1;
				}
				currentMax = 0;
				startIndex = i + 1;
			} else {
				currentMax = currentMax + A.get(i);
				if (max < currentMax && i == A.size() - 1) {
					max = currentMax;
					maxIndex[0] = startIndex;
					maxIndex[1] = i;
					currentMax = 0;
				}
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		if (maxIndex[0] >= 0 && maxIndex[1] >= 0) {
			for (int i = maxIndex[0]; i <= maxIndex[1]; i++) {
				ans.add(A.get(i));
			}
		}
		return ans;
	}
}
