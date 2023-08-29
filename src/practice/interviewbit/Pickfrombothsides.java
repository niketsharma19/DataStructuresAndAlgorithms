package practice.interviewbit;

import java.util.ArrayList;

public class Pickfrombothsides {
	public int solve(ArrayList<Integer> A, int B) {
		int start = B;
		int end = A.size() - 1;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < B + 1; i++) {
			int sum = 0;
			for (int j = 0; j < start; j++) {
				sum = sum + A.get(j);
			}
			for (int j = A.size() - 1; j > end; j--) {
				sum = sum + A.get(j);
			}
			if (sum > max) {
				max = sum;
			}
			start--;
			end--;
		}
		return max;
	}
}
