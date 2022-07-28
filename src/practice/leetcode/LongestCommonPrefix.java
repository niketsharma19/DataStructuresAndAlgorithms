package practice.leetcode;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = { "ac", "ac", "a", "a" };
		if (strs.length == 1) {
			System.out.println(strs[0]);
			return;
		}
		String common = "";
		String first = strs[0];
		String second = strs[1];
		int len = first.length() > second.length() ? second.length() : first.length();
		StringBuilder firstCommon = new StringBuilder();
		for (int i = 0; i < len; i++) {
			if (first.charAt(i) == second.charAt(i)) {
				firstCommon.append(first.charAt(i));
			} else {
				break;
			}
		}
		common = firstCommon.toString();
		if (common == "") {
			System.out.println("");
			return;
		}
		// flow
		for (int i = 2; i < strs.length; i++) {
			if(common.length() > strs[i].length()) {
				common = common.substring(0, strs[i].length());
			}
			for (int j = 0; j < common.length(); j++) {
				if (strs[i].charAt(j) != common.charAt(j)) {
					common = common.substring(0, j);
					break;
				}
			}
		}
		System.out.println(common);
	}

}
