package practice.leetcode;

public class IsPowerOfFour {

	public static void main(String[] args) {
		System.out.println(isPowerOfFour(8));
	}

	public static boolean isPowerOfFour(int n) {
		if (n <= 0) {
			return false;
		}
		if (n == 1) {
			return true;
		}
		while (n > 1) {
			if(n%4 == 0) {
				n = n / 4;
			}else {
				return false;
			}
		}
		return true;
	}

}
