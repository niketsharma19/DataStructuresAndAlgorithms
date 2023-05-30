package practice.hashsetImplementation;

import java.util.LinkedList;
import java.util.List;

class MyHashSet {

	List<Integer>[] arr;

	public MyHashSet() {
		arr = new List[10];
	}

	public void add(int key) {
		if(this.contains(key)) {
			return;
		}
		int hashCode = generateHashCode(key);
		List<Integer> innerArr = arr[hashCode];
		if (innerArr == null) {
			arr[hashCode] = new LinkedList<>();
		}
		arr[hashCode].add(key);
	}

	public void remove(int key) {
		List<Integer> innerArr = arr[generateHashCode(key)];
		if (innerArr != null) {
			for (int i = 0; i < innerArr.size(); i++) {
				if (innerArr.get(i) == key) {
					innerArr.remove(i);
				}
			}
		}
	}

	public boolean contains(int key) {
		List<Integer> innerArr = arr[generateHashCode(key)];
		if (innerArr != null) {
			for (int i = 0; i < innerArr.size(); i++) {
				if (innerArr.get(i) == key) {
					return true;
				}
			}
		}
		return false;
	}

	private int generateHashCode(int key) {
		while (key > 9) {
			key = key / 10;
		}
		return key;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("[ ");
		for (List<Integer> list : arr) {
			if (list != null) {
				for (int val : list) {
					str.append(val + " ");
				}
			}
		}
		str.append("]");
		return str.toString();
	}

}