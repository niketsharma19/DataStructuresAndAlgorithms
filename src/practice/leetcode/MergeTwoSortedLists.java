package practice.leetcode;

import practice.leetcode.util.ListNode;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
		ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
		ListNode result = mergeTwoLists(list1, list2);
		while(result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//		if(list1 == null && list2 == null) {
//			return null;
//		}
		ListNode head = null;
		ListNode list = null;
		while (list1 != null || list2 != null) {
			if(head == null) {
				head = new ListNode();
				list = head;
			} else if(list.next == null) {
				list.next = new ListNode();
				list = list.next;
			}
			if (list1 == null) {
				list.val = list2.val;
				list2 = list2.next;
			} else if (list2 == null) {
				list.val = list1.val;
				list1 = list1.next;
			} else if (list1.val > list2.val) {
				list.val = list2.val;
				list2 = list2.next;
			} else {
				list.val = list1.val;
				list1 = list1.next;
			}
		}
		return head;
	}
}
