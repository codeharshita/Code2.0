/**
 * Multithreading -> it is one of the type of multi-tasking. Here, more than one
 * or two process run or executed simultaneously for maximum utilization of CPU.
 * 
 * Cpu Utilization:- keeping the CPU as busy as possible.
 * 
 * Thread is a class which is present in java.lang package. We can achieve
 * multithreading by using Thread class or Runnable interface. The thread class
 * contains this run() method which is in-built in java , that methods needs to
 * be overrided to change the code functionlaity.
 * 
 * Run is the starting point of thread.
 * while Start is used to execute this run method by creating an object.
 * 
 */

class MyThread extends Thread {

	public void run() {
		System.out.println("This is multithreading.");
	}

}

public class Program1 {

	public static void main(String[] args) {

		MyThread mt = new MyThread();
		mt.start();

	}

}
