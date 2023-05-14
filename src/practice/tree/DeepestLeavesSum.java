package practice.tree;

import practice.tree.util.TreeNode;

class DeepestLeavesSum {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, new TreeNode(7), null), new TreeNode(5)),
				new TreeNode(3, null, new TreeNode(6, null, new TreeNode(8))));
		System.out.println(deepestLeavesSum(root));
	}

	private static int deepestLeavesSum(TreeNode root) {
		Integer[] val = { 0, 0 };
		traverse(root, val, 0);
		return val[1];
	}

	private static void traverse(TreeNode node, Integer[] val, int currentLevel) {
		if (node == null) {
			return;
		}
		if (val[0] < currentLevel) {
			val[1] = 0;
			val[0] = val[0] + 1;
		}
		if (currentLevel == val[0]) {
			val[1] = val[1] + node.val;
		}
		currentLevel++;
		traverse(node.left, val, currentLevel);
		traverse(node.right, val, currentLevel);
	}
}