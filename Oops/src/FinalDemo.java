 class Test23{
	final int legs = 3;
	final String name = "WQWE";

	final public void show() {
		System.out.println("This is new world.");
	}
}

class Test3 extends Test23{
	public void display() {
		System.out.println("Dislay on th screen.");
	}
}
public class FinalDemo {
	
	final int  MAX ;
	
	// Initialize in instance block.
	
	 
	{
		MAX = 600;
	}
	
	
  public static void main(String[] args) {
		final int D= 45;
		System.out.println(D);
		
		Test3 t1 = new Test3();
		t1.display();
		
		Test23 t2 = new Test23();
		System.out.println(t2.legs);
		System.out.println(t2.name);
		t2.show();
		

	}

}
