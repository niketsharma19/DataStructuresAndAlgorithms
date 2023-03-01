package practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV"));
	}

	public static int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int len = s.length();
		int result = 0;
		for (int i = 0; i < len; i++) {
			char first = s.charAt(i);
			if (i < len - 1 && map.get(first) < map.get(s.charAt(i + 1))) {
				char second = s.charAt(i + 1);
				result = result + map.get(second) - map.get(first);
				i++;
			} else {
				result = result + map.get(first);
			}
		}
		return result;
	}

}
