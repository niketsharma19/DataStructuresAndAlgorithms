package practice.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sortarraywithsquares {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(-6, -3, -1, 2, 4, 5);

		ArrayList<Integer> neg = new ArrayList<>();
		ArrayList<Integer> pos = new ArrayList<>();
		int index = 0;
		while (A.get(index) < 0) {
			index++;
		}
		for (int i = index-1; i >= 0; i--) {
			neg.add(A.get(i) * A.get(i));
		}
		for (int i = index; i < A.size(); i++) {
			pos.add(A.get(i) * A.get(i));
		}
		ArrayList<Integer> ans = new ArrayList<>();
		int n = 0;
		int p = 0;
		while (n < neg.size() && p < pos.size()) {
			if (neg.get(n) > pos.get(p)) {
				ans.add(pos.get(p));
				p++;
			} else {
				ans.add(neg.get(n));
				n++;
			}
		}
		while (n < neg.size()) {
			ans.add(neg.get(n));
			n++;
		}
		while (p < pos.size()) {
			ans.add(pos.get(p));
			p++;
		}
		return;
	}

}
