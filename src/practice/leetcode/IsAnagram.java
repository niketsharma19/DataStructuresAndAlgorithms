package practice.leetcode;

public class IsAnagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("anagram", "nagaram"));
	}

	public static boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		int[] arr = new int[26];
		for (char ch : s.toCharArray()) {
			arr[ch - 97]++;
		}
		for (char ch : t.toCharArray()) {
			arr[ch - 97]--;
		}
		for (int i : arr) {
			if (i != 0) {
				return false;
			}
		}
		return true;
	}

}
