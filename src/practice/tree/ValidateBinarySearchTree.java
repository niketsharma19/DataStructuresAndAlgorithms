package practice.tree;

import practice.tree.util.TreeNode;

class ValidateBinarySearchTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(-2147483648, null, new TreeNode(2147483647));
		System.out.println(isValidBST(root));
	}

	private static boolean isValidBST(TreeNode root) {
		long greater = root.val;
		boolean checkLeft = check(root.left, Long.MIN_VALUE, greater);
		long less = root.val;
		boolean checkRight = check(root.right, less, Long.MAX_VALUE);
		return checkLeft && checkRight;
	}

	private static boolean check(TreeNode node, long less, long greater) {
		if (node == null) {
			return true;
		}
		if (node.val >= greater || node.val <= less) {
			return false;
		}
		return check(node.left, less, node.val) && check(node.right, node.val, greater);
	}

}