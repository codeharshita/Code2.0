@FunctionalInterface
interface DemoAno{
	public void meth1();
}

interface printName{
	public String print(String name);
}

//class Abc implements DemoAno{
//	public void meth1() {
//		System.out.println("This is method 1.");
//	}
//}


public class LambdaExp2 {

	public static void main(String[] args) {
	
//		Abc a = new Abc();
//		a.meth1();
//		
//		System.out.println();
//		DemoAno dm = new Abc();
//		dm.meth1();
		
		DemoAno dm =()->{
			System.out.println("Hello method");
		};
		
		dm.meth1();
		//Lambda expressions works only with Functional Interface.
		printName p =(str)->{
			return str;
			
		};
		System.out.println(p.print("Alexa"));
	}

}
