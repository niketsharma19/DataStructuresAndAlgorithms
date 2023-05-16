package practice.leetcode;

import practice.leetcode.util.ListNode;

public class SwapNodesinPairs {

	public static void main(String[] args) {
		ListNode head = new ListNode();
		head = swapPairs(head);
		while (head != null) {
			System.out.print(head.val + "  ");
			head = head.next;
		}
	}

	private static ListNode swapPairs(ListNode head) {
		if (head != null && head.next != null) {
			head = swap(head);
			ListNode node = head.next;
			while (node.next != null && node.next.next != null) {
				ListNode temp = node.next;
				node.next = node.next.next;
				node = swap(temp);
				node = node.next;
			}
		}
		return head;
	}

	private static ListNode swap(ListNode node) {
		ListNode temp = node;
		node = node.next;
		temp.next = node.next;
		node.next = temp;
		return node;
	}

}
