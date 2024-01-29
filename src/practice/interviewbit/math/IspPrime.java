package practice.interviewbit.math;

public class IspPrime {

	public static void main(String[] args) {
		int A = 84923;
		int n = (int) Math.sqrt(A) + 1;
		for (int i = 2; i <= n; i++) {
			if (A % i == 0) {
				return;
			}
		}
		return;
	}

}
