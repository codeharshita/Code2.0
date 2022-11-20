//abstract class.
abstract class Super{
	Super(){
		System.out.println(" Super Cnstructor.");
	}
	public void meth1() {
		System.out.println("Meth1");
	}
	
	//abstract method.
	abstract public void meth2();
}
//concrete class.
class Sub extends Super{
	
	Sub(){
		System.out.println("Sub constructor");
	}
	
	
	//Method overriding
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
