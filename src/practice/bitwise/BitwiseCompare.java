package practice.bitwise;

public class BitwiseCompare {

	public static void main(String[] args) {
		long a1 = 1;
		long a2 = 1;
		long startTime1 = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			a1 = a1 << 1;
		}
		long endTime1 = System.nanoTime();
		long totalTime1 = endTime1 - startTime1;
		System.out.println(totalTime1);
		//
		long startTime2 = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			a2 = a2 * 2;
		}
		long endTime2 = System.nanoTime();
		long totalTime2 = endTime2 - startTime2;
		System.out.println(totalTime2);
	}

}
