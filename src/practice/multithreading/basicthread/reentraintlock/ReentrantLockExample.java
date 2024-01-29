package practice.multithreading.basicthread.reentraintlock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
	private final ReentrantLock lock = new ReentrantLock();
	private final Condition condition = lock.newCondition();
	private int sharedResource = 0;

	private long getElapsedTime() {
		return System.currentTimeMillis();
	}

	public void performTask() {
		lock.lock(); // Acquire the lock
		long startTime = getElapsedTime();
		try {
			// Critical section
			sharedResource++;
			System.out.println(
					"[" + (getElapsedTime() - startTime) + " ms] Task performed. Shared resource: " + sharedResource);

			// Example of using condition variables
			while (sharedResource < 5) {
				// If sharedResource is less than 5, wait for a signal on the condition
				System.out.println(
						"[" + (getElapsedTime() - startTime) + " ms] Waiting for sharedResource to reach 5...");
				condition.await();
			}

			// More operations after sharedResource reaches 5
			System.out.println("[" + (getElapsedTime() - startTime) + " ms] Shared resource reached 5!");

			// Perform some other actions...

			// Signal other threads waiting on the condition
			condition.signalAll();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		} finally {
			lock.unlock(); // Release the lock in the finally block
		}
	}

	public void performAnotherTask() {
		lock.lock(); // Acquire the lock
		long startTime = getElapsedTime();
		try {
			// Critical section
			sharedResource--;
			System.out.println("[" + (getElapsedTime() - startTime) + " ms] Another task performed. Shared resource: "
					+ sharedResource);

			// Signal that the sharedResource has been updated
			condition.signal();
		} finally {
			lock.unlock(); // Release the lock in the finally block
		}
	}

	public static void main(String[] args) {
		ReentrantLockExample example = new ReentrantLockExample();

		// Perform a task
		new Thread(() -> example.performTask()).start();

		// Perform another task
		new Thread(() -> example.performAnotherTask()).start();
	}
}
