package practice.interviewbit.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetIntersection {

	public static void main(String[] args) {
		List<List<Integer>> A = Arrays.asList(Arrays.asList(11, 14), Arrays.asList(2, 10), Arrays.asList(13, 15),
				Arrays.asList(4, 6), Arrays.asList(7, 20), Arrays.asList(8, 20), Arrays.asList(6, 12),
				Arrays.asList(3, 19), Arrays.asList(12, 14));
		Collections.sort(A, (x, y) -> {
			return x.get(1).compareTo(y.get(1));
		});
		SortedSet<Integer> set = new TreeSet<>();
		set.add(A.get(0).get(1));
		set.add(A.get(0).get(1) - 1);
		for (int i = 1; i < A.size(); i++) {
			int match = 0;
			if (set.last() > A.get(i).get(0)) {
				match = 2;
			} else if (set.last() == A.get(i).get(0)) {
				match = 1;
			} else {
				match = 0;
			}
			if (match < 2) {
				int index = A.get(i).get(1);
				while (match < 2) {
					set.add(index);
					match++;
					index--;
				}
			}
		}
		return;
	}

}
