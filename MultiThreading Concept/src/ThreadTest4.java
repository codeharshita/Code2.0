class A extends Thread {
	public void run() {
		System.out.println("This is my thread class.");
	}
}

public class ThreadTest4 {

	public static void main(String[] args) {
		A a = new A();
		// You can't call a thread twice OR else it willthrow illegalThreadStateException.
		a.start();
		a.start();

	}

}
