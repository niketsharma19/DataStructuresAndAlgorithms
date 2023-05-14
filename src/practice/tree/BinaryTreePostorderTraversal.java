package practice.tree;

import java.util.ArrayList;
import java.util.List;

import practice.tree.util.TreeNode;

class BinaryTreePostorderTraversal {

	// Example of DFS
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
		System.out.println(postorderTraversal(root));
	}

	private static List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if(root == null) {
			return list;
		}
		postorderTraversalRecursion(root, list);
		return list;
	}

	private static void postorderTraversalRecursion(TreeNode node, List<Integer> list) {
		if (node.left != null) {
			postorderTraversalRecursion(node.left, list);
		}
		if (node.right != null) {
			postorderTraversalRecursion(node.right, list);
		}
		list.add(node.val);
	}
}