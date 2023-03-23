package practice.leetcode;

import practice.leetcode.util.ListNode;

class MiddleoftheLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(4, null)));
		System.out.println(middleNode(head).val);
	}

	private static ListNode middleNode(ListNode head) {
		ListNode start = head;
		int length = 0;
		while (start != null) {
			length++;
			start = start.next;
		}
		for (int i = 0; i < (length / 2); i++) {
			head = head.next;
		}
		return head;
	}
}