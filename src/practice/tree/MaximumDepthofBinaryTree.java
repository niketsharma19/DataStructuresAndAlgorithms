package practice.tree;

import practice.tree.util.TreeNode;

class MaximumDepthofBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
		System.out.println(maxDepth(root));
	}

	private static int maxDepth(TreeNode root) {
		return traverse(root, 0);
	}

	private static int traverse(TreeNode root, Integer level) {
		if (root == null) {
			return level;
		}
		level++;
		return Math.max(traverse(root.left, level), traverse(root.right, level));
	}
}
