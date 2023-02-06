class MyClass extends Thread{
	
	public MyClass(String name) {
		super(name);
		setPriority(Thread.MIN_PRIORITY+2);
	}
}
public class ThreadTest6 {

	public static void main(String[] args) {
		MyClass mg = new MyClass("My thread");
		System.out.println("Name "+ mg.getName());
		System.out.println("Id "+mg.getId());
		System.out.println("Priority "+mg.getPriority()+ " is the given priority.");
		mg.start();
		System.out.println("State "+mg.getState());
		
	}

}
