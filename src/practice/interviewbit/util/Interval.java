package practice.interviewbit.util;

public class Interval {
	public Integer start;
	public Integer end;

	Interval() {
		start = 0;
		end = 0;
	}

	public Interval(int s, int e) {
		start = s;
		end = e;
	}

	@Override
	public boolean equals(Object obj) {
		Interval interval = (Interval) obj;
		return interval.end == this.end && interval.start == this.start;
	}

	@Override
	public String toString() {
		return "[" + start + ", " + end + "]";
	}

}