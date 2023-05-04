package practice.tree;

import java.util.ArrayList;
import java.util.List;

import practice.tree.util.TreeNode;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
		System.out.println(levelOrder(root));
	}

	private static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		traverse(root, list, -1);
		return list;
	}

	private static void traverse(TreeNode root, List<List<Integer>> list, int level) {
		if (root == null) {
			return;
		}
		level++;
		if (list.size() > level) {
			list.get(level).add(root.val);
		} else {
			List<Integer> innerList = new ArrayList<>();
			innerList.add(root.val);
			list.add(innerList);
		}
		traverse(root.left, list, level);
		traverse(root.right, list, level);
	}
}
