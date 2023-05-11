package practice.multithreading.basicthread;

public class BasicThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("Hello World from Thread: " + Thread.currentThread().getName());
	}
	
}
