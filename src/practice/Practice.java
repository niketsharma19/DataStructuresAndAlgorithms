package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 1, 1, 3 };
		System.out.println(new Practice().uniqueOccurrences(arr));
	}

	public boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int a : arr) {
			map.put(a, map.getOrDefault(a, 0)+1);
		}
		Set<Integer> set = new HashSet<>();
		for (int v : map.values()) {
			if (set.contains(v)) {
				return false;
			} else {
				set.add(v);
			}
		}
		return true;
	}

}
