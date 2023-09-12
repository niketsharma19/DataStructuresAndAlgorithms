package practice.interviewbit.arrays;

import java.util.ArrayList;
import java.util.TreeMap;

public class OccurenceofEachNumber {
	public ArrayList<Integer> findOccurences(ArrayList<Integer> A) {
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i : A) {
			if (map.containsKey(i)) {
				int val = map.get(i) + 1;
				map.put(i, val);
			} else {
				map.put(i, 1);
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		map.forEach((x, y) -> {
			ans.add(y);
		});
		return ans;
	}
}
