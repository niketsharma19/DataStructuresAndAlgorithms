package practice.interviewbit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MakeEqualElementsArray {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(2, 3, 1);
		int B = 2;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : A) {
			int[] arr = new int[3];
			arr[0] = i - B;
			arr[1] = i;
			arr[2] = i + B;
			for (Integer a : arr) {
				if (map.containsKey(a)) {
					int val = map.get(a) + 1;
					map.put(a, val);
				} else {
					map.put(a, 1);
				}
			}
		}
		int ans = map.values().stream().anyMatch((x) -> x == A.size()) ? 1 : 0;
		System.out.println(ans);

		// Most Optimal Solution

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < A.size(); i++) {
			min = Math.min(min, A.get(i));
		}
		int number = min + B;
		for (int i = 0; i < A.size(); i++) {
			if (!(A.get(i) == number || A.get(i) + B == number || A.get(i) - B == number)) {
				return;// 0
			}
		}
		return; // 1
	}

}
