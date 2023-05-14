package practice.tree;

import java.util.ArrayList;
import java.util.List;

import practice.tree.util.TreeNode;

class BinaryTreeInorderTraversal {

	// Example of DFS
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
		System.out.println(inorderTraversal(root));
	}

	private static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if(root == null) {
			return list;
		}
		inorderTraversalRecursion(root, list);
		return list;
	}

	private static void inorderTraversalRecursion(TreeNode node, List<Integer> list) {
		if (node.left != null) {
			inorderTraversalRecursion(node.left, list);
		}
		list.add(node.val);
		if (node.right != null) {
			inorderTraversalRecursion(node.right, list);
		}
	}
}