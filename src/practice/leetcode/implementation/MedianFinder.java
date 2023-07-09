package practice.leetcode.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class MedianFinder {

	public static void main(String[] args) {
		MedianFinder obj = new MedianFinder();
		obj.addNum(-1);
		obj.addNum(-2);
		double param_1 = obj.findMedian();
		System.out.println(param_1);
		obj.addNum(-3);
		obj.addNum(-4);
		double param_2 = obj.findMedian();
		System.out.println(param_2);
	}

	PriorityQueue<Integer> q;

	public MedianFinder() {
		q = new PriorityQueue<>();
	}

	public void addNum(int num) {
		q.add(num);
	}

	public double findMedian() {
		double ans = 0d;
		int size = q.size();
		if (size % 2 == 0) {
			double a = 0;
			double b = 0;
			for (int i = 0; i < size; i++) {
				if (size / 2 == i) {
					a = q.poll();
				} else if (size / 2 == i + 1) {
					b = q.poll();
				} else {
					q.poll();
				}
			}
			ans = (a + b) / 2;
		} else {
			for (int i = 0; i < size / 2 + 1; i++) {
				ans = q.poll();
			}
		}
		return ans;
	}
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder(); obj.addNum(num); double param_2 =
 * obj.findMedian();
 */