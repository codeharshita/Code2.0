 interface Test{
	
	void meth1();
	void meth2();
} 

class MyTest implements Test{
	@Override
	public void meth1() {
		System.out.println("This is my method 1");
	}
	@Override
	public void meth2() {
		System.out.println("This is my method 2");
		
	}
	
	public void meth3() {
		System.out.println("This is my new method 3");
	}
}

public class InterfacePractise {

	public static void main(String[] args) {
		Test t = new MyTest();
		t.meth1();
		t.meth2();
		
		
	}

}
