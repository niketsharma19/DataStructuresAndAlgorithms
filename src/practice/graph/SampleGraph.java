package practice.graph;

import java.util.ArrayList;
import java.util.List;

public class SampleGraph {

	public static void main(String[] args) {
		System.out.println(getAdjacencyList());
	}

	public static List<List<Integer>> getAdjacencyList() {
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> innerList0 = new ArrayList<>();
		list.add(innerList0);
		List<Integer> innerList1 = new ArrayList<>();
		innerList1.add(2);
		innerList1.add(3);
		innerList1.add(5);
		list.add(innerList1);
		List<Integer> innerList2 = new ArrayList<>();
		innerList2.add(1);
		innerList2.add(5);
		list.add(innerList2);
		List<Integer> innerList3 = new ArrayList<>();
		innerList3.add(1);
		innerList3.add(4);
		list.add(innerList3);
		List<Integer> innerList4 = new ArrayList<>();
		innerList4.add(6);
		innerList4.add(3);
		innerList4.add(5);
		list.add(innerList4);
		List<Integer> innerList5 = new ArrayList<>();
		innerList5.add(1);
		innerList5.add(2);
		innerList5.add(4);
		innerList5.add(6);
		list.add(innerList5);
		List<Integer> innerList6 = new ArrayList<>();
		innerList6.add(4);
		innerList6.add(5);
		list.add(innerList6);
		return list;
	}

	public static int[][] getAdjacencyMatrix() {
		int[][] arr = new int[6][6];
		return arr;
	}

}
