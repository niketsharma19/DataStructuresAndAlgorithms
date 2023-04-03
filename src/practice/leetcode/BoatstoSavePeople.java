package practice.leetcode;

import java.util.Arrays;

class BoatstoSavePeople {
	
	public static void main(String[] args) {
		int[] people = {3,5,3,4};
		int limit = 5;
		System.out.println(numRescueBoats(people, limit));
	}
	
	private static int numRescueBoats(int[] people, int limit) {
		int res = 0;
		int n = people.length;
		Arrays.sort(people);
		int start = 0;
		int end = n - 1;
		while (start <= end) {
			if (people[start] + people[end] <= limit) {
				start++;
			}
			end--;
			res++;
		}
		return res;
	}
}