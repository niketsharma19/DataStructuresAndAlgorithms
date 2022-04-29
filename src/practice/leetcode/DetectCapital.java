package practice.leetcode;

public class DetectCapital {
	
	private static String word = "apple";

	public static void main(String[] args) {
		char[] wordArr = word.toCharArray();
		if(wordArr[0] >= 65 &&  wordArr[0] <= 90) {
			// First Letter is Capital
			if(ifAllCaps(wordArr)) {
				// All Letters are Capital
				System.out.println(true + " All Caps");
			} else {
				// Camel Case
				System.out.println(ifCamelCase(wordArr) + " Camel Case");
			}
		} else {
			// All Letters are small
			System.out.println(ifAllSmall(wordArr) + " Small Caps");
		}
	}
	
	private static boolean ifCamelCase(char[] wordArr) {
		return ifAllSmall(word.substring(1).toCharArray());
	}

	private static boolean ifAllCaps(char[] wordArr) {
		for(char ch : wordArr) {
			if(ch < 65 || ch > 90) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean ifAllSmall(char[] wordArr) {
		for(char ch : wordArr) {
			if(ch < 97 || ch > 122) {
				return false;
			}
		}
		return true;
	}

}
