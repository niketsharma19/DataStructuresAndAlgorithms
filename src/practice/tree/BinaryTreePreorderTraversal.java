package practice.tree;

import java.util.ArrayList;
import java.util.List;

import practice.tree.util.TreeNode;

class BinaryTreePreorderTraversal {

	// Example of DFS
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
		System.out.println(preorderTraversal(root));
	}

	private static List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if(root == null) {
			return list;
		}
		preorderTraversalRecursion(root, list);
		return list;
	}

	private static void preorderTraversalRecursion(TreeNode node, List<Integer> list) {
		list.add(node.val);
		if (node.left != null) {
			preorderTraversalRecursion(node.left, list);
		}
		if (node.right != null) {
			preorderTraversalRecursion(node.right, list);
		}
	}
}