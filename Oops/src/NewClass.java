class OldClass{
	
	public void display() {
		System.out.println("Display the solution on the screen");
	}
	
	/**
	 * Suggestes the programmer not to use it as he/she can use the alternative option.
	 * 
	 * */
	@Deprecated
	public void show() {
		System.out.println("Show the result on th screen.");
	}
	
}
public class NewClass {

	public static void main(String[] args) {
		OldClass o= new OldClass();
		o.display();
		o.show();
		

	}

}
