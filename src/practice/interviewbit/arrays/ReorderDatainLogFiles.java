package practice.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReorderDatainLogFiles {

	public static void main(String[] args) {
		List<String> A = Arrays.asList("dig1-8-1-5-1", "let1-art-can", "dig2-3-6", "let2-own-kit-dig", "let3-art-zero");
		ArrayList<String> ans = new ArrayList<>();
		ArrayList<String> digit = new ArrayList<>();
		for (String str : A) {
			if (String.valueOf(str.charAt(str.indexOf("-") + 1)).matches("\\d")) {
				digit.add(str);
			} else {
				ans.add(str);
			}
		}
		Collections.sort(ans, (x, y) -> {
			int res = x.substring(x.indexOf("-") + 1).compareTo(y.substring(y.indexOf("-") + 1));
			return res == 0 ? x.substring(0, x.indexOf("-") + 1).compareTo(y.substring(0, x.indexOf("-") + 1)) : res;
		});
		for (String str : digit) {
			ans.add(str);
		}
		return;
	}
}
