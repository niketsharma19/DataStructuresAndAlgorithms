package practice.interviewbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import practice.interviewbit.util.Interval;

public class MergeOverlappingIntervals {

	public static void main(String[] args) {
		List<Interval> intervals = Arrays.asList(new Interval(54, 75), new Interval(56, 60), new Interval(61, 86),
				new Interval(22, 43), new Interval(56, 87), new Interval(32, 53), new Interval(14, 81),
				new Interval(64, 65), new Interval(9, 42), new Interval(12, 33), new Interval(22, 58),
				new Interval(84, 90), new Interval(27, 59), new Interval(41, 48), new Interval(43, 47),
				new Interval(22, 29), new Interval(16, 23), new Interval(41, 72), new Interval(15, 87),
				new Interval(20, 59), new Interval(45, 84), new Interval(14, 77), new Interval(72, 93),
				new Interval(20, 58), new Interval(47, 53), new Interval(25, 88), new Interval(5, 89),
				new Interval(34, 97), new Interval(14, 47));
		intervals.sort((i1, i2) -> i1.start - i2.start);
		ArrayList<Interval> ans = new ArrayList<>();
		ans.add(intervals.get(0));
		for (int i = 1; i < intervals.size(); i++) {
			Interval inter = intervals.get(i);
			boolean isOverlapped = false;
			for (Interval in : ans) {
				if (Math.max(in.start, inter.start) <= Math.min(in.end, inter.end)) {
					in.start = Math.min(in.start, inter.start);
					in.end = Math.max(in.end, inter.end);
					isOverlapped = true;
					inter = in;
				}
			}
			if (!isOverlapped) {
				ans.add(intervals.get(i));
			}
		}
		System.out.println(ans);
	}

}
