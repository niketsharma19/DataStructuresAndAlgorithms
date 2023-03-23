package practice.leetcode;

import java.util.HashSet;
import java.util.Set;

import practice.leetcode.util.ListNode;

public class LinkedListCycleII {

	public static void main(String[] args) {
		ListNode fourth = new ListNode(-4, null);
		ListNode third = new ListNode(0, fourth);
		ListNode second = new ListNode(2, third);
		ListNode first = new ListNode(3, second);
		fourth.next = second;
		System.out.println(detectCycle(first));
	}

	private static ListNode detectCycle(ListNode head) {
		Set<ListNode> set = new HashSet<>();
		while (head != null && !set.contains(head)) {
			set.add(head);
			head = head.next;
		}
		return head == null ? null : head;
	}
}