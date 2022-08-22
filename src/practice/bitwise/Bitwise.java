package practice.bitwise;

public class Bitwise {

	public static void main(String[] args) {
		andOperator();
		xorOperator();
		orOperator();
		notOperator();
		shiftOperator();
	}

	private static void andOperator() {
		int x = 9, y = 8;
		// bitwise and
		// 1001 & 1000 = 1000 = 8
		System.out.println("x & y = " + (x & y));
	}

	private static void xorOperator() {
		int x = 9, y = 8;
		// bitwise XOR
		// 1001 ^ 1000 = 0001 = 1
		System.out.println("x ^ y = " + (x ^ y));
	}

	private static void orOperator() {
		int x = 9, y = 8;
		// bitwise inclusive OR
		// 1001 | 1000 = 1001 = 9
		System.out.println("x | y = " + (x | y));
	}

	private static void notOperator() {
		int x = 2;
		// bitwise compliment
		// ~0010= 1101 = -3
		System.out.println("~x = " + (~x));
		System.out.println("2's Compliment of " + x + " = " + (~x + 1));
	}

	private static void shiftOperator() {
		System.out.println("12 >> 2 = " + (12 >> 2)); // right shifts two bits
		System.out.println("12 << 2 = " + (12 << 2)); // left shifts two bits
	}

}
