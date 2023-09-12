package practice.interviewbit.arrays;

import java.util.ArrayList;

public class MinStepsinInfiniteGrid {
	public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
		int steps = 0;
		for (int i = 0; i < A.size() - 1; i++) {
			int x = Math.abs(A.get(i) - A.get(i + 1));
			int y = Math.abs(B.get(i) - B.get(i + 1));
			steps = steps + Math.abs(x - y) + Math.min(x, y);
		}
		return steps;
	}
}
