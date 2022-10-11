package practice.leetcode;

import practice.leetcode.util.ListNode;

public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
		ListNode reversed = reverseList(head);
		while (reversed != null) {
			System.out.println(reversed.val);
			reversed = reversed.next;
		}
	}

	private static ListNode reverseList(ListNode head) {
		if(head == null) {
			return head;
		}
		ListNode last = head;
        ListNode current = head.next;
        head.next = null;
        head = current;
        
        while (head != null){
            ListNode next = head.next;
            head.next = last;
            last = head;
            head = next;
        }
        
        return last;
	}

}
