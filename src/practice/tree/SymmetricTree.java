package practice.tree;

import practice.tree.util.TreeNode;

class SymmetricTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
				new TreeNode(2, new TreeNode(4), new TreeNode(3)));
		System.out.println(isSymmetric(root));
	}

	private static boolean isSymmetric(TreeNode root) {
		return checkSymmetric(root.left, root.right);
	}

	private static boolean checkSymmetric(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		}
		if (left != null && right != null && left.val == right.val) {
			return checkSymmetric(left.left, right.right) && checkSymmetric(left.right, right.left);
		} else {
			return false;
		}
	}
}