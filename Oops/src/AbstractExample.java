//abstract class.
abstract class Super{
	Super(){
		System.out.println("Print Super.");
	}
	public void meth1() {
		System.out.println("Meth1");
	}
	
	abstract public void meth2();
}
//concrete class.
class Sub extends Super{
	
	@Override
	public void meth2() {
		System.out.println("This is overrided meth2");
	}
	
}

public class AbstractExample {

	public static void main(String[] args) {
		Super s1 = new Sub();//Dynamic method dispatch.
		s1.meth1();
		s1.meth2();

	}

}
