package practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

	public static void main(String[] args) {
		String s = "paper";
		String t = "title";
		System.out.println(isIsomorphic(s, t));
	}

	private static boolean isIsomorphic(String s, String t) {
		Map<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				if (map.get(s.charAt(i)) != t.charAt(i)) {
					return false;
				}
			} else if (map.containsKey(t.charAt(i))) {
				if (map.get(t.charAt(i)) != s.charAt(i)) {
					return false;
				}
			} else {
				map.put(s.charAt(i), t.charAt(i));
			}
		}
		return true;
	}

//	private static boolean isIsomorphic(String s, String t) {
//		char[] sCharArray = s.toCharArray();
//		char[] tCharArray = t.toCharArray();
//		int[] sArray = new int[26];
//		int[] tArray = new int[26];
//		for (int i = 0; i < sCharArray.length; i++) {
//			sArray[sCharArray[i] - 97]++;
//			tArray[tCharArray[i] - 97]++;
//		}
//		Map<Integer, Integer> map = new HashMap<>();
//		for (int i = 0; i < 26; i++) {
//			if (map.containsKey(sArray[i])) {
//				map.replace(sArray[i], map.get(sArray[i]) + 1);
//			} else {
//				map.put(sArray[i], 1);
//			}
//			if (map.containsKey(tArray[i])) {
//				map.replace(tArray[i], map.get(tArray[i]) - 1);
//			} else {
//				map.put(tArray[i], -1);
//			}
//		}
//		for(int num: map.values()) {
//			if(num != 0) {
//				return false;
//			}
//		}
//		return true;
//	}

}
