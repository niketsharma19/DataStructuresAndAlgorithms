package practice.tree;

import practice.tree.util.TreeNode;

public class DiameterofBinaryTree {

	static int max;

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
		System.out.println(diameterOfBinaryTree(root));
	}

	private static int diameterOfBinaryTree(TreeNode root) {
		traverse(root);
		return max;
	}

	private static int traverse(TreeNode node) {
		if (node == null) {
			return 0;
		}

		int left = traverse(node.left);
		int right = traverse(node.right);

		max = Math.max(left + right, max);

		return Math.max(left, right) + 1;
	}

}
