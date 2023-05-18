package practice.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import practice.tree.util.TreeNode;

public class BinaryTreeLevelOrderTraversal {

	// Example of BFS
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3, new TreeNode(9, new TreeNode(10), null),
				new TreeNode(20, new TreeNode(15), new TreeNode(7)));
		for (var list : levelOrderTravesal(root)) {
			System.out.println(list);
		}
	}

	public static Object[] levelOrderTravesal(TreeNode root) {
		List<List<Integer>> list1 = new ArrayList<>();
		traverseUsingDFS(root, list1, -1);
		List<List<Integer>> list2 = new ArrayList<>();
		traverseUsingQueue(root, list2);
		Object[] obj = { list1, list2 };
		return obj;
	}

	private static void traverseUsingQueue(TreeNode root, List<List<Integer>> list) {
		if(root == null) {
			return;
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
	}

	// Using DFS thus have to use level
	private static void traverseUsingDFS(TreeNode root, List<List<Integer>> list, int level) {
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
		traverseUsingDFS(root.left, list, level);
		traverseUsingDFS(root.right, list, level);
	}
}
