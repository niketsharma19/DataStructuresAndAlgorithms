package practice.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

	private static Map<Integer, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		int num = 35;
		Long start = System.nanoTime();
		System.out.println(withOutDynamicProgramming(num));
		System.out.println("Without Dynamic Programming : " + (System.nanoTime() - start) / 1000);
		start = System.nanoTime();
		System.out.println(withDynamicProgramming(num));
		System.out.println("With Dynamic Programming : " + (System.nanoTime() - start) / 1000);
	}

	private static int withDynamicProgramming(int num) {
		if (map.containsKey(num)) {
			return map.get(num);
		}
		if (num < 3) {
			return 1;
		}
		int first = withDynamicProgramming(num - 1);
		map.put(num - 1, first);
		int second = withDynamicProgramming(num - 2);
		map.put(num - 2, second);
		return first + second;
	}

	private static int withOutDynamicProgramming(int num) {
//		System.out.println("Called with : " + num);
		if (num < 3) {
			return 1;
		}
		return withOutDynamicProgramming(num - 1) + withOutDynamicProgramming(num - 2);
	}

//	private static int fib(int num) {
//		if (num < 3) {
//			return 1;
//		}
//		return fib(num - 1) + fib(num - 2);
//	}

}
