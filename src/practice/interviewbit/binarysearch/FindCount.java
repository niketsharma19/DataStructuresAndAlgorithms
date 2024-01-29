package practice.interviewbit.binarysearch;

public class FindCount {

	public static void main(String[] args) {
		int[] A = { 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 8, 8, 9, 9, 10, 10,
				10 };
		System.out.println(new FindCount().findCount(A, 2));
	}

	// DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
	public int findCount(final int[] A, int B) {
		int end = A.length;
		int start = 0;
		return binary(A, B, end, start);
	}

	private int binary(int[] A, int B, int end, int start) {
		if (end < start) {
			return 0;
		}
		int c = 0;
		int mid = (end - start) / 2 + start;
		if (A[mid] == B) {
			c++;
			int i = 1;
			while (mid + i < A.length && A[mid + i] == B) {
				c++;
				i++;
			}
			i = 1;
			while (mid - i >= 0 && A[mid - i] == B) {
				c++;
				i++;
			}
			return c;
		}
		if (A[mid] > B) {
			return binary(A, B, mid - 1, start) + c;
		} else {
			return binary(A, B, end, mid + 1) + c;
		}
	}
}