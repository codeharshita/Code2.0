class MyRun implements Runnable{
	public void run() {
		System.out.println("My run");
	}
}
public class ThreadTest5 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRun());
		t1.setPriority(10);
		System.out.println(t1.getState());
		System.out.println(t1.getPriority());
		

	}

}
