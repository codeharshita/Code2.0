interface TestNew{
	
	
	static final int X=  2;
	public abstract void meth1();
	public abstract void meth2();
	public static void meth3() {
		System.out.println("This is method3 for interface Test.");
	}
	
}


public class InterfacePractice {

	public static void main(String[] args) {
		System.out.println(TestNew.X);
		TestNew.meth3();;

	}

}
