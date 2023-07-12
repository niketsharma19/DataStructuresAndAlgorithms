package practice.util;

public class MyUtil {

	public static void printArray(int[] arr, int start, int end) {
		System.out.print("[");
		for (int i = start; i < end; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

}
