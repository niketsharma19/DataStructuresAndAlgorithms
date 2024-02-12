package practice.multithreading.basicthread;

public class EvenOddPrinter {
	private static final Object lock = new Object();
	private static int number = 1;
	private static int maxCount = 20;

	public static void main(String[] args) {
		Thread evenThread = new Thread(new EvenPrinter(), "Even Thread");
		Thread oddThread = new Thread(new OddPrinter(), "Odd Thread");

		evenThread.start();
		oddThread.start();
	}

	static class EvenPrinter implements Runnable {
		public void run() {
			while (number <= maxCount) {
				synchronized (lock) {
					if (number % 2 == 0) {
						System.out.println(Thread.currentThread().getName() + ": " + number);
						number++;
						lock.notify(); // Notify the waiting thread (OddPrinter)
					} else {
						try {
							lock.wait(); // Wait for OddPrinter to notify
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}

	static class OddPrinter implements Runnable {
		public void run() {
			while (number <= maxCount) {
				synchronized (lock) {
					if (number % 2 != 0) {
						System.out.println(Thread.currentThread().getName() + ": " + number);
						number++;
						lock.notify(); // Notify the waiting thread (EvenPrinter)
					} else {
						try {
							lock.wait(); // Wait for EvenPrinter to notify
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
}
