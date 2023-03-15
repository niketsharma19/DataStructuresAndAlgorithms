package practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {

	public static void main(String[] args) {
		int n= 50;
		Long start = System.nanoTime();
		System.out.println(climbStairs(n));
		System.out.println("Without Dynamic Programming : " + (System.nanoTime() - start) / 1000);
		start = System.nanoTime();
		System.out.println(climbStairsUsingHashMap(n));
		System.out.println("With Dynamic Programming : " + (System.nanoTime() - start) / 1000);
	}

	private static int climbStairs(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		}
		return (climbStairs(n - 1) + climbStairs(n - 2));
	}

	private static int climbStairsUsingHashMap(int n) {
		Map<Integer, Integer> map = new HashMap<>();
		return recMethod(n, map);
	}

	private static int recMethod(int n, Map<Integer, Integer> map) {
		if (map.containsKey(n)) {
			return map.get(n);
		}
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		}
		int recCall1 = recMethod(n - 1, map);
		if (!map.containsKey(n - 1)) {
			map.put(n - 1, recCall1);
		}
		int recCall2 = recMethod(n - 2, map);
		if (!map.containsKey(n - 2)) {
			map.put(n - 2, recCall2);
		}
		return (recCall1 + recCall2);
	}

}
