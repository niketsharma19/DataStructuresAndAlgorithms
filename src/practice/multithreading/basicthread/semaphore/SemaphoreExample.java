package practice.multithreading.basicthread.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
	private static Long startTime = System.nanoTime();
	private static final int MAX_AVAILABLE = 3; // Maximum available permits
	private static Semaphore semaphore = new Semaphore(MAX_AVAILABLE, true); // Creating a Semaphore

	public static void main(String[] args) {
		// Creating multiple threads to demonstrate semaphore usage
		for (int i = 1; i <= 5; i++) {
			int threadNum = i;
			Thread thread = new Thread(() -> accessResource(threadNum));
			thread.start();
		}
	}

	private static void accessResource(int threadNum) {
		try {
			System.out.println(
					"Thread " + threadNum + " is trying to acquire a permit. - " + (System.nanoTime() - startTime)/1000000);

			semaphore.acquire(); // Acquiring a permit from the semaphore

			System.out.println("Thread " + threadNum + " acquired a permit.- " + (System.nanoTime() - startTime)/1000000);
			// Simulating some work by the thread
			Thread.sleep(2000);

			System.out.println("Thread " + threadNum + " is releasing the permit.- " + (System.nanoTime() - startTime)/1000000);
			semaphore.release(); // Releasing the permit back to the semaphore
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}