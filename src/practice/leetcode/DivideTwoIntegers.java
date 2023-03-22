package practice.leetcode;

class DivideTwoIntegers {

	public static void main(String[] args) {
		System.out.println(divide(2147483647, -1));
	}

	private static long divide(int dividend, int divisor) {
		if(divisor == Integer.MIN_VALUE && dividend == Integer.MIN_VALUE) {
			return 1;
		}
		if (divisor == Integer.MIN_VALUE) {
			return 0;
		}
		boolean isNegative = false;
		long longDividend = dividend;
		long longDivisor = divisor;
		if (longDividend < 0) {
			longDividend = ~longDividend + 1;
			isNegative = !isNegative;
		}
		if (longDivisor < 0) {
			longDivisor = ~longDivisor + 1;
			isNegative = !isNegative;
		}
		long val = 0;
		for (int i = 31; i >= 0; i--) {
			if (longDividend >= (longDivisor << i)) {
				val = val + (1l << i);
				longDividend = longDividend - (longDivisor << i);
			}
		}
		int retVal = 0;
		if (val > Integer.MAX_VALUE) {
			retVal = Integer.MAX_VALUE;
		} else if (val < Integer.MIN_VALUE) {
			retVal = Integer.MIN_VALUE;
		} else {
			retVal = (int) val;
		}
		if (isNegative) {
			if(dividend == Integer.MIN_VALUE && retVal == Integer.MAX_VALUE) {
				retVal = ~retVal;
			}else {
				retVal = ~retVal + 1;
			}
		}
		return retVal;
	}
}