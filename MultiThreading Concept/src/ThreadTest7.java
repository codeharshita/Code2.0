class MyClass2 extends Thread {

	public MyClass2(String name) {
		super(name);
	}

	public void run() {
		int count = 1;
		while (true) {
			System.out.println(count++);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}

public class ThreadTest7 {

	public static void main(String[] args) {
		MyClass2 obj = new MyClass2(" I AM THREAD.");
		obj.start();
		obj.interrupt();

	}

}
