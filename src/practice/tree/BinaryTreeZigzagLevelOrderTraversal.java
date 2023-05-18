package practice.tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import practice.tree.util.TreeNode;

class BinaryTreeZigzagLevelOrderTraversal {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3, new TreeNode(9, new TreeNode(10), null),
				new TreeNode(20, new TreeNode(15), new TreeNode(7)));
		System.out.println(zigzagLevelOrder(root));
	}

	private static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		if (root == null) {
			return list;
		}
		Deque<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int last = 1;
		boolean straight = true;
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
			straight = !straight;
		}
		for (int i = 1; i < list.size(); i = i + 2) {
			List<Integer> innerList = list.get(i);
			List<Integer> oldList = new ArrayList<>(innerList);
			innerList.clear();
			for (int j = oldList.size() - 1; j >= 0; j--) {
				innerList.add(oldList.get(j));
			}
		}
		return list;
	}

}