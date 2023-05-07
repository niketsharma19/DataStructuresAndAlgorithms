package practice.tree;

import practice.tree.util.TreeNode;

class InvertBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)),
				new TreeNode(7, new TreeNode(6), new TreeNode(9)));
		System.out.println(BinaryTreeLevelOrderTraversal.levelOrderTravesal(root));
		System.out.println(BinaryTreeLevelOrderTraversal.levelOrderTravesal(invertTree(root)));
	}

	private static TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return root;
		}
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		invertTree(root.left);
		invertTree(root.right);
		return root;
	}
}