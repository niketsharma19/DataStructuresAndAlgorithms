package practice.interviewbit;

import java.util.ArrayList;

public class MinimumLightstoActivate {
	public int solve(ArrayList<Integer> A, int B) {
		int ans = 0;
		int[] arr = new int[A.size()];
		for (int i = 0; i < arr.length; i++) {
			if (A.get(i) == 1) {
				ans++;
				for (int j = 0; j < 2 * B - 1; j++) {
					int index = i - B + j + 1;
					if (index > -1 && index < arr.length) {
						arr[index] += 1;
					}
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				return -1;
			}
			if (A.get(i) == 1) {
				boolean canOff = true;
				for (int j = 0; j < 2 * B - 1; j++) {
					int index = i - B + j + 1;
					if (index > -1 && index < arr.length && arr[index] == 1) {
						canOff = false;
						break;
					}
				}
				if (canOff) {
					ans--;
					for (int j = 0; j < 2 * B - 1; j++) {
						int index = i - B + j + 1;
						if (index > -1 && index < arr.length) {
							arr[index] -= 1;
						}
					}
				}
			}
		}
		return ans;
	}
}
