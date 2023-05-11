package practice.multithreading.basicthread;

public class BasicThreadExample {

	public static void main(String[] args) {
		// Class Implementation
		new BasicThread().start();
		// Functional Implementation
		new Thread(() -> {
			System.out.println("Hello World from Functional Thread: " + Thread.currentThread().getName());
		}).start();
		System.out.println("Hello World from Main Thread: " + Thread.currentThread().getName());
	}

}
