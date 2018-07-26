class AlphaThread1 implements Runnable {
	public void run() {
		for (char c = 'a'; c <= 'e'; c++) {
			System.out.print(c + " ");
		}
	}
}

class NumberThread1 implements Runnable {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.print(i + " ");
		}
	}
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		Thread at = new Thread(new AlphaThread1());
		Thread nt = new Thread(new NumberThread1());
		at.start();
		nt.start();
		Thread.currentThread().getName();

// at.run();
	}

}
