package practice.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import practice.tree.util.TreeNode;

class BinaryTreeRightSideView {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
		System.out.println(rightSideView(root));
	}

	private static List<Integer> rightSideView(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		if (root == null) {
			return new ArrayList<>();
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int last = 1;
		while (!queue.isEmpty()) {
			List<Integer> innerList = new ArrayList<>();
			int current = 0;
			for (int i = 0; i < last; i++) {
				TreeNode node = queue.poll();
				innerList.add(node.val);
				if (node.left != null) {
					current++;
					queue.add(node.left);
				}
				if (node.right != null) {
					current++;
					queue.add(node.right);
				}
			}
			last = current;
			current = 0;
			list.add(innerList);
		}
		List<Integer> ret = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			var l = list.get(i);
			ret.add(l.get(l.size() - 1));
		}
		return ret;
	}
}