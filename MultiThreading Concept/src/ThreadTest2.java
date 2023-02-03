//Implementing multithreading using runnable interface.

class TestThread implements Runnable {

	public void run() {
		System.out.println("Implementing runnable interface.");
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		TestThread t1 = new TestThread();
		Thread t2 = new Thread(t1);
		t2.start();

	}

}
