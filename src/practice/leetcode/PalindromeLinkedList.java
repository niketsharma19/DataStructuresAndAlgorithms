package practice.leetcode;

import java.util.ArrayList;
import java.util.List;

import practice.leetcode.util.ListNode;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
		System.out.println(isPalindrome(head));
	}

	public static boolean isPalindrome(ListNode head) {
		List<Integer> list = new ArrayList<>();
		while (head != null) {
			list.add(head.val);
			head = head.next;
		}
		int j = list.size() - 1;
		for (int i = 0; i < list.size()/2; i++) {
			if (list.get(i) != list.get(j)) {
				return false;
			}
			j--;
		}
		return true;
	}

}
