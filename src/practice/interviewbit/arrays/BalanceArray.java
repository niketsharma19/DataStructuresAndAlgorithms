package practice.interviewbit.arrays;

import java.util.Arrays;
import java.util.List;

public class BalanceArray {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(5, 5, 2, 5, 8);
		int ans = 0;
		int even = 0;
		int odd = 0;
		for (int i = 0; i < A.size(); i++) {
			if (i % 2 == 0) {
				even += A.get(i);
			} else {
				odd += A.get(i);
			}
		}
		int newEven = 0;
		int newOdd = 0;
		for (int i = 0; i < A.size(); i++) {
			if (i % 2 == 0) {
				even = even - A.get(i);
				if ((even + newOdd) == (newEven + odd)) {
					ans++;
				}
				newEven = newEven + A.get(i);
			} else {
				odd = odd - A.get(i);
				if ((even + newOdd) == (newEven + odd)) {
					ans++;
				}
				newOdd = newOdd + A.get(i);
			}
		}
		return;
	}

}
