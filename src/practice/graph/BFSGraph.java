package practice.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import practice.util.MyUtil;

public class BFSGraph {

	public static void main(String[] args) {
		bfs(SampleGraph.getAdjacencyList(), 1, 6, 6);
	}

	private static void bfs(List<List<Integer>> list, int src, int dest, int v) {
		int pred[] = new int[v + 1];
		int dist[] = new int[v + 1];
		boolean vist[] = new boolean[v + 1];
		List<Integer> traverse = new ArrayList<>();

		for (int i = 1; i <= v; i++) {
			vist[i] = false;
			pred[i] = -1;
			dist[i] = Integer.MAX_VALUE;
		}

		Queue<Integer> q = new ArrayDeque<>();
		q.offer(src);
		dist[1] = 0;
		pred[1] = -1;

		while (!q.isEmpty()) {
			int val = q.poll();
			traverse.add(val);
			if (!vist[val]) {
				vist[val] = true;
				for (int innerVal : list.get(val)) {
					if (!vist[innerVal] && !q.contains(innerVal)) {
						q.offer(innerVal);
						dist[innerVal] = dist[val] + 1;
						pred[innerVal] = val;
					}
				}
			}
		}

		System.out.println("**************Traversal Order Array***************");
		System.out.println(traverse);

		System.out.println();
		System.out.println("[1, 2, 3, 4, 5, 6] // For below reference");

		System.out.println("**************Distance Array***************");
		MyUtil.printArray(dist, 1, dist.length);

		System.out.println("**************Predicate Array***************");
		MyUtil.printArray(pred, 1, dist.length);
	}

}
