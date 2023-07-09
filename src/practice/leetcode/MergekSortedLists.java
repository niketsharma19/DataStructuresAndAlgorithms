package practice.leetcode;

import java.util.PriorityQueue;

import practice.leetcode.util.ListNode;

class MergekSortedLists {

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1, new ListNode(4, new ListNode(5, null)));
		ListNode node2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
		ListNode node3 = new ListNode(2, new ListNode(6, null));
		ListNode[] lists = {};
		ListNode node = mergeKLists(lists);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

	private static ListNode mergeKLists(ListNode[] lists) {
		if(lists.length == 0) {
			return null;
		}
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for (int i = 0; i < lists.length; i++) {
			ListNode node = lists[i];
			while (node != null) {
				q.offer(node.val); // log(length)
				node = node.next;
			}
		}
		ListNode n = new ListNode();
		ListNode temp = n;
		int size = q.size();
		for (int i = 0; i < size; i++) {
			temp.val = q.poll();
			if (i != size - 1) {
				temp.next = new ListNode();
			}
			temp = temp.next;
		}
		return n;
	}
}