package practice.interviewbit.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaximumAreaofTriangle {

	public static void main(String[] args) {
		List<String> A = Arrays.asList("rbrrggggbbbrgrrbr", "bbrrgbrbrgbrrgbbg", "ggbrggrrgrrgbrrrg",
				"rrrbgggbbggrrbgbr", "bbggggrbrgggrrbgg", "rrrbbgbgrrbrrgrbg", "gbbbrgbggrgbbrbgg", "bgbgrgbrbrgbrgggr",
				"bgbggrrrbrrgbrgbb", "brbggbbrrbgbrrgrb", "ggbbgbbbgbrbbbgbg", "gbrrbgrbrbgrrrgbg", "bgbrbbgrgbgrrrbgr",
				"brrgggbbgrrbgrbbg", "bbbrrbbbrbggrrbbr", "rrrrbgrbgrrbbrbbr", "gbggggrrrbrbggbgg", "grbgbbgrggrrrgbbg",
				"grgggbggbrgrgrgrb", "ggrrgrbggbrbggrbr", "ggbbbrgrbgbrggrgb", "grgbggrbrrrgrbbbg", "bbrrbrrbgbrrggbgg",
				"rrgrrgbggbbbgbggr", "rgrbrbrbgrbrrrrgg", "rgrbrbgrgrggbbrgr", "brgrggrgrgbgrrggg", "grbggrrbbrrgrgbgg",
				"rgrbbrbrgggrgrrbg");
		int second = -1;
		int len = 0;
		char f = Character.MIN_VALUE;
		char s = Character.MIN_VALUE;
		char t = Character.MIN_VALUE;
		for (int i = A.size() - 1; i > 0; i--) {
			if (A.get(i).charAt(0) != f) {
				s = A.get(i).charAt(0);
				second = i;
				break;
			}
		}
		if (s == Character.MIN_VALUE) {
			System.out.println(0);
		}
		Set<Character> set = new HashSet<>();
		set.add('r');
		set.add('g');
		set.add('b');
		set.remove(f);
		set.remove(s);
		t = (char) set.toArray()[0];
		int area = second + 1;
		for (int i = 0; i < A.size(); i++) {
			for (int j = 1; j < A.get(i).length(); j++) {
				if (A.get(i).charAt(j) == t) {
					if ((second + 1) * (j + 1) > area) {
						area = (second + 1) * (j + 1);
					}
				}
			}
		}
		System.out.println(area / 2 + area % 2);
	}

}
