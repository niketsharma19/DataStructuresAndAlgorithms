package practice.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import practice.interviewbit.util.Interval;

public class MergeIntervals {

	public static void main(String[] args) {
		List<Interval> intervals = Arrays.asList(new Interval(137207, 1734370), new Interval(5057723, 5365773),
				new Interval(6997657, 7282669), new Interval(7992707, 8945780), new Interval(13205169, 13286380),
				new Interval(13478080, 14361199), new Interval(14648047, 16875188), new Interval(17296166, 19089625),
				new Interval(20424412, 20617334), new Interval(21947854, 23077086), new Interval(24901000, 26346402),
				new Interval(26650724, 27196856), new Interval(28896156, 29975691), new Interval(30071726, 31373629),
				new Interval(32397799, 33159528), new Interval(33305337, 35470848), new Interval(35720431, 37452993),
				new Interval(39147629, 40818780), new Interval(40930468, 41652526), new Interval(41938404, 44430212),
				new Interval(48114813, 48611161), new Interval(50335149, 51023917), new Interval(51878891, 52987379),
				new Interval(53902725, 54359910), new Interval(56661881, 58671175), new Interval(59326619, 61927945),
				new Interval(63215257, 63817507), new Interval(64968095, 65653303), new Interval(66634969, 67941460),
				new Interval(69980615, 71436951), new Interval(71564309, 74681566), new Interval(75530199, 76592769),
				new Interval(76988511, 77454928), new Interval(77665838, 78087358), new Interval(78229841, 79535243),
				new Interval(81250676, 82624050), new Interval(83142364, 84255671), new Interval(84379892, 84668384),
				new Interval(84954893, 85392199), new Interval(87804458, 90457067), new Interval(90760520, 91607160),
				new Interval(92361716, 92692045), new Interval(95399553, 97983139), new Interval(99776803, 99818745));
		Interval newInterval = new Interval(16197462, 108785977);

		if (intervals.size() == 0) {
			intervals.add(newInterval);
			System.out.println(intervals);
		}
		Set<Interval> list = new HashSet<>();
		for (int i = 0; i < intervals.size(); i++) {
			Interval inter = intervals.get(i);
			if (Math.max(inter.start, newInterval.start) < Math.min(inter.end, newInterval.end)) {
				list.add(inter);
			}
		}
		if (list.size() == 0) {
			if (newInterval.end < intervals.get(0).start) {
				intervals.add(0, newInterval);
				System.out.println(intervals);
			} else if (intervals.get(intervals.size() - 1).end < newInterval.start) {
				intervals.add(newInterval);
				System.out.println(intervals);
			}
		}
		list.add(newInterval);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (Interval l : list) {
			min = Math.min(min, l.start);
			max = Math.max(max, l.end);
		}
		Interval overlap = new Interval(min, max);
		ArrayList<Interval> ans = new ArrayList<>();
		boolean isAdded = false;
		for (int i = 0; i < intervals.size(); i++) {
			Interval inter = intervals.get(i);
			if (!list.contains(inter)) {
				if (inter.start > overlap.end && !isAdded) {
					ans.add(overlap);
					isAdded = true;
				}
				ans.add(inter);
			}
		}
		if (ans.size() == 0 || !isAdded) {
			ans.add(overlap);
		}
		System.out.println(ans);
	}

}