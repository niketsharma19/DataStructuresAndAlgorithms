package practice.leetcode;

public class FindtheIndexoftheFirstOccurrenceinaString {

	public static void main(String[] args) {
		System.out.println(strStr("mississippi", "issipi"));
	}

	private static int strStr(String haystack, String needle) {
		if (haystack.length() < needle.length()) {
			return -1;
		}
		char[] hayStackArr = haystack.toCharArray();
		int index = 0;
		int start = -1;
		for (int i = 0; i < hayStackArr.length; i++) {
			if (hayStackArr[i] == needle.charAt(index)) {
				if (index == 0) {
					start = i;
				}
				index++;
				if (index >= needle.length()) {
					return start;
				}
			} else if (index != 0) {
				index = 0;
				i = start;
				start = -1;
			}
		}
		return index >= needle.length() ? start : -1;
	}

}
