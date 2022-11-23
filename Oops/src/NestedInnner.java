class Outer{
	int x = 10;
	

	class Inner{
		int y = 23;
		
		public void InnerDisplay() {
			System.out.println(x);
			System.out.println("Displayed Method is "+ x + " " + y);
		}
	}
	
	public void outerDisplay() {
		Inner i = new Inner();
		System.out.println(i.y);
		i.InnerDisplay();
	}
}
public class NestedInnner {

	public static void main(String[] args) {
		//Outer class object declaration
		Outer t = new Outer();
		t.outerDisplay();
		
		System.out.println();
		//Inner class object dclaration.
		Outer.Inner oi = new Outer().new Inner();
		oi.InnerDisplay();
		
	}

}
