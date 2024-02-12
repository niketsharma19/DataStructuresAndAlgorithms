package practice.gfg;

public class SmallestNumberDigitSum {

	public static void main(String[] args) {
		System.out.println(new SmallestNumberDigitSum().smallestNumberDigitSum(34));
	}

	private int smallestNumberDigitSum(int N) {
		int ans = 0;
		int len = 0;
		while (N >= 9) {
			ans = (int) (ans + 9 * Math.pow(10, len));
			N = N - 9;
			len++;
		}
		ans = (int) (ans + N * Math.pow(10, len));
		return ans;
	}

}
