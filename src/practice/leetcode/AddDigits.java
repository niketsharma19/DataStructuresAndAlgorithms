package practice.leetcode;

class AddDigits {

	public static void main(String[] args) {
		System.out.println(addDigits(38));
	}

	private static int addDigits(int num) {
		int ans = recure(num);
		while (ans >= 10) {
			ans = recure(ans);
		}
		return ans;
	}

	private static int recure(int num) {
		int ans = 0;
		while (num > 0) {
			ans = ans + num % 10;
			num = num / 10;
		}
		return ans;
	}
}