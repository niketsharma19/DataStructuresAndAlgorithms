package practice.leetcode;

class MaximumNumberofVowelsinaSubstringofGivenLength {

	public static void main(String[] args) {
		System.out.println(maxVowels("weallloveyou", 7));
	}

	private static int maxVowels(String s, int k) {
		int max = 0;
		for (int i = 0; i < k; i++) {
			if (isVowol(s.charAt(i))) {
				max++;
			}
		}
		int now = max;
		for (int i = k; i < s.length(); i++) {
			if (isVowol(s.charAt(i))) {
				now++;
			}
			if (isVowol(s.charAt(i - k))) {
				now--;
			}
			if (now > max) {
				max = now;
			}
		}
		return max;
	}
	
	private static boolean isVowol(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}
}