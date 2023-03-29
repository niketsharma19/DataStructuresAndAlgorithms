package practice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		var result = generate(5);
		System.out.println(result);
	}

	private static List<List<Integer>> generate(int numRows) {
		var first = new ArrayList<Integer>();
		first.add(1);
		var second = new ArrayList<Integer>();
		second.add(1);
		second.add(1);
		List<List<Integer>> result = new ArrayList<>();
		if (numRows > 0) {
			result.add(first);
		}
		if (numRows > 1) {
			result.add(second);
		}
		for (int i = 3; i <= numRows; i++) {
			List<Integer> innerList = new ArrayList<>();
			innerList.add(1);
			var prevList = result.get(i - 2);
			for (int j = 1; j < i - 1; j++) {
				innerList.add(prevList.get(j - 1) + prevList.get(j));
			}
			innerList.add(1);
			result.add(innerList);
		}
		return result;
	}

}
