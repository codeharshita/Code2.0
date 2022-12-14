

class OuterNew{
	int x = 10;
	
	class Inner{
		int y = 20;
		public void innerDisplay() {
			System.out.println("This is the inner class. " + x + " " + y);
		}
	}
	
	public void outerDisplay() {
		Inner i = new Inner();
		i.innerDisplay();
		System.out.println(i.y);
	
	}
}



public class NestedInner {

	public static void main(String[] args) {
		
		OuterNew n = new OuterNew();
		n.outerDisplay();
		
		System.out.println();
		
		OuterNew.Inner obj = new OuterNew().new Inner();
		obj.innerDisplay();
		System.out.println(obj.y);
	}

}
