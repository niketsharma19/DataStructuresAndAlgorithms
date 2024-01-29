package practice.leetcode;

public class IsSubsequence {

	public static void main(String[] args) {
		String s = "a";
		String t = "abc";
		System.out.println(isSubsequence(s, t));
	}

	private static boolean isSubsequence(String s, String t) {
		if(s.length() == 0) {
			return true;
		}
		int index = 0;
		for (char ch : t.toCharArray()) {
			if(index == s.length()) {
				return true;
			}
			if (ch == s.charAt(index)) {
				index++;
			}
		}
		if (index == s.length()) {
			return true;
		} else {
			return false;
		}
	}

}
