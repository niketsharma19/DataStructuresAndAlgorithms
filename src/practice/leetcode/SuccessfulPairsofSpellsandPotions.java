package practice.leetcode;

import java.util.Arrays;

public class SuccessfulPairsofSpellsandPotions {

	public static void main(String[] args) {
		int[] spells = { 5, 1, 3 };
		int[] potions = { 1, 2, 3, 4, 5 };
		Arrays.stream(successfulPairs(spells, potions, 7)).forEach(System.out::println);
	}

	private static int[] successfulPairs(int[] spells, int[] potions, long success) {
		int[] res = new int[spells.length];
		Arrays.sort(potions);
		for (int i = 0; i < spells.length; i++) {
			int left = 0;
			int right = potions.length - 1;
			while (left <= right) {
				int mid = left + (right - left) / 2;
				long product = (long) spells[i] * potions[mid];
				if (product >= success) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
			res[i] = potions.length - left;
		}
		return res;
	}
}
