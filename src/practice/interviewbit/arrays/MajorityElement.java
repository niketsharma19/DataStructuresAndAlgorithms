package practice.interviewbit.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(2, 1, 2);
		System.out.println(majorityElement(A));
	}

	private static int majorityElement(final List<Integer> A) {
		int maxCount = 0;
		int maxVal = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int val : A) {
			if (!map.containsKey(val)) {
				map.put(val, 0);
			}
			Integer count = map.get(val);
			count++;
			map.replace(val, count);
			if (maxCount < count) {
				maxCount = count;
				maxVal = val;
			}
		}
		return maxVal;
	}

}
