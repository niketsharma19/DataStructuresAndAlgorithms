package practice.interviewbit;

import java.util.Arrays;
import java.util.List;

public class MaximumAbsoluteDifference {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(19, 65, 42, 66, -44, 45, -42, 17, -52, -59);
		int max = 0;
		int min = 0;
		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) < A.get(min)) {
				min = i;
			}
			if (A.get(i) > A.get(max)) {
				max = i;
			}
		}
		int a = Math.abs(A.get(min) - A.get(max)) + Math.abs(min - max);
		int b = Math.abs(A.get(0) - A.get(A.size() - 1)) + Math.abs(1 - A.size());
		System.out.println(a > b ? a : b);
	}
}