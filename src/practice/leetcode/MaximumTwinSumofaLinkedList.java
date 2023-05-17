package practice.leetcode;

import practice.leetcode.util.ListNode;

class MaximumTwinSumofaLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
		System.out.println(pairSum(head));
	}

	private static int pairSum(ListNode head) {
		ListNode temp = head;
		ListNode last = reverseList(temp);
		temp = head;
		int len = 0;
		while (temp != null) {
			len++;
			temp = temp.next;
		}
		int max = 0;
		for (int i = 0; i < len / 2; i++) {
			int val = head.val + last.val;
			if (max < val) {
				max = val;
			}
			head = head.next;
			last = last.next;
		}
		return max;
	}

	private static ListNode reverseList(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode newHead = head;
		ListNode last = head;
		ListNode current = head.next;
		newHead.next = null;
		newHead = current;

		while (head != null) {
			ListNode next = head.next;
			newHead.next = last;
			last = head;
			newHead = next;
		}

		return last;
	}
}