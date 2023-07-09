package practice.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class TopKFrequentElements {
	
	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				Integer value = map.get(nums[i]);
				value++;
				map.replace(nums[i], value);
			} else {
				map.put(nums[i], 1);
			}
		}
		Queue<Pair> q = new PriorityQueue<>((p1, p2) -> {
			return p1.freq < p2.freq ? 1 : -1;
		});
		map.entrySet().stream().map(x -> {
			return new Pair(x.getValue(), x.getKey());
		}).forEach(x -> {
			q.add(x);
		});
		int[] arr = new int[k];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = q.poll().val;
		}
		return arr;
	}

	public class Pair {

		public int freq;
		public int val;

		public Pair(int freq, int val) {
			this.freq = freq;
			this.val = val;
		}

	}
}
