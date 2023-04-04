package practice.leetcode;

import java.util.HashSet;
import java.util.Set;

public class OptimalPartitionofString {

	public static void main(String[] args) {
		System.out.println(partitionString("abacaba"));
	}

	private static int partitionString(String s) {
		int res = 1;
		char[] arr = s.toCharArray();
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i])) {
				res++;
				set.clear();
				set.add(arr[i]);
			} else {
				set.add(arr[i]);
			}
		}
		return res;
	}

}
