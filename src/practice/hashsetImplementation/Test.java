package practice.hashsetImplementation;

public class Test {

	public static void main(String[] args) {
		int key = 10;
		MyHashSet obj = new MyHashSet();
		obj.add(key);
		obj.remove(key);
		boolean param_3 = obj.contains(key);
	}

}
