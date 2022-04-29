package practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RegularExpressionMatching {

	public static void main(String[] args) {

		String s = "aba";
		String p = ".*";
		
		Map<Character, StringBuilder> map = new HashMap<>();
		for (int i = 0; i < p.length(); i++) {
//			char next = p.charAt(i+1);
			if(p.charAt(i) == '.') {
				map.put('.', new StringBuilder(s.charAt(i)));
			} else if (p.charAt(i) == '*') {
				map.put('*', new StringBuilder(s.substring(i)));
			} else {
				if(p.charAt(i) == s.charAt(i)) {
					map.put(p.charAt(i), new StringBuilder(s.charAt(i)));
				}
			}
		}
		
		System.out.println(map);
		
//		for (int i = 0; i < p.length() - 1; i++) {
//			if(p.charAt(i) == '.') {
//				
//			} else if (p.charAt(i) == '*') {
//				
//			} else {
//				
//			}
//		}
	}

}
