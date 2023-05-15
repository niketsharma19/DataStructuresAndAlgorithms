package practice.leetcode;

import practice.leetcode.util.ListNode;

class SwappingNodesinaLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(100, new ListNode(90));
//		ListNode head = new ListNode(7, new ListNode(9, new ListNode(6, new ListNode(6, new ListNode(7,
//				new ListNode(8, new ListNode(3, new ListNode(0, new ListNode(9, new ListNode(5, null))))))))));
		head = swapNodes(head, 2);
		while (head != null) {
			System.out.print(head.val+",");
			head = head.next;
		}
	}
	
	private static ListNode swapNodes(ListNode head, int k) {
		int length = 0;
		ListNode node = head;
		while (node != null) {
			length++;
			node = node.next;
		}
		int left = k;
		int right = length - k + 1;
		if(left == right) {
			return head;
		}
		node = head;
		ListNode leftNode = null;
		ListNode rightNode = null;
		for (int i = 1; i <= Math.max(left, right); i++) {
			if (i == left) {
				leftNode = node;
			}
			if (i == right) {
				rightNode = node;
			}
			node = node.next;
		}
		int temp = leftNode.val;
		leftNode.val = rightNode.val;
		rightNode.val = temp;
		return head;
	}
	
	
	
	
	
	
	
	
	
	
	

//	private static ListNode swapNodes(ListNode head, int k) {
//		int length = 0;
//		ListNode node = head;
//		while (node != null) {
//			length++;
//			node = node.next;
//		}
//		int left = k;
//		int right = length - k + 1;
//		if(left == right) {
//			return head;
//		}
//		node = head;
//		ListNode leftNode = null;
//		ListNode leftPrev = null;
//		ListNode rightNode = null;
//		ListNode rightPrev = null;
//		for (int i = 1; i <= right; i++) {
//			if (i == left) {
//				leftNode = node;
//			}
//			if (leftNode == null) {
//				leftPrev = node;
//			}
//			if (i == right) {
//				rightNode = node;
//			}
//			if (rightNode == null) {
//				rightPrev = node;
//			}
//			node = node.next;
//		}
//		if(leftPrev == null) {
//			rightNode.next = leftNode;
//			leftNode.next = null;
//			head = rightNode;
//			return head;
//		}
//		leftPrev.next = rightNode;
//		if (leftNode.next == rightNode) {
//			leftNode.next = rightNode.next;
//			rightNode.next = leftNode;
//		} else {
//			ListNode temp = rightNode.next;
//			rightNode.next = leftNode.next;
//			rightPrev.next = leftNode;
//			leftNode.next = temp;
//		}
//		return head;
//	}
}