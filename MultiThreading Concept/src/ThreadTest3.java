
class MyNew extends Thread {
	public void run() {
		int i = 1;
		while (true) {
			System.out.println(i + " Hello ");
			i++;
		}
	}
}

public class ThreadTest3 {

	public static void main(String[] args) {
		MyNew mt = new MyNew();
		mt.start();

		int i = 1;
		while (true)
			System.out.println(i + " World ");

	}

}
