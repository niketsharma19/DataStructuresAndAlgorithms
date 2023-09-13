package practice.interviewbit.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(472, 663, 964, 722, 485, 852, 635, 4, 368, 676, 319, 412);
		String[] arr = new String[a.size()];
		for (int i = 0; i < a.size(); i++) {
			arr[i] = String.valueOf(a.get(i));
		}

		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String a, String b) {
				return (b + a).compareTo(a + b);
			}
		});

		StringBuilder sb = new StringBuilder();
		for (String s : arr) {
			sb.append(s);
		}

		if (sb.charAt(0) == '0') { // check if all zeroes are there
			return;
		}

		return;
	}

}
